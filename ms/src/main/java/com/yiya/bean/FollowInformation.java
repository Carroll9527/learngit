package com.yiya.bean;

import java.util.Date;

public class FollowInformation {
    private Integer id;

    private Date submission_times;

    private String visit_times;

    private String visit_contents;

    private String next_week_plans;

    private String classifications;

    private String expected_release_dates;

    private String budgets;

    private String specific_positions;

    private String mediatypes;

    private Integer wkid;
    
    public Weekly weekly;

    public Weekly getWeekly() {
		return weekly;
	}

	public void setWeekly(Weekly weekly) {
		this.weekly = weekly;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSubmission_times() {
        return submission_times;
    }

    public void setSubmission_times(Date submission_times) {
        this.submission_times = submission_times;
    }

    public String getVisit_times() {
        return visit_times;
    }

    public void setVisit_times(String visit_times) {
        this.visit_times = visit_times == null ? null : visit_times.trim();
    }

    public String getVisit_contents(){
        return visit_contents;
    }

    public void setVisit_contents(String visit_contents) {
        this.visit_contents = visit_contents == null ? null : visit_contents.trim();
    }
    
    public String getNext_week_plans() {
        return next_week_plans;
    }

    public void setNext_week_plans(String next_week_plans) {
        this.next_week_plans = next_week_plans == null ? null : next_week_plans.trim();
    }

    public String getClassifications() {
        return classifications;
    }

    public void setClassifications(String classifications) {
        this.classifications = classifications == null ? null : classifications.trim();
    }

    public String getExpected_release_dates() {
        return expected_release_dates;
    }

    public void setExpected_release_dates(String expected_release_dates) {
        this.expected_release_dates = expected_release_dates == null ? null : expected_release_dates.trim();
    }

    public String getBudgets() {
        return budgets;
    }

    public void setBudgets(String budgets) {
        this.budgets = budgets == null ? null : budgets.trim();
    }

    public String getSpecific_positions() {
        return specific_positions;
    }

    public void setSpecific_positions(String specific_positions) {
        this.specific_positions = specific_positions == null ? null : specific_positions.trim();
    }

    public String getMediatypes() {
        return mediatypes;
    }

    public void setMediatypes(String mediatypes) {
        this.mediatypes = mediatypes == null ? null : mediatypes.trim();
    }

    public Integer getWkid() {
        return wkid;
    }

    public void setWkid(Integer wkid) {
        this.wkid = wkid;
    }
    
    public String toString() {
		return  "FollowInformation [id="+id+",vistime="+visit_times+",wid="+wkid+"]";
    }
}