package com.finalProject.mappin.news.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.news.model.vo.News;

@Repository("newsDao")
public class NewsDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<News> selectList(int currentPage, int limit) {
		Map<String, Integer> page = new HashMap<String, Integer>();
		page.put("currentPage", currentPage);
		page.put("limit", limit);
		return sqlSession.selectList("newsmapper.selectList", page);
	}

	public News detail(HttpRequest request) {
		return (News) sqlSession.selectOne("newsmapper.detail", request);
	}

	public int insert(News news) {
		return  sqlSession.insert("newsmapper.insert", news);
	}

	public int delete(HttpRequest request) {
		return  sqlSession.delete("newsmapper.delete", request);
	}

	public int update(News news) {
		return  sqlSession.update("newsmapper.update", news);
	}

}
