package com.finalProject.mappin.community.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.community.model.vo.Scrapin;

@Repository("scrapinDao")
public class ScrapinDao {

	@Autowired
	private SqlSession sqlSession;

	public List<Scrapin> selectList(int member_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int delete(Scrapin scrapin) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(Scrapin scrapin) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
