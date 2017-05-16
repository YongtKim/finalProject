package com.finalProject.mappin.guide.model.vo;

public class Guide_Review {

	private int package_id;
	private int review_id;
	private int star_point;
	private String member_id;
	private String review_img;

	public Guide_Review() {
		super();
	}

	public Guide_Review(int package_id, int review_id, int star_point, String member_id, String review_img) {
		super();
		this.package_id = package_id;
		this.review_id = review_id;
		this.star_point = star_point;
		this.member_id = member_id;
		this.review_img = review_img;
	}

	public int getPackage_id() {
		return package_id;
	}

	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public int getStar_point() {
		return star_point;
	}

	public void setStar_point(int star_point) {
		this.star_point = star_point;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getReview_img() {
		return review_img;
	}

	public void setReview_img(String review_img) {
		this.review_img = review_img;
	}

	@Override
	public String toString() {
		return "Guide_review [package_id=" + package_id + ", review_id=" + review_id + ", star_point=" + star_point
				+ ", member_id=" + member_id + ", review_img=" + review_img + "]";
	}

}
