package com.finalProject.mappin.traveler.model.vo;

import java.sql.Date;

public class Traveler {
	private int plan_id;
	private String plan_title;
	private String member_id;
	private Date start_date;
	private Date end_date;
	
	public Traveler(){}

	public Traveler(int plan_id, String plan_title, String member_id, Date start_date, Date end_date) {
		super();
		this.plan_id = plan_id;
		this.plan_title = plan_title;
		this.member_id = member_id;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public int getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}

	public String getPlan_title() {
		return plan_title;
	}

	public void setPlan_title(String plan_title) {
		this.plan_title = plan_title;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	@Override
	public String toString() {
		return "Traveler [plan_id=" + plan_id + ", plan_title=" + plan_title + ", member_id=" + member_id
				+ ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
}
