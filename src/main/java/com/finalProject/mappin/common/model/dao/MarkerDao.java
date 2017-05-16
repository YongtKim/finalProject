package com.finalProject.mappin.common.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.common.model.vo.Marker;

@Repository("markerDao")
public class MarkerDao {

	@Autowired
	private SqlSession sqlSession;

	public MarkerDao() {
	}

	public List<Marker> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Marker detail(int content_id, int content_type) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(Marker marker) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(Marker marker) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
