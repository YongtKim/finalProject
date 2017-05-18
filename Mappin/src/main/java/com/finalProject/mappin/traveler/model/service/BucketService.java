package com.finalProject.mappin.traveler.model.service;

import java.util.List;

import com.finalProject.mappin.traveler.model.vo.Bucket;

public interface BucketService {

	List<Bucket> detailBucket(int plan_id);

	int deleteBucket(int plan_id);

	int insertBucket(List<Bucket> bucketList);

}
