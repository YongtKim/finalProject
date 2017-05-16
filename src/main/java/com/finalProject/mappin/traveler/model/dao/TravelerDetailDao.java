package com.finalProject.mappin.traveler.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.traveler.model.vo.Traveler_Detail;

@Repository("travelerDetailDao")
public class TravelerDetailDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Traveler_Detail> detail(int plan_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int delete(int plan_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(List<Traveler_Detail> onedayList) {
		// TODO Auto-generated method stub
		return 0;
	}

}
