package com.finalProject.mappin.guide.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.common.model.vo.Location;
import com.finalProject.mappin.guide.model.service.GuideService;
import com.finalProject.mappin.guide.model.service.Guide_DetailService;
import com.finalProject.mappin.guide.model.vo.Guide;
import com.finalProject.mappin.guide.model.vo.Guide_Detail;

@Controller
public class GuideController {

	@Autowired
	private GuideService guideService;
	private Guide_DetailService guide_DetailService;
	
	@RequestMapping("/selectList.go")
	public ModelAndView selectList(ModelAndView mv){
		int currentPage = 0;
		int limit = 0;
		List<Guide> list = guideService.SelectList(currentPage, limit);
		return mv;
	}
	
	@RequestMapping("/detail.go")
	public ModelAndView detail(ModelAndView mv, int package_id){
		Guide guide = guideService.detail(package_id);
		List<Guide_Detail> list = guide_DetailService.detail(package_id);
		return mv;
	}
	
	@RequestMapping("/insert.go")
	public String insert(Guide guide, Guide_Detail guidedetail){
		int result1 = guideService.insert(guide);
		int result2 = guide_DetailService.insert(guidedetail);
		return "guide";
	}
	
	@RequestMapping("/delete.go")
	public String delete(int package_id){
		int result = guideService.delete(package_id);
		return "guide";
	}
	
	@RequestMapping("/update.go")
	public String update(Guide guide, Guide_Detail guidedetail){
		int result1 = guideService.update(guide);
		int result2 = guide_DetailService.update(guidedetail);
		return "guideDetail";
	}
	
	@RequestMapping("/search_location.go")
	public String search_location(Location location){
		int currentPage = 0;
		int limit = 0;
		List<Guide> list = guideService.search_location(currentPage, limit, location);
		return "guide";
	}
	
	@RequestMapping("/search_dates.go")
	public String search_dates(Date date){
		int currentPage = 0;
		int limit = 0;
		List<Guide> list = guideService.search_dates(currentPage, limit, date);
		return "guide";
	}
	
	@RequestMapping("/search_member_id.go")
	public String search_member_id(int member_id){
		int currentPage = 0;
		int limit = 0;
		List<Guide> list = guideService.search_member_id(currentPage, limit, member_id);
		return "guide";
	}
	
}
