package com.finalProject.mappin.common.model.service;

import java.util.ArrayList;
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

	@Override
	public Marker commonDetail(int contentId, int contentType) {
		return markerDao.commonDetail(contentId, contentType);
	}

	@Override
	public ArrayList<String> introDetail(int contentId, int contentType) {
		// TODO Auto-generated method stub
		return null;
	}

	

	


} 
