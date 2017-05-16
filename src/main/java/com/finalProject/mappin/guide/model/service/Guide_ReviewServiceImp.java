package com.finalProject.mappin.guide.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.mappin.guide.model.dao.Guide_ReviewDao;
import com.finalProject.mappin.guide.model.vo.Guide_Review;

@Service("guide_ReviewService")
public class Guide_ReviewServiceImp implements Guide_ReviewService{
	
	@Autowired
	Guide_ReviewDao guide_ReviewDao;

	@Override
	public List<Guide_Review> selectList() {
		return guide_ReviewDao.selectList();
	}

	@Override
	public int insert(Guide_Review guide_Reivew) {
		return guide_ReviewDao.insert(guide_Reivew);
	}

	@Override
	public int update(Guide_Review guide_Reivew) {
		return guide_ReviewDao.update(guide_Reivew);
	}

	@Override
	public int delete(int review_id) {
		return guide_ReviewDao. delete(review_id);
	}

	

	
} 
