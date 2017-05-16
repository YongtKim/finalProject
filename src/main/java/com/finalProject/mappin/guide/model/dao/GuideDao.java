package com.finalProject.mappin.guide.model.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.common.model.vo.Location;
import com.finalProject.mappin.guide.model.vo.Guide;

@Repository("guideDao")
public class GuideDao {

	@Autowired
	private SqlSession sqlSession;

	public GuideDao() {
	}

	public List<Guide> SelectList(int currentPage, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	public Guide detail(int package_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(Guide guide) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int package_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Guide guide) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Guide> search_location(int currentPage, int limit, Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Guide> search_dates(int currentPage, int limit, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Guide> search_member_id(int currentPage, int limit, int member_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
