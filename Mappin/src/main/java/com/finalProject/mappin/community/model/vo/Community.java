package com.finalProject.mappin.community.model.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Community implements Serializable {
	private int community_id;
	private String community_title;
	private String community_content;
	private String keyword;
	private String member_id;
	private String location_id;
	private Date enroll_date;
	private int content_type;
	private int content_id;
	private List<Community_img> img_path;
	public Community() {
		super();
	}
	public Community(int community_id, String community_title, String community_content, String keyword,
			String member_id, String location_id, Date enroll_date, int content_type, int content_id,
			List<Community_img> img_path) {
		super();
		this.community_id = community_id;
		this.community_title = community_title;
		this.community_content = community_content;
		this.keyword = keyword;
		this.member_id = member_id;
		this.location_id = location_id;
		this.enroll_date = enroll_date;
		this.content_type = content_type;
		this.content_id = content_id;
		this.img_path = img_path;
	}
	public int getCommunity_id() {
		return community_id;
	}
	public void setCommunity_id(int community_id) {
		this.community_id = community_id;
	}
	public String getCommunity_title() {
		return community_title;
	}
	public void setCommunity_title(String community_title) {
		this.community_title = community_title;
	}
	public String getCommunity_content() {
		return community_content;
	}
	public void setCommunity_content(String community_content) {
		this.community_content = community_content;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getLocation_id() {
		return location_id;
	}
	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}
	public Date getEnroll_date() {
		return enroll_date;
	}
	public void setEnroll_date(Date enroll_date) {
		this.enroll_date = enroll_date;
	}
	public int getContent_type() {
		return content_type;
	}
	public void setContent_type(int content_type) {
		this.content_type = content_type;
	}
	public int getContent_id() {
		return content_id;
	}
	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}
	public List<Community_img> getImg_path() {
		return img_path;
	}
	public void setImg_path(List<Community_img> img_path) {
		this.img_path = img_path;
	}
	@Override
	public String toString() {
		return "Community [community_id=" + community_id + ", community_title=" + community_title
				+ ", community_content=" + community_content + ", keyword=" + keyword + ", member_id=" + member_id
				+ ", location_id=" + location_id + ", enroll_date=" + enroll_date + ", content_type=" + content_type
				+ ", content_id=" + content_id + ", img_path=" + img_path + "]";
	}
	
}
