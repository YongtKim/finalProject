package com.finalProject.mappin.community.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.mappin.community.model.dao.CommunityDao;
import com.finalProject.mappin.community.model.vo.Community;

@Service("communityService")
@Transactional
public class CommunityServiceImp implements CommunityService{

	@Autowired
	private CommunityDao communityDao;
	@Override
	public List<Community> selectList(int currentPage, int limit) {
		return communityDao.selectList(currentPage, limit);
	}

	@Override
	public int insert(Community community) {
		return communityDao.insert(community);
	}

	@Override
	public int delete(int community_id) {
		return communityDao.delete(community_id);
	}

	@Override
	public int update(Community community) {
		return communityDao.update(community);
	}

	@Override
	public Community detail(int community_id) {
		return communityDao.detail(community_id);
	}

}
