package com.finalProject.mappin.common.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.finalProject.mappin.common.model.vo.Marker;

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

	public List<Marker> selectList(int page, int contentType) {
		return null;
	}

	public Marker detail(int content_id, int content_type) {
		return null;
	}

	public int insert(Marker marker) {
		return 0;
	}

	public int delete(Marker marker) {
		return 0;
	}
	
	public int getpage(int contentType){
		
		return 0;
	}
	public int getPage(int contentType, String keyword) {
		
		return 0;
	}

	
}
