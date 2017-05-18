package com.finalProject.mappin.traveler.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.traveler.model.vo.Bucket;

@Repository("bucketDao")
public class BucketDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Bucket> detailBucket(int plan_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteBucket(int plan_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertBucket(List<Bucket> bucketList) {
		// TODO Auto-generated method stub
		return 0;
	}

}
