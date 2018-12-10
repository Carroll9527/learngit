package com.yiya.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FollowInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowInformationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesIsNull() {
            addCriterion("submission_times is null");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesIsNotNull() {
            addCriterion("submission_times is not null");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesEqualTo(Date value) {
            addCriterion("submission_times =", value, "submission_times");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesNotEqualTo(Date value) {
            addCriterion("submission_times <>", value, "submission_times");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesGreaterThan(Date value) {
            addCriterion("submission_times >", value, "submission_times");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesGreaterThanOrEqualTo(Date value) {
            addCriterion("submission_times >=", value, "submission_times");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesLessThan(Date value) {
            addCriterion("submission_times <", value, "submission_times");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesLessThanOrEqualTo(Date value) {
            addCriterion("submission_times <=", value, "submission_times");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesIn(List<Date> values) {
            addCriterion("submission_times in", values, "submission_times");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesNotIn(List<Date> values) {
            addCriterion("submission_times not in", values, "submission_times");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesBetween(Date value1, Date value2) {
            addCriterion("submission_times between", value1, value2, "submission_times");
            return (Criteria) this;
        }

        public Criteria andSubmission_timesNotBetween(Date value1, Date value2) {
            addCriterion("submission_times not between", value1, value2, "submission_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesIsNull() {
            addCriterion("visit_times is null");
            return (Criteria) this;
        }

        public Criteria andVisit_timesIsNotNull() {
            addCriterion("visit_times is not null");
            return (Criteria) this;
        }

        public Criteria andVisit_timesEqualTo(String value) {
            addCriterion("visit_times =", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesNotEqualTo(String value) {
            addCriterion("visit_times <>", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesGreaterThan(String value) {
            addCriterion("visit_times >", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesGreaterThanOrEqualTo(String value) {
            addCriterion("visit_times >=", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesLessThan(String value) {
            addCriterion("visit_times <", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesLessThanOrEqualTo(String value) {
            addCriterion("visit_times <=", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesLike(String value) {
            addCriterion("visit_times like", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesNotLike(String value) {
            addCriterion("visit_times not like", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesIn(List<String> values) {
            addCriterion("visit_times in", values, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesNotIn(List<String> values) {
            addCriterion("visit_times not in", values, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesBetween(String value1, String value2) {
            addCriterion("visit_times between", value1, value2, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesNotBetween(String value1, String value2) {
            addCriterion("visit_times not between", value1, value2, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsIsNull() {
            addCriterion("visit_contents is null");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsIsNotNull() {
            addCriterion("visit_contents is not null");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsEqualTo(String value) {
            addCriterion("visit_contents =", value, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsNotEqualTo(String value) {
            addCriterion("visit_contents <>", value, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsGreaterThan(String value) {
            addCriterion("visit_contents >", value, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsGreaterThanOrEqualTo(String value) {
            addCriterion("visit_contents >=", value, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsLessThan(String value) {
            addCriterion("visit_contents <", value, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsLessThanOrEqualTo(String value) {
            addCriterion("visit_contents <=", value, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsLike(String value) {
            addCriterion("visit_contents like", value, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsNotLike(String value) {
            addCriterion("visit_contents not like", value, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsIn(List<String> values) {
            addCriterion("visit_contents in", values, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsNotIn(List<String> values) {
            addCriterion("visit_contents not in", values, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsBetween(String value1, String value2) {
            addCriterion("visit_contents between", value1, value2, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andVisit_contentsNotBetween(String value1, String value2) {
            addCriterion("visit_contents not between", value1, value2, "visit_contents");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansIsNull() {
            addCriterion("next_week_plans is null");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansIsNotNull() {
            addCriterion("next_week_plans is not null");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansEqualTo(String value) {
            addCriterion("next_week_plans =", value, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansNotEqualTo(String value) {
            addCriterion("next_week_plans <>", value, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansGreaterThan(String value) {
            addCriterion("next_week_plans >", value, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansGreaterThanOrEqualTo(String value) {
            addCriterion("next_week_plans >=", value, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansLessThan(String value) {
            addCriterion("next_week_plans <", value, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansLessThanOrEqualTo(String value) {
            addCriterion("next_week_plans <=", value, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansLike(String value) {
            addCriterion("next_week_plans like", value, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansNotLike(String value) {
            addCriterion("next_week_plans not like", value, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansIn(List<String> values) {
            addCriterion("next_week_plans in", values, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansNotIn(List<String> values) {
            addCriterion("next_week_plans not in", values, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansBetween(String value1, String value2) {
            addCriterion("next_week_plans between", value1, value2, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andNext_week_plansNotBetween(String value1, String value2) {
            addCriterion("next_week_plans not between", value1, value2, "next_week_plans");
            return (Criteria) this;
        }

        public Criteria andClassificationsIsNull() {
            addCriterion("classifications is null");
            return (Criteria) this;
        }

        public Criteria andClassificationsIsNotNull() {
            addCriterion("classifications is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationsEqualTo(String value) {
            addCriterion("classifications =", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsNotEqualTo(String value) {
            addCriterion("classifications <>", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsGreaterThan(String value) {
            addCriterion("classifications >", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsGreaterThanOrEqualTo(String value) {
            addCriterion("classifications >=", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsLessThan(String value) {
            addCriterion("classifications <", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsLessThanOrEqualTo(String value) {
            addCriterion("classifications <=", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsLike(String value) {
            addCriterion("classifications like", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsNotLike(String value) {
            addCriterion("classifications not like", value, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsIn(List<String> values) {
            addCriterion("classifications in", values, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsNotIn(List<String> values) {
            addCriterion("classifications not in", values, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsBetween(String value1, String value2) {
            addCriterion("classifications between", value1, value2, "classifications");
            return (Criteria) this;
        }

        public Criteria andClassificationsNotBetween(String value1, String value2) {
            addCriterion("classifications not between", value1, value2, "classifications");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesIsNull() {
            addCriterion("expected_release_dates is null");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesIsNotNull() {
            addCriterion("expected_release_dates is not null");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesEqualTo(String value) {
            addCriterion("expected_release_dates =", value, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesNotEqualTo(String value) {
            addCriterion("expected_release_dates <>", value, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesGreaterThan(String value) {
            addCriterion("expected_release_dates >", value, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesGreaterThanOrEqualTo(String value) {
            addCriterion("expected_release_dates >=", value, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesLessThan(String value) {
            addCriterion("expected_release_dates <", value, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesLessThanOrEqualTo(String value) {
            addCriterion("expected_release_dates <=", value, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesLike(String value) {
            addCriterion("expected_release_dates like", value, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesNotLike(String value) {
            addCriterion("expected_release_dates not like", value, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesIn(List<String> values) {
            addCriterion("expected_release_dates in", values, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesNotIn(List<String> values) {
            addCriterion("expected_release_dates not in", values, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesBetween(String value1, String value2) {
            addCriterion("expected_release_dates between", value1, value2, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andExpected_release_datesNotBetween(String value1, String value2) {
            addCriterion("expected_release_dates not between", value1, value2, "expected_release_dates");
            return (Criteria) this;
        }

        public Criteria andBudgetsIsNull() {
            addCriterion("budgets is null");
            return (Criteria) this;
        }

        public Criteria andBudgetsIsNotNull() {
            addCriterion("budgets is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetsEqualTo(String value) {
            addCriterion("budgets =", value, "budgets");
            return (Criteria) this;
        }

        public Criteria andBudgetsNotEqualTo(String value) {
            addCriterion("budgets <>", value, "budgets");
            return (Criteria) this;
        }

        public Criteria andBudgetsGreaterThan(String value) {
            addCriterion("budgets >", value, "budgets");
            return (Criteria) this;
        }

        public Criteria andBudgetsGreaterThanOrEqualTo(String value) {
            addCriterion("budgets >=", value, "budgets");
            return (Criteria) this;
        }

        public Criteria andBudgetsLessThan(String value) {
            addCriterion("budgets <", value, "budgets");
            return (Criteria) this;
        }

        public Criteria andBudgetsLessThanOrEqualTo(String value) {
            addCriterion("budgets <=", value, "budgets");
            return (Criteria) this;
        }

        public Criteria andBudgetsLike(String value) {
            addCriterion("budgets like", value, "budgets");
            return (Criteria) this;
        }

        public Criteria andBudgetsNotLike(String value) {
            addCriterion("budgets not like", value, "budgets");
            return (Criteria) this;
        }

        public Criteria andBudgetsIn(List<String> values) {
            addCriterion("budgets in", values, "budgets");
            return (Criteria) this;
        }

        public Criteria andBudgetsNotIn(List<String> values) {
            addCriterion("budgets not in", values, "budgets");
            return (Criteria) this;
        }

        public Criteria andBudgetsBetween(String value1, String value2) {
            addCriterion("budgets between", value1, value2, "budgets");
            return (Criteria) this;
        }

        public Criteria andBudgetsNotBetween(String value1, String value2) {
            addCriterion("budgets not between", value1, value2, "budgets");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsIsNull() {
            addCriterion("specific_positions is null");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsIsNotNull() {
            addCriterion("specific_positions is not null");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsEqualTo(String value) {
            addCriterion("specific_positions =", value, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsNotEqualTo(String value) {
            addCriterion("specific_positions <>", value, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsGreaterThan(String value) {
            addCriterion("specific_positions >", value, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsGreaterThanOrEqualTo(String value) {
            addCriterion("specific_positions >=", value, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsLessThan(String value) {
            addCriterion("specific_positions <", value, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsLessThanOrEqualTo(String value) {
            addCriterion("specific_positions <=", value, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsLike(String value) {
            addCriterion("specific_positions like", value, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsNotLike(String value) {
            addCriterion("specific_positions not like", value, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsIn(List<String> values) {
            addCriterion("specific_positions in", values, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsNotIn(List<String> values) {
            addCriterion("specific_positions not in", values, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsBetween(String value1, String value2) {
            addCriterion("specific_positions between", value1, value2, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionsNotBetween(String value1, String value2) {
            addCriterion("specific_positions not between", value1, value2, "specific_positions");
            return (Criteria) this;
        }

        public Criteria andMediatypesIsNull() {
            addCriterion("mediatypes is null");
            return (Criteria) this;
        }

        public Criteria andMediatypesIsNotNull() {
            addCriterion("mediatypes is not null");
            return (Criteria) this;
        }

        public Criteria andMediatypesEqualTo(String value) {
            addCriterion("mediatypes =", value, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andMediatypesNotEqualTo(String value) {
            addCriterion("mediatypes <>", value, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andMediatypesGreaterThan(String value) {
            addCriterion("mediatypes >", value, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andMediatypesGreaterThanOrEqualTo(String value) {
            addCriterion("mediatypes >=", value, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andMediatypesLessThan(String value) {
            addCriterion("mediatypes <", value, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andMediatypesLessThanOrEqualTo(String value) {
            addCriterion("mediatypes <=", value, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andMediatypesLike(String value) {
            addCriterion("mediatypes like", value, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andMediatypesNotLike(String value) {
            addCriterion("mediatypes not like", value, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andMediatypesIn(List<String> values) {
            addCriterion("mediatypes in", values, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andMediatypesNotIn(List<String> values) {
            addCriterion("mediatypes not in", values, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andMediatypesBetween(String value1, String value2) {
            addCriterion("mediatypes between", value1, value2, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andMediatypesNotBetween(String value1, String value2) {
            addCriterion("mediatypes not between", value1, value2, "mediatypes");
            return (Criteria) this;
        }

        public Criteria andWkidIsNull() {
            addCriterion("wkid is null");
            return (Criteria) this;
        }

        public Criteria andWkidIsNotNull() {
            addCriterion("wkid is not null");
            return (Criteria) this;
        }

        public Criteria andWkidEqualTo(Integer value) {
            addCriterion("wkid =", value, "wkid");
            return (Criteria) this;
        }

        public Criteria andWkidNotEqualTo(Integer value) {
            addCriterion("wkid <>", value, "wkid");
            return (Criteria) this;
        }

        public Criteria andWkidGreaterThan(Integer value) {
            addCriterion("wkid >", value, "wkid");
            return (Criteria) this;
        }

        public Criteria andWkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wkid >=", value, "wkid");
            return (Criteria) this;
        }

        public Criteria andWkidLessThan(Integer value) {
            addCriterion("wkid <", value, "wkid");
            return (Criteria) this;
        }

        public Criteria andWkidLessThanOrEqualTo(Integer value) {
            addCriterion("wkid <=", value, "wkid");
            return (Criteria) this;
        }

        public Criteria andWkidIn(List<Integer> values) {
            addCriterion("wkid in", values, "wkid");
            return (Criteria) this;
        }

        public Criteria andWkidNotIn(List<Integer> values) {
            addCriterion("wkid not in", values, "wkid");
            return (Criteria) this;
        }

        public Criteria andWkidBetween(Integer value1, Integer value2) {
            addCriterion("wkid between", value1, value2, "wkid");
            return (Criteria) this;
        }

        public Criteria andWkidNotBetween(Integer value1, Integer value2) {
            addCriterion("wkid not between", value1, value2, "wkid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}