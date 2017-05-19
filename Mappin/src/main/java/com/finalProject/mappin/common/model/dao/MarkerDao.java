package com.finalProject.mappin.common.model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.finalProject.mappin.common.model.vo.Marker;
import com.oracle.jrockit.jfr.ContentType;






@Repository("markerDao")
public class MarkerDao {
	
	// tag값의 정보를 가져오는 메소드
	private static String getTagValue(String tag, Element eElement) {
		if(eElement.getElementsByTagName(tag).item(0)==null){
			return null;
		}
	    NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
	
	    Node nValue = (Node) nlList.item(0);
	    if(nValue == null) 
	        return null;
	    return nValue.getNodeValue();
	}	

	@Autowired
	private SqlSession sqlSession;

	public MarkerDao() {
	}

	
	public List<Marker> selectList(int page,String keyword){
		ArrayList<Marker> list = new ArrayList<Marker>();
		int[] contentType = {12,32,39};
		try{
			for (int i = 0; i < contentType.length; i++) {
			// parsing할 url 지정(API 키 포함해서)
			String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=EtQZrT3XWKN7DoWis1UglcjHhWzqoZPFUDlrOtmsdW%2FtWbWJM8hvCdoomDs4x0UlEePVSxkQ8N1xjlPeuHgyPA%3D%3D&contentTypeId="+contentType[i]+"&areaCode=39&sigunguCode=&cat1=&cat2=&cat3=&listYN=Y&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&arrange=A&numOfRows=500";
			
			DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
			Document doc = dBuilder.parse(url);
			
			// root tag 
			doc.getDocumentElement().normalize();
			// 파싱할 tag
			NodeList nList = doc.getElementsByTagName("item");
			
			for(int temp = 0; temp < nList.getLength(); temp++){
				Marker mk=new Marker();
				Node nNode = nList.item(temp);
				if(nNode.getNodeType() == Node.ELEMENT_NODE){
					Element eElement = (Element) nNode;
					mk.setMARKER_ADDRESS(getTagValue("addr1", eElement));
					if(getTagValue("firstimage",eElement)==null){
					}else{
						mk.setMARKER_IMG(getTagValue("firstimage", eElement));
					}	
					if(getTagValue("mapx", eElement)==null){
						
					}else{
						mk.setMAP_X(Double.valueOf(getTagValue("mapx", eElement)));
						mk.setMAP_Y(Double.valueOf(getTagValue("mapy", eElement)));
					}
					mk.setMARKER_NAME(getTagValue("title", eElement));
					mk.setCONTENT_ID(Integer.parseInt(getTagValue("contentid", eElement)));
					mk.setCONTENT_TYPE(Integer.parseInt(getTagValue("contenttypeid", eElement)));
					list.add(mk);
				}	//for end
			}//if end
			}	//for end
	} catch (Exception e){	
		e.printStackTrace();
	}	// try~catch end
	String[] keywords=keyword.split(" ");
	ArrayList<Marker> titleCheck=titleCheck(0, keywords, list,null);
	ArrayList<Marker> addCheck=addressCheck(0, keywords, list,null);
	list= new ArrayList<Marker>();
	list.addAll(titleCheck);
	list.addAll(addCheck);
	int start=0,end=list.size();
	List<Marker> pageList;
	if(page==1){
		if(end>12){
			pageList= list.subList(start, 12);
		}else{
			 pageList=list.subList(start, end);

		}
	}else{
		page--;
		if(end>(page+1)*12){
			pageList=  list.subList(page*12, (page+1)*12);
		}else{
			pageList= list.subList(page*12, end);
		}
	}
	return pageList;	
	}
	
