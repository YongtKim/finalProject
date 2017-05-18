package com.finalProject.mappin.community.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.community.model.vo.Community;

@Repository("communityDao")
public class CommunityDao {

	@Autowired
	private SqlSession sqlSession;

	public List<Community> selectList(int currentPage, int limit) {
		Map<String, Integer> page = new HashMap<String, Integer>();
		page.put("currentPage", currentPage);
		page.put("limit", limit);
		return sqlSession.selectList("communitymapper.selectList", page);
	}

	public Community detail(int community_id) {
		return (Community) sqlSession.selectOne("communitymapper.detail", community_id);
	}

	public int insert(Community community) {
		return sqlSession.insert("communitymapper.insert", community);
	}

	public int delete(int community_id) {
		return sqlSession.delete("communitymapper.delete", community_id);
	}

	public int update(Community community) {
		return sqlSession.update("communitymapper.update", community);
	}
	
}
