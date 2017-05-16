package com.finalProject.mappin.community.model.service;

import java.util.List;

import com.finalProject.mappin.community.model.vo.Scrapin;

public interface ScrapinService {

	List<Scrapin> selectList(int member_id);

	int delete(Scrapin scrapin);

	int insert(Scrapin scrapin);

}
