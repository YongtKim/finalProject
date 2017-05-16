package com.finalProject.mappin.community.model.vo;

import java.io.Serializable;

public class Scrapin implements Serializable{
	private String Member_Id;
	private int Community_Id;
	
	public Scrapin() {
		super();
	}
	public Scrapin(String member_Id, int community_Id) {
		super();
		Member_Id = member_Id;
		Community_Id = community_Id;
	}
	
	public String getMember_Id() {
		return Member_Id;
	}
	public void setMember_Id(String member_Id) {
		Member_Id = member_Id;
	}
	public int getCommunity_Id() {
		return Community_Id;
	}
	public void setCommunity_Id(int community_Id) {
		Community_Id = community_Id;
	}
	@Override
	public String toString() {
		return "Scapin [Member_Id=" + Member_Id + ", Community_Id=" + Community_Id + "]";
	}
	
	
}
