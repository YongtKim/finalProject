package com.finalProject.mappin.guide.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.guide.model.vo.Guide_Detail;

@Repository("guide_DetailDao")
public class Guide_DetailDao {

	@Autowired
	private SqlSession sqlSession;

	public int insert(Guide_Detail guidedetail) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Guide_Detail> detail(int package_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(Guide_Detail guidedetail) {
		// TODO Auto-generated method stub
		return 0;
	}



}
