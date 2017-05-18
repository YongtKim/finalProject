package com.finalProject.mappin.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.mappin.member.model.dao.MemberDao;
import com.finalProject.mappin.member.model.vo.Member;

@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDao memberDao;

	@Override
	public Member loginCheck(Member member) {
		return memberDao.loginCheck(member);
	}

	@Override
	public Member logOut(Member member) {
		return memberDao.logOut(member);
	}

	@Override
	public List<Member> selectList() {
		return memberDao.selectList();
	}

	@Override
	public Member detail(String member_id) {
		return memberDao.detail(member_id);
	}

	@Override
	public int insert(Member member) {
		return memberDao.insert(member);
	}

	@Override
	public int delete(int member_id) {
		return memberDao.delete(member_id);
	}

	@Override
	public int update(Member member) {
		return memberDao.update(member);
	}


}
