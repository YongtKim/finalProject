package com.finalProject.mappin.community.model.service;

import java.util.List;

import org.springframework.http.HttpRequest;

import com.finalProject.mappin.community.model.vo.Community;

public interface CommunityService {

	List<Community> selectList(int currentPage, int limit);

	Community detail(int community_id);

	int insert(Community community);

	int delete(int community_id);

	int update(Community community);

}
