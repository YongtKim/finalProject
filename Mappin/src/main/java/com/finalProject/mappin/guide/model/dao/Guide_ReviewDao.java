package com.finalProject.mappin.guide.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.finalProject.mappin.guide.model.vo.Guide_Review;

@Repository("guide_ReviewDao")
public class Guide_ReviewDao {

	@Autowired
	private SqlSession sqlSession;

	public Guide_ReviewDao() {
	}

	public List<Guide_Review> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(Guide_Review guide_Reivew) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Guide_Review guide_Reivew) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int review_id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
