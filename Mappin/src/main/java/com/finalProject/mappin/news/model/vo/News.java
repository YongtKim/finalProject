package com.finalProject.mappin.news.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class News implements Serializable{
	private int news_id;
	private int news_type;
	private String news_title;
	private String news_content;
	private String news_img;
	private Date enroll_Date;
	
	public News(){}

	public News(int news_id, int news_type, String news_title, String news_content, String news_img, Date enroll_Date) {
		super();
		this.news_id = news_id;
		this.news_type = news_type;
		this.news_title = news_title;
		this.news_content = news_content;
		this.news_img = news_img;
		this.enroll_Date = enroll_Date;
	}

	public int getNews_id() {
		return news_id;
	}

	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}

	public int getNews_type() {
		return news_type;
	}

	public void setNews_type(int news_type) {
		this.news_type = news_type;
	}

	public String getNews_title() {
		return news_title;
	}

	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}

	public String getNews_content() {
		return news_content;
	}

	public void setNews_content(String news_content) {
		this.news_content = news_content;
	}

	public String getNews_img() {
		return news_img;
	}

	public void setNews_img(String news_img) {
		this.news_img = news_img;
	}

	public Date getEnroll_Date() {
		return enroll_Date;
	}

	public void setEnroll_Date(Date enroll_Date) {
		this.enroll_Date = enroll_Date;
	}

	@Override
	public String toString() {
		return "News [news_id=" + news_id + ", news_type=" + news_type + ", news_title=" + news_title
				+ ", news_content=" + news_content + ", news_img=" + news_img + ", enroll_Date=" + enroll_Date + "]";
	}
	
}
