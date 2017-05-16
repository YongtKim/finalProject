package com.finalProject.mappin.traveler.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.mappin.traveler.model.dao.TravelerDao;
import com.finalProject.mappin.traveler.model.vo.Traveler;
import com.finalProject.mappin.traveler.model.vo.Traveler_Detail;

@Service("travelerService")
public class TravelerServiceImp implements TravelerService {
	
	@Autowired
	private TravelerDao travelerDao;
	
	@Override
	public List<Traveler> selectList(String member_id) {
		List<Traveler> planList = travelerDao.selectList(member_id);
		return planList;
	}

	@Override
	public int insert(int plan_id, Traveler_Detail traveler_detail) {
		int result = travelerDao.insert(plan_id, traveler_detail);
		return result;
	}
	
	@Override
	public int delete(int plan_id) {
		int result = travelerDao.delete(plan_id);
		return result;
	}
	
	@Override
	public int updatePlan(Traveler plan){
		int result = travelerDao.updatePlan(plan);
		return result;
	}
	
}
