package com.finalProject.mappin.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.mappin.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public MemberDao(){	}
	
	public Member loginCheck(Member loginVo){
		return (Member) sqlSession.selectOne("membermapper.logincheck", loginVo);
	}
	
	public Member logOut(Member loginVo){
		return null;
	}
	
	public List<Member> selectList(){
		return null;
	}

	public Member detail(String member_id) {
		return null;
	}
	
	public int insert(Member loginVo){
		return 0;
	}
	
	public int delete(int member_id){
		return 0;
	}
	
	public int update(Member loginVo){
		return 0;
	}
}
