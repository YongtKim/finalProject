package com.finalProject.mappin.traveler.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.traveler.model.service.BucketService;
import com.finalProject.mappin.traveler.model.service.TravelerDetailService;
import com.finalProject.mappin.traveler.model.service.TravelerService;
import com.finalProject.mappin.traveler.model.vo.Bucket;
import com.finalProject.mappin.traveler.model.vo.Traveler;
import com.finalProject.mappin.traveler.model.vo.Traveler_Detail;

@Controller
public class TravelerController {

	@Autowired
	private TravelerService travelerService;
	private TravelerDetailService travelerDetailService;
	private BucketService bucketService;
	
	@RequestMapping("/selectList.to")
	public ModelAndView selectList(ModelAndView mv, String member_id){
		List<Traveler> planList = travelerService.selectList(member_id);
		mv.addObject(planList);
		return mv;
	}
	
	@RequestMapping("/detail.to")
	public ModelAndView detail(ModelAndView mv, int plan_id){
		List<Traveler_Detail> detailList = travelerDetailService.detail(plan_id);
		List<Bucket> bucketList = bucketService.detailBucket(plan_id);
		mv.addObject(detailList);
		return mv;
	}
	
	@RequestMapping("/insert.to")
	public int insert(int plan_id, Traveler_Detail traveler_detail){
		int result = travelerService.insert(plan_id, traveler_detail);
		return result;
	}
	
	@RequestMapping("/delete.to")
	public int deletePlan(int plan_id){
		int result = travelerService.delete(plan_id);
		return result;
	}
	
	@RequestMapping("/updatePlan.to")
	public int updatePlan(Traveler plan){
		int result = travelerService.updatePlan(plan);
		return result;
	}
	
	@RequestMapping("/updateDetail.to")
	public int updateDetail(int plan_id, List<Bucket> bucketList, List<Traveler_Detail> onedayList){
		int deleteD_result = travelerDetailService.deleteDetail(plan_id);
		int deleteB_result = bucketService.deleteBucket(plan_id);
		int insertD_result = travelerDetailService.insertDetail(onedayList);
		int insertB_result = bucketService.insertBucket(bucketList);
		return insertB_result;
	}
}
