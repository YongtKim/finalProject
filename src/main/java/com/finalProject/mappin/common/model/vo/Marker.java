package com.finalProject.mappin.common.model.vo;

import java.io.Serializable;

public class Marker implements Serializable{

	private int MAP_X;
	private int MAP_Y;
	private String MARKER_NAME;
	private int CONTENT_ID;
	private int CONTENT_TYPE;
	private String MEMBER_ID;
	private String MARKER_OVERVIEW;
	private String MARKER_ADDRESS;
	private String MARKER_URL;
	private String MARKER_TEL;
	private String MARKER_IMG;
	public Marker() {
		super();
	}
	public Marker(int mAP_X, int mAP_Y, String mARKER_NAME, int cONTENT_ID, int cONTENT_TYPE, String mEMBER_ID,
			String mARKER_OVERVIEW, String mARKER_ADDRESS, String mARKER_URL, String mARKER_TEL, String mARKER_IMG) {
		super();
		MAP_X = mAP_X;
		MAP_Y = mAP_Y;
		MARKER_NAME = mARKER_NAME;
		CONTENT_ID = cONTENT_ID;
		CONTENT_TYPE = cONTENT_TYPE;
		MEMBER_ID = mEMBER_ID;
		MARKER_OVERVIEW = mARKER_OVERVIEW;
		MARKER_ADDRESS = mARKER_ADDRESS;
		MARKER_URL = mARKER_URL;
		MARKER_TEL = mARKER_TEL;
		MARKER_IMG = mARKER_IMG;
	}
	public int getMAP_X() {
		return MAP_X;
	}
	public void setMAP_X(int mAP_X) {
		MAP_X = mAP_X;
	}
	public int getMAP_Y() {
		return MAP_Y;
	}
	public void setMAP_Y(int mAP_Y) {
		MAP_Y = mAP_Y;
	}
	public String getMARKER_NAME() {
		return MARKER_NAME;
	}
	public void setMARKER_NAME(String mARKER_NAME) {
		MARKER_NAME = mARKER_NAME;
	}
	public int getCONTENT_ID() {
		return CONTENT_ID;
	}
	public void setCONTENT_ID(int cONTENT_ID) {
		CONTENT_ID = cONTENT_ID;
	}
	public int getCONTENT_TYPE() {
		return CONTENT_TYPE;
	}
	public void setCONTENT_TYPE(int cONTENT_TYPE) {
		CONTENT_TYPE = cONTENT_TYPE;
	}
	public String getMEMBER_ID() {
		return MEMBER_ID;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}
	public String getMARKER_OVERVIEW() {
		return MARKER_OVERVIEW;
	}
	public void setMARKER_OVERVIEW(String mARKER_OVERVIEW) {
		MARKER_OVERVIEW = mARKER_OVERVIEW;
	}
	public String getMARKER_ADDRESS() {
		return MARKER_ADDRESS;
	}
	public void setMARKER_ADDRESS(String mARKER_ADDRESS) {
		MARKER_ADDRESS = mARKER_ADDRESS;
	}
	public String getMARKER_URL() {
		return MARKER_URL;
	}
	public void setMARKER_URL(String mARKER_URL) {
		MARKER_URL = mARKER_URL;
	}
	public String getMARKER_TEL() {
		return MARKER_TEL;
	}
	public void setMARKER_TEL(String mARKER_TEL) {
		MARKER_TEL = mARKER_TEL;
	}
	public String getMARKER_IMG() {
		return MARKER_IMG;
	}
	public void setMARKER_IMG(String mARKER_IMG) {
		MARKER_IMG = mARKER_IMG;
	}
	@Override
	public String toString() {
		return "Marker [MAP_X=" + MAP_X + ", MAP_Y=" + MAP_Y + ", MARKER_NAME=" + MARKER_NAME + ", CONTENT_ID="
				+ CONTENT_ID + ", CONTENT_TYPE=" + CONTENT_TYPE + ", MEMBER_ID=" + MEMBER_ID + ", MARKER_OVERVIEW="
				+ MARKER_OVERVIEW + ", MARKER_ADDRESS=" + MARKER_ADDRESS + ", MARKER_URL=" + MARKER_URL
				+ ", MARKER_TEL=" + MARKER_TEL + ", MARKER_IMG=" + MARKER_IMG + "]";
	}
	

	
}
