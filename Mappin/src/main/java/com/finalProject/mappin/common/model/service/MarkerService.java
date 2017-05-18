package com.finalProject.mappin.common.model.service;

import java.util.List;

import com.finalProject.mappin.common.model.vo.Marker;

public interface MarkerService {

	List<Marker> selectList(int page, int contentType);

	Marker detail(int content_id, int content_type);

	int insert(Marker marker);

	int delete(Marker marker);
	
	List<Marker> selectList(int page, int contentType, String keyword);

	int getpage(int contentType);

	int getpage(int contentType, String keyword);

	int getpage(String keyword);
	List<Marker> selectList(int page, String keyword);
}
