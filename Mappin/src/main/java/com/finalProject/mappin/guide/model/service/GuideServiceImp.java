package com.finalProject.mappin.guide.model.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.mappin.common.model.vo.Location;
import com.finalProject.mappin.guide.model.dao.GuideDao;
import com.finalProject.mappin.guide.model.vo.Guide;

@Service("guideService")
public class GuideServiceImp implements GuideService{
	
	@Autowired
	GuideDao guideDao;

	@Override
	public List<Guide> SelectList(int currentPage, int limit) {
		return guideDao.SelectList(currentPage, limit);
	}

	@Override
	public Guide detail(int package_id) {
		return guideDao.detail(package_id);
	}

	@Override
	public int insert(Guide guide) {
		return guideDao.insert(guide);
	}

	@Override
	public int delete(int package_id) {
		return guideDao.delete(package_id);
	}

	@Override
	public int update(Guide guide) {
		return guideDao.update(guide);
	}

	@Override
	public List<Guide> search_location(int currentPage, int limit, Location location) {
		return guideDao.search_location(currentPage, limit, location);
	}

	@Override
	public List<Guide> search_dates(int currentPage, int limit, Date date) {
		return guideDao.search_dates(currentPage, limit, date);
	}

	@Override
	public List<Guide> search_member_id(int currentPage, int limit, int member_id) {
		return guideDao.search_member_id(currentPage, limit, member_id);
	}


	
} 
