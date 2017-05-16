package com.finalProject.mappin.member.model.service;

import java.util.List;

import com.finalProject.mappin.member.model.vo.Member;

public interface MemberService {
	Member loginCheck(Member member);
	Member logOut(Member member);
	List<Member> selectList();
	Member detail(String member_id);
	int insert(Member vo);
	int delete(int member_id);
	int update(Member vo);
}