	public List<Marker> selectList(int page, int contentType) {
		ArrayList<Marker> list = new ArrayList<Marker>();
		
		// 페이지 초기값 
	try{
			// parsing할 url 지정(API 키 포함해서)
			String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=EtQZrT3XWKN7DoWis1UglcjHhWzqoZPFUDlrOtmsdW%2FtWbWJM8hvCdoomDs4x0UlEePVSxkQ8N1xjlPeuHgyPA%3D%3D&contentTypeId="+contentType+"&areaCode=39&sigunguCode=&cat1=&cat2=&cat3=&listYN=Y&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&arrange=A&numOfRows=12&pageNo="+page;
			
			DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
			Document doc = dBuilder.parse(url);
			
			// root tag 
			doc.getDocumentElement().normalize();
			// 파싱할 tag
			NodeList nList = doc.getElementsByTagName("item");
			
			for(int temp = 0; temp < nList.getLength(); temp++){
				Marker mk=new Marker();
				Node nNode = nList.item(temp);
				if(nNode.getNodeType() == Node.ELEMENT_NODE){
					
					
					Element eElement = (Element) nNode;
					
					mk.setMARKER_ADDRESS(getTagValue("addr1", eElement));
					if(getTagValue("firstimage",eElement)==null){
					}else{
						mk.setMARKER_IMG(getTagValue("firstimage", eElement));
					}	
					if(getTagValue("mapx", eElement)==null){
						
					}else{
						mk.setMAP_X(Double.valueOf(getTagValue("mapx", eElement)));
						mk.setMAP_Y(Double.valueOf(getTagValue("mapy", eElement)));
					}
					mk.setMARKER_NAME(getTagValue("title", eElement));
					mk.setCONTENT_ID(Integer.parseInt(getTagValue("contentid", eElement)));
					mk.setCONTENT_TYPE(Integer.parseInt(getTagValue("contenttypeid", eElement)));
					list.add(mk);
				}	// for end
			}	// if end
	} catch (Exception e){	
		e.printStackTrace();
	}	// try~catch end
	
	return list;	
	}
	
	public List<Marker> selectList(int page, int contentType,String keyword) {
		ArrayList<Marker> list = new ArrayList<Marker>();

		// 페이지 초기값 
	try{
			// parsing할 url 지정(API 키 포함해서)
			String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=EtQZrT3XWKN7DoWis1UglcjHhWzqoZPFUDlrOtmsdW%2FtWbWJM8hvCdoomDs4x0UlEePVSxkQ8N1xjlPeuHgyPA%3D%3D&contentTypeId="+contentType+"&areaCode=39&sigunguCode=&cat1=&cat2=&cat3=&listYN=Y&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&arrange=A&numOfRows=500";
			
			DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
			Document doc = dBuilder.parse(url);
			
			// root tag 
			doc.getDocumentElement().normalize();
			// 파싱할 tag
			NodeList nList = doc.getElementsByTagName("item");
			
			for(int temp = 0; temp < nList.getLength(); temp++){
				Marker mk=new Marker();
				Node nNode = nList.item(temp);
				if(nNode.getNodeType() == Node.ELEMENT_NODE){
					Element eElement = (Element) nNode;
					mk.setMARKER_ADDRESS(getTagValue("addr1", eElement));
					if(getTagValue("firstimage",eElement)!=null){
						mk.setMARKER_IMG(getTagValue("firstimage", eElement));
					}	
					if(getTagValue("mapx", eElement)!=null){
						mk.setMAP_X(Double.valueOf(getTagValue("mapx", eElement)));
						mk.setMAP_Y(Double.valueOf(getTagValue("mapy", eElement)));
					}
					if(getTagValue("tel",eElement)!=null){
						mk.setMARKER_TEL(getTagValue("tel",eElement));
					}
					mk.setMARKER_NAME(getTagValue("title", eElement));
					mk.setCONTENT_ID(Integer.parseInt(getTagValue("contentid", eElement)));
					mk.setCONTENT_TYPE(Integer.parseInt(getTagValue("contenttypeid", eElement)));
					list.add(mk);
						}//if end
					}	// for end
	} catch (Exception e){	
		e.printStackTrace();
	}	// try~catch end
	System.out.println(list.size());
	String[] keywords=keyword.split(" ");
	ArrayList<Marker> titleCheck=titleCheck(0, keywords, list,null);
	ArrayList<Marker> addCheck=addressCheck(0, keywords, list,null);
	list= new ArrayList<Marker>();
	list.addAll(titleCheck);
	list.addAll(addCheck);
	System.out.println(list.size());
	int start=0,end=list.size();
	List<Marker> pageList;
	if(page==1){
		if(end>12){
			pageList= list.subList(start, 12);
		}else{
			 pageList=list.subList(start, end);
		}
	}else{
		page--;
		if(end>(page+1)*12){
			pageList=  list.subList(page*12, (page+1)*12);
		}else{
			pageList= list.subList(page*12, end);
		}
	}
	return pageList;	
	}
	
