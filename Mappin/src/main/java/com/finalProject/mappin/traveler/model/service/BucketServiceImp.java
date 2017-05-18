package com.finalProject.mappin.traveler.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.mappin.traveler.model.dao.BucketDao;
import com.finalProject.mappin.traveler.model.vo.Bucket;

@Service("bucketService")
public class BucketServiceImp implements BucketService {

	@Autowired
	private BucketDao bucketDao;
	
	@Override
	public List<Bucket> detailBucket(int plan_id) {
		List<Bucket> bucketList = bucketDao.detailBucket(plan_id);
		return bucketList;
	}

	@Override
	public int deleteBucket(int plan_id) {
		int result = bucketDao.deleteBucket(plan_id);
		return result;
	}

	@Override
	public int insertBucket(List<Bucket> bucketList) {
		int result = bucketDao.insertBucket(bucketList);
		return result;
	}

}
