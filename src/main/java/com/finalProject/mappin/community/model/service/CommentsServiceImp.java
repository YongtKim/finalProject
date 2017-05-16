package com.finalProject.mappin.community.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.mappin.community.model.dao.CommentsDao;
import com.finalProject.mappin.community.model.vo.Comments;

@Service("commentsService")
@Transactional
public class CommentsServiceImp implements CommentsService{

	@Autowired
	private CommentsDao commentsDao;
	
	@Override
	public List<Comments> selectList(int community_id) {
		return commentsDao.selectList(community_id);
	}

}
