package com.finalProject.mappin.guide.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.mappin.guide.model.dao.Guide_DetailDao;
import com.finalProject.mappin.guide.model.vo.Guide_Detail;

@Service("guide_DetailService")
public class Guide_DetailServiceImp implements Guide_DetailService{
	
	@Autowired
	Guide_DetailDao guide_DetailDao;

	@Override
	public int insert(Guide_Detail guidedetail) {
		return guide_DetailDao.insert(guidedetail);
	}

	@Override
	public List<Guide_Detail> detail(int package_id) {
		return (List<Guide_Detail>) guide_DetailDao.detail(package_id);
	}

	@Override
	public int update(Guide_Detail guidedetail) {
		return guide_DetailDao.update(guidedetail);
	}
	
} 
