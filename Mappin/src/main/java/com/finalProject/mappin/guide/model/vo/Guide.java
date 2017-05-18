package com.finalProject.mappin.guide.model.vo;

import java.sql.Date;
import java.util.List;

public class Guide {

	private int package_id;
	private String package_title;
	private String member_id;
	private int package_pay;
	private String package_content;
	private String dates;
	private Date enroll_date;
	private List<Guide_Review> reviewList;
	
	public Guide() {
		super();
	}

	public Guide(int package_id, String package_title, String member_id, int package_pay, String package_content,
			String dates, Date enroll_date, List<Guide_Review> reviewList) {
		super();
		this.package_id = package_id;
		this.package_title = package_title;
		this.member_id = member_id;
		this.package_pay = package_pay;
		this.package_content = package_content;
		this.dates = dates;
		this.enroll_date = enroll_date;
		this.reviewList = reviewList;
	}

	public int getPackage_id() {
		return package_id;
	}

	public String getPackage_title() {
		return package_title;
	}

	public String getMember_id() {
		return member_id;
	}

	public int getPackage_pay() {
		return package_pay;
	}

	public String getPackage_content() {
		return package_content;
	}

	public String getDates() {
		return dates;
	}

	public Date getEnroll_date() {
		return enroll_date;
	}

	public List<Guide_Review> getReviewList() {
		return reviewList;
	}

	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}

	public void setPackage_title(String package_title) {
		this.package_title = package_title;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public void setPackage_pay(int package_pay) {
		this.package_pay = package_pay;
	}

	public void setPackage_content(String package_content) {
		this.package_content = package_content;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}

	public void setEnroll_date(Date enroll_date) {
		this.enroll_date = enroll_date;
	}

	public void setReviewList(List<Guide_Review> reviewList) {
		this.reviewList = reviewList;
	}

	@Override
	public String toString() {
		return "Guide [package_id=" + package_id + ", package_title=" + package_title + ", member_id=" + member_id
				+ ", package_pay=" + package_pay + ", package_content=" + package_content + ", dates=" + dates
				+ ", enroll_date=" + enroll_date + ", reviewList=" + reviewList + "]";
	}


}
