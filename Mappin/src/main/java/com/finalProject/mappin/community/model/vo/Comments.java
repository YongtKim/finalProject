package com.finalProject.mappin.community.model.vo;

import java.io.Serializable;

public class Comments implements Serializable{
	private int community_id;
	private int comment_id;
	private String member_id;
	private String comment_content;
	public Comments() {
		super();
	}
	public Comments(int community_id, int comment_id, String member_id, String comment_content) {
		super();
		this.community_id = community_id;
		this.comment_id = comment_id;
		this.member_id = member_id;
		this.comment_content = comment_content;
	}
	public int getCommunity_id() {
		return community_id;
	}
	public void setCommunity_id(int community_id) {
		this.community_id = community_id;
	}
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	@Override
	public String toString() {
		return "Comments [community_id=" + community_id + ", comment_id=" + comment_id + ", member_id=" + member_id
				+ ", comment_content=" + comment_content + "]";
	}
	
	
	
}
