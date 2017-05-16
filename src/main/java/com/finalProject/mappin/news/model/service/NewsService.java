package com.finalProject.mappin.news.model.service;

import java.util.List;

import org.springframework.http.HttpRequest;

import com.finalProject.mappin.news.model.vo.News;

public interface NewsService {

	List<News> selectList(int currentPage, int limit);

	News detail(HttpRequest request);

	int insert(News news);

	int delete(HttpRequest request);

	int update(News news);

}