	public ArrayList<String> imgDetail(int contentId,int contentType){
		String url="http://api.visitkorea.or.kr/openapi/service/rest/KorService/detailImage?ServiceKey=EtQZrT3XWKN7DoWis1UglcjHhWzqoZPFUDlrOtmsdW%2FtWbWJM8hvCdoomDs4x0UlEePVSxkQ8N1xjlPeuHgyPA%3D%3D&contentTypeId="+contentType+"&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&contentId="+contentId+"&imageYN=Y ";
		return null;
	}
	
	public ArrayList<String> introDetail(int contentId,int contentType){
		String url="http://api.visitkorea.or.kr/openapi/service/rest/KorService/detailIntro?ServiceKey=EtQZrT3XWKN7DoWis1UglcjHhWzqoZPFUDlrOtmsdW%2FtWbWJM8hvCdoomDs4x0UlEePVSxkQ8N1xjlPeuHgyPA%3D%3D&contentTypeId="+contentType+"&contentId="+contentId+"&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&introYN=Y";
		return null;
	}
	
	//관광지 상세정보 (공통)
	public Marker commonDetail(int contentId,int contentType) {
		Marker mk= new Marker();
		try{
			// parsing할 url 지정(API 키 포함해서)
			String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/detailCommon?ServiceKey=EtQZrT3XWKN7DoWis1UglcjHhWzqoZPFUDlrOtmsdW%2FtWbWJM8hvCdoomDs4x0UlEePVSxkQ8N1xjlPeuHgyPA%3D%3D&contentTypeId="+contentType+"&contentId="+contentId+"&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&defaultYN=Y&firstImageYN=Y&areacodeYN=Y&catcodeYN=Y&addrinfoYN=Y&mapinfoYN=Y&overviewYN=Y&transGuideYN=Y";
			DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
			Document doc = dBuilder.parse(url);
			
			// root tag 
			doc.getDocumentElement().normalize();
			// 파싱할 tag
			NodeList nList = doc.getElementsByTagName("item");
			
			for(int temp = 0; temp < nList.getLength(); temp++){
				Node nNode = nList.item(temp);
				if(nNode.getNodeType() == Node.ELEMENT_NODE){
					Element eElement = (Element) nNode;
					mk.setMARKER_ADDRESS(getTagValue("addr1", eElement));
					if(getTagValue("firstimage",eElement)!=null){
						mk.setMARKER_IMG(getTagValue("firstimage", eElement));
					}	
					if(getTagValue("mapx", eElement)!=null){
						mk.setMAP_X(Double.valueOf(getTagValue("mapx", eElement)));
						mk.setMAP_Y(Double.valueOf(getTagValue("mapy", eElement)));
					}
					if(getTagValue("tel", eElement)!=null){
						mk.setMARKER_TEL(getTagValue("tel", eElement));
					}
					mk.setMARKER_NAME(getTagValue("title", eElement));
					mk.setMARKER_OVERVIEW(getTagValue("overview",eElement));
					mk.setCONTENT_ID(Integer.parseInt(getTagValue("contentid", eElement)));
					mk.setCONTENT_TYPE(Integer.parseInt(getTagValue("contenttypeid", eElement)));
						}//if end
					}	// for end
	} catch (Exception e){	
		e.printStackTrace();
	}	// try~catch end
		return mk;
	}

	public int insert(Marker marker) {
		return 0;
	}

	public int delete(Marker marker) {
		return 0;
	}

