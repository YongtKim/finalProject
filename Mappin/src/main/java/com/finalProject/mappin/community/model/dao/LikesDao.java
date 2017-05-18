package com.finalProject.mappin.community.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("likesDao")
public class LikesDao {

	@Autowired
	private SqlSession sqlSession;

	public int detail(int community_id) {
		return (Integer) sqlSession.selectOne("likesmapper.detail", community_id);
	}
	
}
