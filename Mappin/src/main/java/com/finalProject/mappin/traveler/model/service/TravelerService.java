package com.finalProject.mappin.traveler.model.service;

import java.util.List;

import com.finalProject.mappin.traveler.model.vo.Traveler;
import com.finalProject.mappin.traveler.model.vo.Traveler_Detail;

public interface TravelerService {

	public List<Traveler> selectList(String member_id);

	public int insert(int plan_id, Traveler_Detail traveler_detail);
	
	public int delete(int plan_id);
	
	public int updatePlan(Traveler plan);
	
}
