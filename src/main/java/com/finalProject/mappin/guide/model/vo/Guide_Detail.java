package com.finalProject.mappin.guide.model.vo;

import java.sql.Date;

public class Guide_Detail {

	private int package_id;
	private int package_start;
	private int package_end;
	private int content_id;
	private int content_type;

	public Guide_Detail() {
		super();
	}

	public Guide_Detail(int package_id, int package_start, int package_end, int content_id, int content_type) {
		super();
		this.package_id = package_id;
		this.package_start = package_start;
		this.package_end = package_end;
		this.content_id = content_id;
		this.content_type = content_type;
	}

	public int getPackage_id() {
		return package_id;
	}

	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}

	public int getPackage_start() {
		return package_start;
	}

	public void setPackage_start(int package_start) {
		this.package_start = package_start;
	}

	public int getPackage_end() {
		return package_end;
	}

	public void setPackage_end(int package_end) {
		this.package_end = package_end;
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

	@Override
	public String toString() {
		return "Guide_Detail [package_id=" + package_id + ", package_start=" + package_start + ", package_end="
				+ package_end + ", content_id=" + content_id + ", content_type=" + content_type + "]";
	}

	
}
