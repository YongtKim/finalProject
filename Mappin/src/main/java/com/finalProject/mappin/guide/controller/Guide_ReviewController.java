package com.finalProject.mappin.guide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.finalProject.mappin.guide.model.service.Guide_ReviewService;
import com.finalProject.mappin.guide.model.vo.Guide_Review;


@Controller
@RequestMapping("review")
public class Guide_ReviewController {

	@Autowired
	private Guide_ReviewService guide_ReviewService;
	
	@RequestMapping("/selectList.go")
	public List<Guide_Review> selectList(){
		return (List<Guide_Review>) guide_ReviewService.selectList();
	}
	
	@RequestMapping("/insert.go")
	public int insert(Guide_Review guide_Reivew){
		return guide_ReviewService.insert(guide_Reivew);
	}
	
	@RequestMapping("/update.go")
	public int update(Guide_Review guide_Reivew){
		return guide_ReviewService.update(guide_Reivew);
	}
	
	@RequestMapping("/delete.go")
	public int delete(int review_id){
		return guide_ReviewService.delete(review_id);
	}
	
}
