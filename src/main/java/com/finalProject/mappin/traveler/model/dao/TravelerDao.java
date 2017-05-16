package com.finalProject.mappin.traveler.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.traveler.model.vo.Traveler;
import com.finalProject.mappin.traveler.model.vo.Traveler_Detail;

@Repository("travelerDao")
public class TravelerDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Traveler> selectList(String member_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Traveler_Detail> detail(int plan_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(int plan_id, Traveler_Detail traveler_detail) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int plan_id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int updatePlan(Traveler plan) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateDetail(List<Traveler_Detail> onedayList) {
		// TODO Auto-generated method stub
		return 0;
	}

}
