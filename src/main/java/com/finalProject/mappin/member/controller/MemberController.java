package com.finalProject.mappin.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.member.model.service.MemberService;
import com.finalProject.mappin.member.model.vo.Member;


@Controller
@SessionAttributes("loginUser")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	//관리자용
	@RequestMapping("/selectList.mo")
	public ModelAndView selectList(List<Member> mList, ModelAndView mv){
		mList = (List<Member>) memberService.selectList();
		mv.addObject("mList", mList);
		mv.setViewName("administer");
		return mv;
	}
	
	@RequestMapping("/logincheck.mo")
	public String loginCheck(Member member, Model model){
		Member loginUser = memberService.loginCheck(member);
		model.addAttribute("loginUser", loginUser);
		return "../common/home";
	}
	
	@RequestMapping("/logout.mo")
	public String logout(ModelAndView mv, HttpSession session){
		session.invalidate();
		return "home";
	}
	
	@RequestMapping("/insert.mo")
	public String insert(Member member){
		int result = memberService.insert(member);
		return "login";
	}
	
	@RequestMapping("/detail.mo")
	public Member detail(String member_id, ModelAndView mv){
		Member member = memberService.detail(member_id);
		return member;
	}
	
	@RequestMapping("/delete.mo")
	public String delete(int member_id, ModelAndView mv, HttpSession session){
		int result = memberService.delete(member_id);
		session.invalidate();
		return "home";
	}
	
	@RequestMapping("/update.mo")
	public String update(Member member, ModelAndView mv){
		int result = memberService.update(member);
		return "memberDetail";
	}
}