	private ArrayList<Marker> titleCheck(int index,String[] keywords, List<Marker> result,ArrayList<Marker> checkList){
		ArrayList<Marker> f1=new ArrayList<Marker>(),f2=new ArrayList<Marker>(),checkList2;
		if(checkList==null){
			checkList= new ArrayList<Marker>();
			for (int i = 0; i < result.size(); i++) {
				if(result.get(i).getMARKER_NAME().contains(keywords[index])){
					checkList.add(result.get(i));
				} //if end
			}//for end
		}else{
			checkList2=new ArrayList<Marker>();
			for (int i = 0; i < checkList.size(); i++) {
				if(checkList.get(i).getMARKER_NAME().contains(keywords[index])){
					checkList2.add(checkList.get(i));
				}//if end
			}//for end
			checkList=checkList2;
		}//else end
		if((index+1) < keywords.length){
			if(checkList.size()>0){
				f1=this.titleCheck(index+1, keywords,result ,checkList);
				f2=this.addressCheck(index+1, keywords,result,checkList);
				if(f1.size()==0 && f2.size()==0){
					return new ArrayList<Marker>();
				}
			}else{
				return new ArrayList<Marker>();
			}
		}
		
		
		if(f1.size()>0 || f2.size()>0){
			
			checkList=new ArrayList<Marker>();
		if(f1.size()>0){
			checkList.addAll(f1);
		}
		if(f2.size()>0){
			checkList.addAll(f2);
		}
		}
		

		return checkList;
	}
	private ArrayList<Marker> addressCheck(int index,String[] keywords, List<Marker> result,ArrayList<Marker> checkList){
		ArrayList<Marker> f1=new ArrayList<Marker>(),f2=new ArrayList<Marker>(),checkList2;
		if(checkList==null){
			checkList= new ArrayList<Marker>();
			for (int i = 0; i < result.size(); i++) {
				if(result.get(i).getMARKER_ADDRESS().contains(keywords[index])){
					checkList.add(result.get(i));
				} //if end
			}//for end
		}else{
			checkList2=new ArrayList<Marker>();
			for (int i = 0; i < checkList.size(); i++) {
				if(checkList.get(i).getMARKER_ADDRESS().contains(keywords[index])){
					checkList2.add(checkList.get(i));
				}//if end
			}//for end
			checkList=checkList2;
		}//else end
		if((index+1) < keywords.length){
			if(checkList.size()>0){
				f1=this.titleCheck(index+1, keywords,result ,checkList);
				f2=this.addressCheck(index+1, keywords,result,checkList);
				if(f1.size()==0 && f2.size()==0){
					return new ArrayList<Marker>();
				}
			}else{
				return new ArrayList<Marker>();
			}
		}
		
		if(f1.size()>0 || f2.size()>0){
		
			checkList=new ArrayList<Marker>();
		if(f1.size()>0){
			checkList.addAll(f1);
		}
		if(f2.size()>0){
			checkList.addAll(f2);
		}
		}
		
		return checkList;
	}

