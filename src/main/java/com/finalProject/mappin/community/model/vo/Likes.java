package com.finalProject.mappin.community.model.vo;

import java.io.Serializable;

public class Likes implements Serializable{
	private String member_id;
	private int community_id;
	public Likes() {
		super();
	}
	public Likes(String member_id, int community_id) {
		super();
		this.member_id = member_id;
		this.community_id = community_id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public int getCommunity_id() {
		return community_id;
	}
	public void setCommunity_id(int community_id) {
		this.community_id = community_id;
	}
	@Override
	public String toString() {
		return "Likes [member_id=" + member_id + ", community_id=" + community_id + "]";
	}
	
	
}
