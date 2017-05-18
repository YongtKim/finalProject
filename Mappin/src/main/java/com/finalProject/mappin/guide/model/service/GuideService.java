package com.finalProject.mappin.guide.model.service;

import java.util.Date;
import java.util.List;

import com.finalProject.mappin.common.model.vo.Location;
import com.finalProject.mappin.guide.model.vo.Guide;

public interface GuideService {

	List<Guide> SelectList(int currentPage, int limit);

	Guide detail(int package_id);

	int insert(Guide guide);

	int delete(int package_id);

	int update(Guide guide);

	List<Guide> search_location(int currentPage, int limit, Location location);

	List<Guide> search_dates(int currentPage, int limit, Date date);

	List<Guide> search_member_id(int currentPage, int limit, int member_id);

	

}
