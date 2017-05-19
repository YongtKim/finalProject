package com.finalProject.mappin.common.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.finalProject.mappin.common.model.service.MarkerService;
import com.finalProject.mappin.common.model.service.MarkerServiceImp;
import com.finalProject.mappin.common.model.vo.Marker;

@Controller
@RequestMapping("/marker")
public class MarkerController {

	
	@Autowired
	private MarkerService markerService;
	
	
	@RequestMapping("/select_List.mark")
	public void selectTypeList(HttpServletRequest request,HttpServletResponse response) throws IOException{
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
	
	@RequestMapping("/search_type_List.mark")
	public void searchList(HttpServletRequest request,HttpServletResponse response) throws IOException{
		int page=Integer.parseInt(request.getParameter("page"));
		String keyword=request.getParameter("keyword");
		int contentType=Integer.parseInt(request.getParameter("type"));
		List<Marker> list=markerService.selectList(page, contentType, keyword);
		int totalpage= markerService.getpage(contentType,keyword);
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
		json.put("length", list.size());
		response.setContentType("application/json");
		PrintWriter out= response.getWriter();
		out.print(json.toJSONString());
		out.flush();
		out.close();
	}
	
	@RequestMapping("/search_List.mark")
	public void searchTypeList(HttpServletRequest request,HttpServletResponse response) throws IOException{
		int page=Integer.parseInt(request.getParameter("page"));
		String keyword=request.getParameter("keyword");
		List<Marker> list=markerService.selectList(page, keyword);
		int totalpage=markerService.getpage(keyword);
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
		json.put("length", list.size());
		response.setContentType("application/json");
		PrintWriter out= response.getWriter();
		out.print(json.toJSONString());
		out.flush();
		out.close();
	}
	
	@RequestMapping("/commonDetail.mark")
	public void commonDetail(HttpServletRequest request,HttpServletResponse response) throws IOException{
		int contentId=Integer.parseInt(request.getParameter("contentid"));
		int contentType=Integer.parseInt(request.getParameter("contenttype"));
		Marker marker=markerService.commonDetail(contentId,contentType);
		JSONObject js =new JSONObject();
		js.put("title", URLEncoder.encode(marker.getMARKER_NAME(),"UTF-8"));
		js.put("img", marker.getMARKER_IMG());
		js.put("lat",marker.getMAP_X());
		js.put("lng", marker.getMAP_Y());
		js.put("address", URLEncoder.encode(marker.getMARKER_ADDRESS(),"UTF-8"));
		js.put("contentid", marker.getCONTENT_ID());
		js.put("contenttype", marker.getCONTENT_TYPE());
		response.setContentType("application/json");
		PrintWriter out= response.getWriter();
		out.print(js.toJSONString());
		out.flush();
		out.close();
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
