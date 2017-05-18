package com.finalProject.mappin.guide.model.service;

import java.util.List;

import com.finalProject.mappin.guide.model.vo.Guide_Review;

public interface Guide_ReviewService {

	List<Guide_Review> selectList();

	int insert(Guide_Review guide_Reivew);

	int update(Guide_Review guide_Reivew);

	int delete(int review_id);

}
