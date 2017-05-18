package com.finalProject.mappin.community.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.mappin.community.model.dao.Community_imgDao;
import com.finalProject.mappin.community.model.vo.Community_img;

@Service("community_imgService")
@Transactional
public class Community_imgServiceImp implements Community_imgService{

	@Autowired
	private Community_imgDao community_imgDao;

	@Override
	public List<Community_img> detail(int community_id) {
		return community_imgDao.detail(community_id);
	}

	@Override
	public int insert(Community_img community_img) {
		return community_imgDao.insert(community_img);
	}

	@Override
	public int update(Community_img community_img) {
		return community_imgDao.update(community_img);
	}

}
