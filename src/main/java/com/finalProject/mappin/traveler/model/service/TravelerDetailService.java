package com.finalProject.mappin.traveler.model.service;

import java.util.List;

import com.finalProject.mappin.traveler.model.vo.Traveler_Detail;

public interface TravelerDetailService {

	List<Traveler_Detail> detail(int plan_id);

	int deleteDetail(int plan_id);

	int insertDetail(List<Traveler_Detail> onedayList);

}
