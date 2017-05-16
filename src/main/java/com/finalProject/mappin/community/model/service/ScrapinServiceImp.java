package com.finalProject.mappin.community.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.mappin.community.model.dao.ScrapinDao;
import com.finalProject.mappin.community.model.vo.Scrapin;

@Service("scrapinService")
@Transactional
public class ScrapinServiceImp implements ScrapinService{

	@Autowired
	private ScrapinDao scrapinDao;
	
	@Override
	public List<Scrapin> selectList(int member_id) {
		return scrapinDao.selectList(member_id);
	}

	@Override
	public int delete(Scrapin scrapin) {
		return scrapinDao.delete(scrapin);
	}

	@Override
	public int insert(Scrapin scrapin) {
		return scrapinDao.insert(scrapin);
	}

}
