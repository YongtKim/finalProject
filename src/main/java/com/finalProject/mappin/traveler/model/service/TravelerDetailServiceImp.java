package com.finalProject.mappin.traveler.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.mappin.traveler.model.dao.TravelerDetailDao;
import com.finalProject.mappin.traveler.model.vo.Traveler_Detail;

@Service("travelerDetailService")
public class TravelerDetailServiceImp implements TravelerDetailService {

	@Autowired
	private TravelerDetailDao travelerDetailDao;
	
	@Override
	public List<Traveler_Detail> detail(int plan_id) {
		List<Traveler_Detail> detailList = travelerDetailDao.detail(plan_id);
		return detailList;
	}

	@Override
	public int deleteDetail(int plan_id) {
		int result = travelerDetailDao.delete(plan_id);
		return result;
	}

	@Override
	public int insertDetail(List<Traveler_Detail> onedayList) {
		int result = travelerDetailDao.insert(onedayList);
		return result;
	}

}
