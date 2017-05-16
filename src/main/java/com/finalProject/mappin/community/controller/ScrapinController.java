package com.finalProject.mappin.community.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.community.model.service.ScrapinService;
import com.finalProject.mappin.community.model.vo.Scrapin;
import com.finalProject.mappin.member.model.vo.Member;

@Controller
public class ScrapinController {

	@Autowired
	private ScrapinService scrapinService;
	
	@RequestMapping("/selectList.scr")
	public ModelAndView selectList(ModelAndView mv, int Member_id){
		List<Scrapin> list= scrapinService.selectList(Member_id);
		return mv;	
	}
	
	@RequestMapping("/insert.scr")
	public ModelAndView insert(ModelAndView mv, Scrapin scrapin){
		int result = scrapinService.insert(scrapin);
		return mv;	
	}
	
	@RequestMapping("/delete.scr")
	public ModelAndView delete(ModelAndView mv, Scrapin scrapin){
		int result = scrapinService.delete(scrapin);
		return mv;	
	}
	
	
	
}