	public int getpage(int contentType){
		
		int page=1;
		int getnum=0;
		
		try{
				String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=EtQZrT3XWKN7DoWis1UglcjHhWzqoZPFUDlrOtmsdW%2FtWbWJM8hvCdoomDs4x0UlEePVSxkQ8N1xjlPeuHgyPA%3D%3D&contentTypeId="+contentType+"&areaCode=39&sigunguCode=&cat1=&cat2=&cat3=&listYN=Y&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&arrange=A&numOfRows=500";
				
				DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
				Document doc = dBuilder.parse(url);
				// root tag 
				NodeList nList = doc.getElementsByTagName("body");	
				Node nNode = nList.item(0);
				if(nNode.getNodeType() == Node.ELEMENT_NODE){
					Element eElement = (Element) nNode;
					getnum=Integer.parseInt(getTagValue("totalCount", eElement));
				}
				
				getnum=(int)Math.ceil((double)getnum/12);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return getnum;
	}
	
	public int getPage(int contentType, String keyword) {
		ArrayList<Marker> list = new ArrayList<Marker>();
		int getnum=0;
		try{
			// parsing할 url 지정(API 키 포함해서)
			String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=EtQZrT3XWKN7DoWis1UglcjHhWzqoZPFUDlrOtmsdW%2FtWbWJM8hvCdoomDs4x0UlEePVSxkQ8N1xjlPeuHgyPA%3D%3D&contentTypeId="+contentType+"&areaCode=39&sigunguCode=&cat1=&cat2=&cat3=&listYN=Y&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&arrange=A&numOfRows=500";
			
			DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
			Document doc = dBuilder.parse(url);
			
			// root tag 
			doc.getDocumentElement().normalize();
			// 파싱할 tag
			NodeList nList = doc.getElementsByTagName("item");
			
			for(int temp = 0; temp < nList.getLength(); temp++){
				Marker mk=new Marker();
				Node nNode = nList.item(temp);
				if(nNode.getNodeType() == Node.ELEMENT_NODE){
					Element eElement = (Element) nNode;
					mk.setMARKER_ADDRESS(getTagValue("addr1", eElement));
					if(getTagValue("firstimage",eElement)==null){
					}else{
						mk.setMARKER_IMG(getTagValue("firstimage", eElement));
					}	
					if(getTagValue("mapx", eElement)==null){
						
					}else{
						mk.setMAP_X(Double.valueOf(getTagValue("mapx", eElement)));
						mk.setMAP_Y(Double.valueOf(getTagValue("mapy", eElement)));
					}
					mk.setMARKER_NAME(getTagValue("title", eElement));
					mk.setCONTENT_ID(Integer.parseInt(getTagValue("contentid", eElement)));
					mk.setCONTENT_TYPE(Integer.parseInt(getTagValue("contenttypeid", eElement)));
					list.add(mk);
				}	//for end
			}//if end
	} catch (Exception e){	
		e.printStackTrace();
	}	// try~catch end
	String[] keywords=keyword.split(" ");
	ArrayList<Marker> titleCheck=titleCheck(0, keywords, list,null);
	ArrayList<Marker> addCheck=addressCheck(0, keywords, list,null);
	list= new ArrayList<Marker>();
	list.addAll(titleCheck);
	list.addAll(addCheck);
		System.out.println(list.size());
		getnum=(int)Math.ceil((double)list.size()/12);
		return getnum;
	}
	
	public int getpage(String keyword) {
		int getnum=0;
		ArrayList<Marker> list = new ArrayList<Marker>();
		int[] contentType = {12,32,39};
		try{
			for (int i = 0; i < contentType.length; i++) {
			// parsing할 url 지정(API 키 포함해서)
			String url = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=EtQZrT3XWKN7DoWis1UglcjHhWzqoZPFUDlrOtmsdW%2FtWbWJM8hvCdoomDs4x0UlEePVSxkQ8N1xjlPeuHgyPA%3D%3D&contentTypeId="+contentType[i]+"&areaCode=39&sigunguCode=&cat1=&cat2=&cat3=&listYN=Y&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&arrange=A&numOfRows=500";
			
			DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
			Document doc = dBuilder.parse(url);
			
			// root tag 
			doc.getDocumentElement().normalize();
			// 파싱할 tag
			NodeList nList = doc.getElementsByTagName("item");
			
			for(int temp = 0; temp < nList.getLength(); temp++){
				Marker mk=new Marker();
				Node nNode = nList.item(temp);
				if(nNode.getNodeType() == Node.ELEMENT_NODE){
					Element eElement = (Element) nNode;
					mk.setMARKER_ADDRESS(getTagValue("addr1", eElement));
					if(getTagValue("firstimage",eElement)==null){
					}else{
						mk.setMARKER_IMG(getTagValue("firstimage", eElement));
					}	
					if(getTagValue("mapx", eElement)==null){
						
					}else{
						mk.setMAP_X(Double.valueOf(getTagValue("mapx", eElement)));
						mk.setMAP_Y(Double.valueOf(getTagValue("mapy", eElement)));
					}
					mk.setMARKER_NAME(getTagValue("title", eElement));
					mk.setCONTENT_ID(Integer.parseInt(getTagValue("contentid", eElement)));
					mk.setCONTENT_TYPE(Integer.parseInt(getTagValue("contenttypeid", eElement)));
					list.add(mk);
				}	//for end
			}//if end
			}	//for end
	} catch (Exception e){	
		e.printStackTrace();
	}	// try~catch end
	String[] keywords=keyword.split(" ");
	ArrayList<Marker> titleCheck=titleCheck(0, keywords, list,null);
	ArrayList<Marker> addCheck=addressCheck(0, keywords, list,null);
	list= new ArrayList<Marker>();
	list.addAll(titleCheck);
	list.addAll(addCheck);
	getnum=(int)Math.ceil((double)list.size()/12);
	return getnum;
	}
}
