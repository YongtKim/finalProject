package com.finalProject.mappin.common.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.mappin.common.model.dao.MarkerDao;
import com.finalProject.mappin.common.model.vo.Marker;

@Service("markerService")
public class MarkerServiceImp implements MarkerService{
	
	@Autowired
	MarkerDao markerDao;
	
	@Override
	public List<Marker> selectList(int page, int contentType) {
		
		return markerDao.selectList(page,contentType);
	}

	@Override
	public List<Marker> selectList(int page, String keyword) {
		return markerDao.selectList(page, keyword);
	}
	
	@Override
	public List<Marker> selectList(int page, int contentType, String keyword) {
		return markerDao.selectList(page, contentType, keyword);
	}
	
	@Override
	public Marker detail(int content_id, int content_type) {
		return markerDao.detail(content_id, content_type);
	}

	@Override
	public int insert(Marker marker) {
		return markerDao.insert(marker);
	}

	@Override
	public int delete(Marker marker) {
		return markerDao.delete(marker);
	}

	@Override
	public int getpage(int contentType) {
		return markerDao.getpage(contentType);
	}
	@Override
	public int getpage(int contentType, String keyword) {
		return markerDao.getPage(contentType, keyword);
	}
	
	@Override
	public int getpage(String keyword) {
		return markerDao.getpage(keyword);
	}

	

	


} 
