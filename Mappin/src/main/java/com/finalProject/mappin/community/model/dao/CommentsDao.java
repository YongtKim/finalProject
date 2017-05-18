package com.finalProject.mappin.community.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.community.model.vo.Comments;

@Repository("commentsDao")
public class CommentsDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Comments> selectList(int community_id) {
		return sqlSession.selectList("commentsmapper.selectList",community_id);
	}

}
