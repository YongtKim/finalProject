package com.finalProject.mappin.news.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import com.finalProject.mappin.news.model.dao.NewsDao;
import com.finalProject.mappin.news.model.vo.News;

@Service("newsService")
public class NewsServiceImp implements NewsService{

	@Autowired
	private NewsDao newsDao;
	
	@Override
	public List<News> selectList(int currentPage, int limit) {
		List<News> list = newsDao.selectList(currentPage, limit);
		return list;
	}

	@Override
	public News detail(HttpRequest request) {
		News news = newsDao.detail(request);
		return null;
	}

	@Override
	public int insert(News news) {
		int result = newsDao.insert(news);
		return result;
	}

	@Override
	public int delete(HttpRequest request) {
		int result = newsDao.delete(request);
		return 0;
	}

	@Override
	public int update(News news) {
		int result = newsDao.update(news);
		return result;
	}

	

	
}
