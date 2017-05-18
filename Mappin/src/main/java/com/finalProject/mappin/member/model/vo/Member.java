package com.finalProject.mappin.member.model.vo;

import java.util.Date;

public class Member implements java.io.Serializable {

	private String member_id;
	private String member_pwd;
	private String member_name;
	private String email;
	private String gender;
	private Date birth_date;
	private String profile_img;
	private String phone;
	private String address;
	private String facebook;
	private String insta;
	private String account_name;
	private String account_num;
	
	public Member() {
		super();
	}

	public Member(String member_id, String member_pwd, String member_name, String email, String gender, Date birth_date,
			String profile_img, String phone, String address, String facebook, String insta, String account_name,
			String account_num) {
		super();
		this.member_id = member_id;
		this.member_pwd = member_pwd;
		this.member_name = member_name;
		this.email = email;
		this.gender = gender;
		this.birth_date = birth_date;
		this.profile_img = profile_img;
		this.phone = phone;
		this.address = address;
		this.facebook = facebook;
		this.insta = insta;
		this.account_name = account_name;
		this.account_num = account_num;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pwd() {
		return member_pwd;
	}

	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getProfile_img() {
		return profile_img;
	}

	public void setProfile_img(String profile_img) {
		this.profile_img = profile_img;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInsta() {
		return insta;
	}

	public void setInsta(String insta) {
		this.insta = insta;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getAccount_num() {
		return account_num;
	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", member_pwd=" + member_pwd + ", member_name=" + member_name
				+ ", email=" + email + ", gender=" + gender + ", birth_date=" + birth_date + ", profile_img="
				+ profile_img + ", phone=" + phone + ", address=" + address + ", facebook=" + facebook + ", insta="
				+ insta + ", account_name=" + account_name + ", account_num=" + account_num + "]";
	}


}