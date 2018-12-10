package com.yiya.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeeklyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeeklyExample() {
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

        public Criteria andFull_customer_nameIsNull() {
            addCriterion("full_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameIsNotNull() {
            addCriterion("full_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameEqualTo(String value) {
            addCriterion("full_customer_name =", value, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameNotEqualTo(String value) {
            addCriterion("full_customer_name <>", value, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameGreaterThan(String value) {
            addCriterion("full_customer_name >", value, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameGreaterThanOrEqualTo(String value) {
            addCriterion("full_customer_name >=", value, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameLessThan(String value) {
            addCriterion("full_customer_name <", value, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameLessThanOrEqualTo(String value) {
            addCriterion("full_customer_name <=", value, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameLike(String value) {
            addCriterion("full_customer_name like", value, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameNotLike(String value) {
            addCriterion("full_customer_name not like", value, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameIn(List<String> values) {
            addCriterion("full_customer_name in", values, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameNotIn(List<String> values) {
            addCriterion("full_customer_name not in", values, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameBetween(String value1, String value2) {
            addCriterion("full_customer_name between", value1, value2, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andFull_customer_nameNotBetween(String value1, String value2) {
            addCriterion("full_customer_name not between", value1, value2, "full_customer_name");
            return (Criteria) this;
        }

        public Criteria andMain_brandIsNull() {
            addCriterion("main_brand is null");
            return (Criteria) this;
        }

        public Criteria andMain_brandIsNotNull() {
            addCriterion("main_brand is not null");
            return (Criteria) this;
        }

        public Criteria andMain_brandEqualTo(String value) {
            addCriterion("main_brand =", value, "main_brand");
            return (Criteria) this;
        }

        public Criteria andMain_brandNotEqualTo(String value) {
            addCriterion("main_brand <>", value, "main_brand");
            return (Criteria) this;
        }

        public Criteria andMain_brandGreaterThan(String value) {
            addCriterion("main_brand >", value, "main_brand");
            return (Criteria) this;
        }

        public Criteria andMain_brandGreaterThanOrEqualTo(String value) {
            addCriterion("main_brand >=", value, "main_brand");
            return (Criteria) this;
        }

        public Criteria andMain_brandLessThan(String value) {
            addCriterion("main_brand <", value, "main_brand");
            return (Criteria) this;
        }

        public Criteria andMain_brandLessThanOrEqualTo(String value) {
            addCriterion("main_brand <=", value, "main_brand");
            return (Criteria) this;
        }

        public Criteria andMain_brandLike(String value) {
            addCriterion("main_brand like", value, "main_brand");
            return (Criteria) this;
        }

        public Criteria andMain_brandNotLike(String value) {
            addCriterion("main_brand not like", value, "main_brand");
            return (Criteria) this;
        }

        public Criteria andMain_brandIn(List<String> values) {
            addCriterion("main_brand in", values, "main_brand");
            return (Criteria) this;
        }

        public Criteria andMain_brandNotIn(List<String> values) {
            addCriterion("main_brand not in", values, "main_brand");
            return (Criteria) this;
        }

        public Criteria andMain_brandBetween(String value1, String value2) {
            addCriterion("main_brand between", value1, value2, "main_brand");
            return (Criteria) this;
        }

        public Criteria andMain_brandNotBetween(String value1, String value2) {
            addCriterion("main_brand not between", value1, value2, "main_brand");
            return (Criteria) this;
        }

        public Criteria andSubbrandIsNull() {
            addCriterion("subbrand is null");
            return (Criteria) this;
        }

        public Criteria andSubbrandIsNotNull() {
            addCriterion("subbrand is not null");
            return (Criteria) this;
        }

        public Criteria andSubbrandEqualTo(String value) {
            addCriterion("subbrand =", value, "subbrand");
            return (Criteria) this;
        }

        public Criteria andSubbrandNotEqualTo(String value) {
            addCriterion("subbrand <>", value, "subbrand");
            return (Criteria) this;
        }

        public Criteria andSubbrandGreaterThan(String value) {
            addCriterion("subbrand >", value, "subbrand");
            return (Criteria) this;
        }

        public Criteria andSubbrandGreaterThanOrEqualTo(String value) {
            addCriterion("subbrand >=", value, "subbrand");
            return (Criteria) this;
        }

        public Criteria andSubbrandLessThan(String value) {
            addCriterion("subbrand <", value, "subbrand");
            return (Criteria) this;
        }

        public Criteria andSubbrandLessThanOrEqualTo(String value) {
            addCriterion("subbrand <=", value, "subbrand");
            return (Criteria) this;
        }

        public Criteria andSubbrandLike(String value) {
            addCriterion("subbrand like", value, "subbrand");
            return (Criteria) this;
        }

        public Criteria andSubbrandNotLike(String value) {
            addCriterion("subbrand not like", value, "subbrand");
            return (Criteria) this;
        }

        public Criteria andSubbrandIn(List<String> values) {
            addCriterion("subbrand in", values, "subbrand");
            return (Criteria) this;
        }

        public Criteria andSubbrandNotIn(List<String> values) {
            addCriterion("subbrand not in", values, "subbrand");
            return (Criteria) this;
        }

        public Criteria andSubbrandBetween(String value1, String value2) {
            addCriterion("subbrand between", value1, value2, "subbrand");
            return (Criteria) this;
        }

        public Criteria andSubbrandNotBetween(String value1, String value2) {
            addCriterion("subbrand not between", value1, value2, "subbrand");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameEqualTo(String value) {
            addCriterion("customer_name =", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameLessThan(String value) {
            addCriterion("customer_name <", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameLike(String value) {
            addCriterion("customer_name like", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameNotLike(String value) {
            addCriterion("customer_name not like", value, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameIn(List<String> values) {
            addCriterion("customer_name in", values, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customer_name");
            return (Criteria) this;
        }

        public Criteria andCustomer_nameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customer_name");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andVisit_timeIsNull() {
            addCriterion("visit_time is null");
            return (Criteria) this;
        }

        public Criteria andVisit_timeIsNotNull() {
            addCriterion("visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andVisit_timeEqualTo(String value) {
            addCriterion("visit_time =", value, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_timeNotEqualTo(String value) {
            addCriterion("visit_time <>", value, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_timeGreaterThan(String value) {
            addCriterion("visit_time >", value, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_timeGreaterThanOrEqualTo(String value) {
            addCriterion("visit_time >=", value, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_timeLessThan(String value) {
            addCriterion("visit_time <", value, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_timeLessThanOrEqualTo(String value) {
            addCriterion("visit_time <=", value, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_timeLike(String value) {
            addCriterion("visit_time like", value, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_timeNotLike(String value) {
            addCriterion("visit_time not like", value, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_timeIn(List<String> values) {
            addCriterion("visit_time in", values, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_timeNotIn(List<String> values) {
            addCriterion("visit_time not in", values, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_timeBetween(String value1, String value2) {
            addCriterion("visit_time between", value1, value2, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_timeNotBetween(String value1, String value2) {
            addCriterion("visit_time not between", value1, value2, "visit_time");
            return (Criteria) this;
        }

        public Criteria andVisit_contentIsNull() {
            addCriterion("visit_content is null");
            return (Criteria) this;
        }

        public Criteria andVisit_contentIsNotNull() {
            addCriterion("visit_content is not null");
            return (Criteria) this;
        }

        public Criteria andVisit_contentEqualTo(String value) {
            addCriterion("visit_content =", value, "visit_content");
            return (Criteria) this;
        }

        public Criteria andVisit_contentNotEqualTo(String value) {
            addCriterion("visit_content <>", value, "visit_content");
            return (Criteria) this;
        }

        public Criteria andVisit_contentGreaterThan(String value) {
            addCriterion("visit_content >", value, "visit_content");
            return (Criteria) this;
        }

        public Criteria andVisit_contentGreaterThanOrEqualTo(String value) {
            addCriterion("visit_content >=", value, "visit_content");
            return (Criteria) this;
        }

        public Criteria andVisit_contentLessThan(String value) {
            addCriterion("visit_content <", value, "visit_content");
            return (Criteria) this;
        }

        public Criteria andVisit_contentLessThanOrEqualTo(String value) {
            addCriterion("visit_content <=", value, "visit_content");
            return (Criteria) this;
        }

        public Criteria andVisit_contentLike(String value) {
            addCriterion("visit_content like", value, "visit_content");
            return (Criteria) this;
        }

        public Criteria andVisit_contentNotLike(String value) {
            addCriterion("visit_content not like", value, "visit_content");
            return (Criteria) this;
        }

        public Criteria andVisit_contentIn(List<String> values) {
            addCriterion("visit_content in", values, "visit_content");
            return (Criteria) this;
        }

        public Criteria andVisit_contentNotIn(List<String> values) {
            addCriterion("visit_content not in", values, "visit_content");
            return (Criteria) this;
        }

        public Criteria andVisit_contentBetween(String value1, String value2) {
            addCriterion("visit_content between", value1, value2, "visit_content");
            return (Criteria) this;
        }

        public Criteria andVisit_contentNotBetween(String value1, String value2) {
            addCriterion("visit_content not between", value1, value2, "visit_content");
            return (Criteria) this;
        }

        public Criteria andClassificationIsNull() {
            addCriterion("classification is null");
            return (Criteria) this;
        }

        public Criteria andClassificationIsNotNull() {
            addCriterion("classification is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationEqualTo(String value) {
            addCriterion("classification =", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotEqualTo(String value) {
            addCriterion("classification <>", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThan(String value) {
            addCriterion("classification >", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("classification >=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThan(String value) {
            addCriterion("classification <", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThanOrEqualTo(String value) {
            addCriterion("classification <=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLike(String value) {
            addCriterion("classification like", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotLike(String value) {
            addCriterion("classification not like", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationIn(List<String> values) {
            addCriterion("classification in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotIn(List<String> values) {
            addCriterion("classification not in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationBetween(String value1, String value2) {
            addCriterion("classification between", value1, value2, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotBetween(String value1, String value2) {
            addCriterion("classification not between", value1, value2, "classification");
            return (Criteria) this;
        }

        public Criteria andMediatypeIsNull() {
            addCriterion("mediatype is null");
            return (Criteria) this;
        }

        public Criteria andMediatypeIsNotNull() {
            addCriterion("mediatype is not null");
            return (Criteria) this;
        }

        public Criteria andMediatypeEqualTo(String value) {
            addCriterion("mediatype =", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeNotEqualTo(String value) {
            addCriterion("mediatype <>", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeGreaterThan(String value) {
            addCriterion("mediatype >", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeGreaterThanOrEqualTo(String value) {
            addCriterion("mediatype >=", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeLessThan(String value) {
            addCriterion("mediatype <", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeLessThanOrEqualTo(String value) {
            addCriterion("mediatype <=", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeLike(String value) {
            addCriterion("mediatype like", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeNotLike(String value) {
            addCriterion("mediatype not like", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeIn(List<String> values) {
            addCriterion("mediatype in", values, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeNotIn(List<String> values) {
            addCriterion("mediatype not in", values, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeBetween(String value1, String value2) {
            addCriterion("mediatype between", value1, value2, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeNotBetween(String value1, String value2) {
            addCriterion("mediatype not between", value1, value2, "mediatype");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionIsNull() {
            addCriterion("specific_position is null");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionIsNotNull() {
            addCriterion("specific_position is not null");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionEqualTo(String value) {
            addCriterion("specific_position =", value, "specific_position");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionNotEqualTo(String value) {
            addCriterion("specific_position <>", value, "specific_position");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionGreaterThan(String value) {
            addCriterion("specific_position >", value, "specific_position");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionGreaterThanOrEqualTo(String value) {
            addCriterion("specific_position >=", value, "specific_position");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionLessThan(String value) {
            addCriterion("specific_position <", value, "specific_position");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionLessThanOrEqualTo(String value) {
            addCriterion("specific_position <=", value, "specific_position");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionLike(String value) {
            addCriterion("specific_position like", value, "specific_position");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionNotLike(String value) {
            addCriterion("specific_position not like", value, "specific_position");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionIn(List<String> values) {
            addCriterion("specific_position in", values, "specific_position");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionNotIn(List<String> values) {
            addCriterion("specific_position not in", values, "specific_position");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionBetween(String value1, String value2) {
            addCriterion("specific_position between", value1, value2, "specific_position");
            return (Criteria) this;
        }

        public Criteria andSpecific_positionNotBetween(String value1, String value2) {
            addCriterion("specific_position not between", value1, value2, "specific_position");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNull() {
            addCriterion("budget is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNotNull() {
            addCriterion("budget is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetEqualTo(String value) {
            addCriterion("budget =", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotEqualTo(String value) {
            addCriterion("budget <>", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThan(String value) {
            addCriterion("budget >", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThanOrEqualTo(String value) {
            addCriterion("budget >=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThan(String value) {
            addCriterion("budget <", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThanOrEqualTo(String value) {
            addCriterion("budget <=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLike(String value) {
            addCriterion("budget like", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotLike(String value) {
            addCriterion("budget not like", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetIn(List<String> values) {
            addCriterion("budget in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotIn(List<String> values) {
            addCriterion("budget not in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetBetween(String value1, String value2) {
            addCriterion("budget between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotBetween(String value1, String value2) {
            addCriterion("budget not between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateIsNull() {
            addCriterion("expected_release_date is null");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateIsNotNull() {
            addCriterion("expected_release_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateEqualTo(String value) {
            addCriterion("expected_release_date =", value, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateNotEqualTo(String value) {
            addCriterion("expected_release_date <>", value, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateGreaterThan(String value) {
            addCriterion("expected_release_date >", value, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateGreaterThanOrEqualTo(String value) {
            addCriterion("expected_release_date >=", value, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateLessThan(String value) {
            addCriterion("expected_release_date <", value, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateLessThanOrEqualTo(String value) {
            addCriterion("expected_release_date <=", value, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateLike(String value) {
            addCriterion("expected_release_date like", value, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateNotLike(String value) {
            addCriterion("expected_release_date not like", value, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateIn(List<String> values) {
            addCriterion("expected_release_date in", values, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateNotIn(List<String> values) {
            addCriterion("expected_release_date not in", values, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateBetween(String value1, String value2) {
            addCriterion("expected_release_date between", value1, value2, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andExpected_release_dateNotBetween(String value1, String value2) {
            addCriterion("expected_release_date not between", value1, value2, "expected_release_date");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andNext_week_planIsNull() {
            addCriterion("next_week_plan is null");
            return (Criteria) this;
        }

        public Criteria andNext_week_planIsNotNull() {
            addCriterion("next_week_plan is not null");
            return (Criteria) this;
        }

        public Criteria andNext_week_planEqualTo(String value) {
            addCriterion("next_week_plan =", value, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andNext_week_planNotEqualTo(String value) {
            addCriterion("next_week_plan <>", value, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andNext_week_planGreaterThan(String value) {
            addCriterion("next_week_plan >", value, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andNext_week_planGreaterThanOrEqualTo(String value) {
            addCriterion("next_week_plan >=", value, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andNext_week_planLessThan(String value) {
            addCriterion("next_week_plan <", value, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andNext_week_planLessThanOrEqualTo(String value) {
            addCriterion("next_week_plan <=", value, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andNext_week_planLike(String value) {
            addCriterion("next_week_plan like", value, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andNext_week_planNotLike(String value) {
            addCriterion("next_week_plan not like", value, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andNext_week_planIn(List<String> values) {
            addCriterion("next_week_plan in", values, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andNext_week_planNotIn(List<String> values) {
            addCriterion("next_week_plan not in", values, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andNext_week_planBetween(String value1, String value2) {
            addCriterion("next_week_plan between", value1, value2, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andNext_week_planNotBetween(String value1, String value2) {
            addCriterion("next_week_plan not between", value1, value2, "next_week_plan");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Integer value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Integer value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Integer value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Integer value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Integer> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Integer> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Integer value1, Integer value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andSpeakerIsNull() {
            addCriterion("speaker is null");
            return (Criteria) this;
        }

        public Criteria andSpeakerIsNotNull() {
            addCriterion("speaker is not null");
            return (Criteria) this;
        }

        public Criteria andSpeakerEqualTo(String value) {
            addCriterion("speaker =", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotEqualTo(String value) {
            addCriterion("speaker <>", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerGreaterThan(String value) {
            addCriterion("speaker >", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerGreaterThanOrEqualTo(String value) {
            addCriterion("speaker >=", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerLessThan(String value) {
            addCriterion("speaker <", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerLessThanOrEqualTo(String value) {
            addCriterion("speaker <=", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerLike(String value) {
            addCriterion("speaker like", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotLike(String value) {
            addCriterion("speaker not like", value, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerIn(List<String> values) {
            addCriterion("speaker in", values, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotIn(List<String> values) {
            addCriterion("speaker not in", values, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerBetween(String value1, String value2) {
            addCriterion("speaker between", value1, value2, "speaker");
            return (Criteria) this;
        }

        public Criteria andSpeakerNotBetween(String value1, String value2) {
            addCriterion("speaker not between", value1, value2, "speaker");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeIsNull() {
            addCriterion("submission_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeIsNotNull() {
            addCriterion("submission_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeEqualTo(Date value) {
            addCriterion("submission_time =", value, "submission_time");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeNotEqualTo(Date value) {
            addCriterion("submission_time <>", value, "submission_time");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeGreaterThan(Date value) {
            addCriterion("submission_time >", value, "submission_time");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("submission_time >=", value, "submission_time");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeLessThan(Date value) {
            addCriterion("submission_time <", value, "submission_time");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeLessThanOrEqualTo(Date value) {
            addCriterion("submission_time <=", value, "submission_time");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeIn(List<Date> values) {
            addCriterion("submission_time in", values, "submission_time");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeNotIn(List<Date> values) {
            addCriterion("submission_time not in", values, "submission_time");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeBetween(Date value1, Date value2) {
            addCriterion("submission_time between", value1, value2, "submission_time");
            return (Criteria) this;
        }

        public Criteria andSubmission_timeNotBetween(Date value1, Date value2) {
            addCriterion("submission_time not between", value1, value2, "submission_time");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
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