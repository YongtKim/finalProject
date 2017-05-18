package com.finalProject.mappin.traveler.model.vo;

import java.sql.Date;

public class Bucket {
	private int plan_id;
	private int package_id;
	private Date bucket_today;
	private int bucket_state;
	
	public Bucket(){}

	public Bucket(int plan_id, int package_id, Date bucket_today, int bucket_state) {
		super();
		this.plan_id = plan_id;
		this.package_id = package_id;
		this.bucket_today = bucket_today;
		this.bucket_state = bucket_state;
	}

	public int getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}

	public int getPackage_id() {
		return package_id;
	}

	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}

	public Date getBucket_today() {
		return bucket_today;
	}

	public void setBucket_today(Date bucket_today) {
		this.bucket_today = bucket_today;
	}

	public int getBucket_state() {
		return bucket_state;
	}

	public void setBucket_state(int bucket_state) {
		this.bucket_state = bucket_state;
	}

	@Override
	public String toString() {
		return "Bucket [plan_id=" + plan_id + ", package_id=" + package_id + ", bucket_today=" + bucket_today
				+ ", bucket_state=" + bucket_state + "]";
	}
	
	
}
