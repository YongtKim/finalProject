package com.finalProject.mappin.common.model.vo;

import java.io.Serializable;

public class Location implements Serializable{

	private int location_id;
	private String country_name;
	private String location_name;
	public Location() {
		super();
	}
	public Location(int location_id, String country_name, String location_name) {
		super();
		this.location_id = location_id;
		this.country_name = country_name;
		this.location_name = location_name;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	@Override
	public String toString() {
		return "Location [location_id=" + location_id + ", country_name=" + country_name + ", location_name="
				+ location_name + "]";
	}
}
	
