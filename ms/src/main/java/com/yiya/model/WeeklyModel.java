package com.yiya.model;

import java.util.Date;

public class WeeklyModel extends BaseModel {

	private String budget;

	private String classification;

	private String customerName;

	private String expectedReleaseDate;
	private String fullCustomerName;
	private Integer id;

	private String mainBrand;

	private String mediatype;

	private String nextWeekPlan;

	private String post;

	private String remarks;

	private String specificPosition;

	private String subbrand;

	private String visitContent;

	private Date visitTime;

	public String getBudget() {
		return budget;
	}

	public String getClassification() {
		return classification;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getExpectedReleaseDate() {
		return expectedReleaseDate;
	}

	public String getFullCustomerName() {
		return fullCustomerName;
	}

	public Integer getId() {
		return id;
	}

	public String getMainBrand() {
		return mainBrand;
	}

	public String getMediatype() {
		return mediatype;
	}

	public String getNextWeekPlan() {
		return nextWeekPlan;
	}

	public String getPost() {
		return post;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getSpecificPosition() {
		return specificPosition;
	}

	public String getSubbrand() {
		return subbrand;
	}

	public String getVisitContent() {
		return visitContent;
	}

	public Date getVisitTime() {
		return visitTime;
	}

	public void setBudget(String budget) {
		this.budget = budget == null ? null : budget.trim();
	}

	public void setClassification(String classification) {
		this.classification = classification == null ? null : classification.trim();
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName == null ? null : customerName.trim();
	}

	public void setExpectedReleaseDate(String expectedReleaseDate) {
		this.expectedReleaseDate = expectedReleaseDate == null ? null : expectedReleaseDate.trim();
	}

	public void setFullCustomerName(String fullCustomerName) {
		this.fullCustomerName = fullCustomerName == null ? null : fullCustomerName.trim();
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMainBrand(String mainBrand) {
		this.mainBrand = mainBrand == null ? null : mainBrand.trim();
	}

	public void setMediatype(String mediatype) {
		this.mediatype = mediatype == null ? null : mediatype.trim();
	}

	public void setNextWeekPlan(String nextWeekPlan) {
		this.nextWeekPlan = nextWeekPlan == null ? null : nextWeekPlan.trim();
	}

	public void setPost(String post) {
		this.post = post == null ? null : post.trim();
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

	public void setSpecificPosition(String specificPosition) {
		this.specificPosition = specificPosition == null ? null : specificPosition.trim();
	}

	public void setSubbrand(String subbrand) {
		this.subbrand = subbrand == null ? null : subbrand.trim();
	}

	public void setVisitContent(String visitContent) {
		this.visitContent = visitContent == null ? null : visitContent.trim();
	}

	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}
}