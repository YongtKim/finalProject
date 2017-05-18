package com.finalProject.mappin.common.model.vo;

import java.io.Serializable;

public class Marker implements Serializable{

	private Double map_x;
	private Double map_y;
	private String marker_name;
	private int content_id;
	private int content_type;
	private String member_id;
	private String member_overview;
	private String marker_address;
	private String marker_url;
	private String marker_tel;
	private String marker_img;
	public Marker() {
		super();
	}
	public Marker(Double mAP_X, Double mAP_Y, String mARKER_NAME, int cONTENT_ID, int cONTENT_TYPE, String mEMBER_ID,
			String mARKER_OVERVIEW, String mARKER_ADDRESS, String mARKER_URL, String mARKER_TEL, String mARKER_IMG) {
		super();
		map_x = mAP_X;
		map_y = mAP_Y;
		marker_name = mARKER_NAME;
		content_id = cONTENT_ID;
		content_type = cONTENT_TYPE;
		member_id = mEMBER_ID;
		member_overview = mARKER_OVERVIEW;
		marker_address = mARKER_ADDRESS;
		marker_url = mARKER_URL;
		marker_tel = mARKER_TEL;
		marker_img = mARKER_IMG;
	}
	public Double getMAP_X() {
		return map_x;
	}
	public void setMAP_X(Double mAP_X) {
		map_x = mAP_X;
	}
	public Double getMAP_Y() {
		return map_y;
	}
	public void setMAP_Y(Double mAP_Y) {
		map_y = mAP_Y;
	}
	public String getMARKER_NAME() {
		return marker_name;
	}
	public void setMARKER_NAME(String mARKER_NAME) {
		marker_name = mARKER_NAME;
	}
	public int getCONTENT_ID() {
		return content_id;
	}
	public void setCONTENT_ID(int cONTENT_ID) {
		content_id = cONTENT_ID;
	}
	public int getCONTENT_TYPE() {
		return content_type;
	}
	public void setCONTENT_TYPE(int cONTENT_TYPE) {
		content_type = cONTENT_TYPE;
	}
	public String getMEMBER_ID() {
		return member_id;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		member_id = mEMBER_ID;
	}
	public String getMARKER_OVERVIEW() {
		return member_overview;
	}
	public void setMARKER_OVERVIEW(String mARKER_OVERVIEW) {
		member_overview = mARKER_OVERVIEW;
	}
	public String getMARKER_ADDRESS() {
		return marker_address;
	}
	public void setMARKER_ADDRESS(String mARKER_ADDRESS) {
		marker_address = mARKER_ADDRESS;
	}
	public String getMARKER_URL() {
		return marker_url;
	}
	public void setMARKER_URL(String mARKER_URL) {
		marker_url = mARKER_URL;
	}
	public String getMARKER_TEL() {
		return marker_tel;
	}
	public void setMARKER_TEL(String mARKER_TEL) {
		marker_tel = mARKER_TEL;
	}
	public String getMARKER_IMG() {
		return marker_img;
	}
	public void setMARKER_IMG(String mARKER_IMG) {
		marker_img = mARKER_IMG;
	}
	@Override
	public String toString() {
		return "Marker [MAP_X=" + map_x + ", MAP_Y=" + map_y + ", MARKER_NAME=" + marker_name + ", CONTENT_ID="
				+ content_id + ", CONTENT_TYPE=" + content_type + ", MEMBER_ID=" + member_id + ", MARKER_OVERVIEW="
				+ member_overview + ", MARKER_ADDRESS=" + marker_address + ", MARKER_URL=" + marker_url
				+ ", MARKER_TEL=" + marker_tel + ", MARKER_IMG=" + marker_img + "]";
	}
	

	
}
