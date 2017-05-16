package com.finalProject.mappin.community.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.mappin.community.model.dao.LikesDao;

@Service("likesService")
@Transactional
public class LikesServiceImp implements LikesService{

	@Autowired
	private LikesDao likesDao;
	
	@Override
	public int detail(int community_id) {
		return likesDao.detail(community_id);
	}

}
