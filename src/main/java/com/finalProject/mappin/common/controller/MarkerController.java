package com.finalProject.mappin.common.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.finalProject.mappin.common.model.service.MarkerService;
import com.finalProject.mappin.common.model.vo.Marker;

@Controller
public class MarkerController {

	
	@Autowired
	private MarkerService markerService;
	
	@Autowired
	private Request request;
	@Autowired
	private Response response;
	
	@RequestMapping("/select_List.mark")
	public void selectTypeList() throws IOException{
		int page=Integer.parseInt(request.getParameter("page"));
		int contentType=Integer.parseInt(request.getParameter("type"));
		List<Marker> list=markerService.selectList(page,contentType);
		int totalpage= markerService.getpage(contentType);
		JSONObject json=new JSONObject();
		JSONArray jarr= new JSONArray();
		for (int i = 0; i < list.size(); i++) {
			JSONObject js =new JSONObject();
			js.put("title", URLEncoder.encode(list.get(i).getMARKER_NAME(),"UTF-8"));
			js.put("img", list.get(i).getMARKER_IMG());
			js.put("lat",list.get(i).getMAP_X());
			js.put("lng", list.get(i).getMAP_Y());
			js.put("address", list.get(i).getMARKER_ADDRESS());
			js.put("contentid", list.get(i).getCONTENT_ID());
			js.put("contenttype", list.get(i).getCONTENT_TYPE());
			jarr.add(js);
		}

		json.put("list", jarr);
		json.put("page", totalpage);
		response.setContentType("application/json");
		PrintWriter out= response.getWriter();
		out.print(json.toJSONString());
		out.flush();
		out.close();
	}
	
	@RequestMapping("/search_List.mark")
	public void searchList(){
		int page=Integer.parseInt(request.getParameter("page"));
		String keyword=request.getParameter("keyword");
	}
	
	@RequestMapping("/search_type_List.mark")
	public void searchTypeList(){
		int page=Integer.parseInt(request.getParameter("page"));
		int contentType=Integer.parseInt(request.getParameter("type"));
		String keyword=request.getParameter("keyword");
		List<Marker> list=markerService.selectList(page,contentType,keyword);
	}
	
	@RequestMapping("/detail.mark")
	public Marker detail(int content_id, int content_type){
		return markerService.detail(content_id, content_type);
	}
	
	@RequestMapping("/insert.mark")
	public void insert(Marker marker){
		int result = markerService.insert(marker);
	}
	
	@RequestMapping("/delete.mark")
	public void delete(Marker marker){
		int result = markerService.delete(marker);
	}
	
	@RequestMapping("/update.mark")
	public void update(Marker marker){
		int result = markerService.insert(marker);
	}
	
}
