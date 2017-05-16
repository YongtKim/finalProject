package com.finalProject.mappin.community.model.vo;

import java.io.Serializable;

public class Community_img implements Serializable{
	private int community_id;
	private int img_num;
	private String img_path;
	public Community_img() {
		super();
	}
	public Community_img(int community_id, int img_num, String img_path) {
		super();
		this.community_id = community_id;
		this.img_num = img_num;
		this.img_path = img_path;
	}
	public int getCommunity_id() {
		return community_id;
	}
	public void setCommunity_id(int community_id) {
		this.community_id = community_id;
	}
	public int getImg_num() {
		return img_num;
	}
	public void setImg_num(int img_num) {
		this.img_num = img_num;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	@Override
	public String toString() {
		return "Community_img [community_id=" + community_id + ", img_num=" + img_num + ", img_path=" + img_path + "]";
	}
	
	
}
