package com.finalProject.mappin.common.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.common.model.service.MarkerService;
import com.finalProject.mappin.common.model.vo.Marker;

@Controller
public class MarkerController {

	@Autowired
	private MarkerService markerService;
	
	@RequestMapping("/selectList.mark")
	public List<Marker> selectList(){
		return markerService.selectList();
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
