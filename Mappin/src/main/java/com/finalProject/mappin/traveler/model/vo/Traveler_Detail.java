package com.finalProject.mappin.traveler.model.vo;

import java.sql.Date;

public class Traveler_Detail {
	private int plan_id;
	private Date plan_today;
	private int plan_start;
	private int plan_end;
	private int content_id;
	private int content_type;
	private int plan_pay;
	
	public Traveler_Detail(){}
	
	public Traveler_Detail(int plan_id, Date plan_today, int plan_start, int plan_end, int content_id, int content_type,
			int plan_pay) {
		super();
		this.plan_id = plan_id;
		this.plan_today = plan_today;
		this.plan_start = plan_start;
		this.plan_end = plan_end;
		this.content_id = content_id;
		this.content_type = content_type;
		this.plan_pay = plan_pay;
	}

	public int getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}

	public Date getPlan_today() {
		return plan_today;
	}

	public void setPlan_today(Date plan_today) {
		this.plan_today = plan_today;
	}

	public int getPlan_start() {
		return plan_start;
	}

	public void setPlan_start(int plan_start) {
		this.plan_start = plan_start;
	}

	public int getPlan_end() {
		return plan_end;
	}

	public void setPlan_end(int plan_end) {
		this.plan_end = plan_end;
	}

	public int getContent_id() {
		return content_id;
	}

	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}

	public int getContent_type() {
		return content_type;
	}

	public void setContent_type(int content_type) {
		this.content_type = content_type;
	}

	public int getPlan_pay() {
		return plan_pay;
	}

	public void setPlan_pay(int plan_pay) {
		this.plan_pay = plan_pay;
	}

	@Override
	public String toString() {
		return "Traveler_Detail [plan_id=" + plan_id + ", plan_today=" + plan_today + ", plan_start=" + plan_start + ", plan_end=" + plan_end
				+ ", content_id=" + content_id + ", content_type=" + content_type + ", plan_pay=" + plan_pay + "]";
	}
}
