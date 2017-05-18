package com.finalProject.mappin.community.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.community.model.service.CommentsService;
import com.finalProject.mappin.community.model.service.CommunityService;
import com.finalProject.mappin.community.model.service.Community_imgService;
import com.finalProject.mappin.community.model.service.LikesService;
import com.finalProject.mappin.community.model.service.ScrapinService;
import com.finalProject.mappin.community.model.vo.Comments;
import com.finalProject.mappin.community.model.vo.Community;
import com.finalProject.mappin.community.model.vo.Community_img;
import com.finalProject.mappin.community.model.vo.Likes;

@Controller
@RequestMapping("/community")
public class CommunityController {

	@Autowired
	private CommunityService communityService;
	private LikesService likesService;
	private Community_imgService community_imgService;
	private CommentsService commentsService;
	
	@RequestMapping("/selectList.co")
	private ModelAndView selectList(ModelAndView mv){
		int currentPage = 1;
		int limit = 10;
		List<Community> list = communityService.selectList(currentPage, limit);
		/*List<Community_img> imglist = null;
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setImg_path(community_imgService.detail(list.get(i).getCommunity_id()));
		}*/
		mv.addObject("list", list);
//		mv.addObject("imglist", imglist);
		System.out.println(list);
		mv.setViewName("/community");
		return mv;
	}
	@RequestMapping("/detail.co")
	private ModelAndView detail(ModelAndView mv, int community_id){
		Community community = communityService.detail(community_id);
		List<Community_img> com_imgList = community_imgService.detail(community_id);
		int likes = likesService.detail(community.getCommunity_id());
		List<Comments> comments = commentsService.selectList(community.getCommunity_id());
		mv.addObject("community", community);
		mv.addObject("com_imgList", com_imgList);
		mv.addObject("likes", likes);
		mv.addObject("comments", comments);
		mv.setViewName("community/cmmunityDetail");
		return mv;
	}
	@RequestMapping("/insert.co")
	private ModelAndView insert(ModelAndView mv, Community community,  Community_img community_img){
		int result1 = communityService.insert(community);
		int result2 = community_imgService.insert(community_img);
		mv.setViewName("community/cmmunity");
		return mv;
	}
	@RequestMapping("/delete.co")
	private ModelAndView delete(ModelAndView mv, Community community){
		int result = communityService.delete(community.getCommunity_id());
		if(result>0)
			mv.setViewName("community/community");
		return mv;
	}
	@RequestMapping("/update.co")
	private ModelAndView update(ModelAndView mv, Community community, Community_img community_img){
		int result1 = communityService.update(community);
		int result2 = community_imgService.update(community_img);
		if(result1>0 && result2>0)
			mv.setViewName("community/community");
		return mv;
	}
	
}
