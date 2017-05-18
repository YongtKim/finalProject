package com.finalProject.mappin.community.model.service;

import java.util.List;

import com.finalProject.mappin.community.model.vo.Comments;

public interface CommentsService {

	List<Comments> selectList(int community_id);

}
