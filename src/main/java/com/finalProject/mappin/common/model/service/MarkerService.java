package com.finalProject.mappin.common.model.service;

import java.util.List;

import com.finalProject.mappin.common.model.vo.Marker;

public interface MarkerService {

	List<Marker> selectList(int page, int contentType);

	Marker detail(int content_id, int content_type);

	int insert(Marker marker);

	int delete(Marker marker);
	
	int getpage(int contentType);

	List<Marker> selectList(int page, int contentType, String keyword);
}
