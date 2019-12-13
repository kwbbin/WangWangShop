package com.wangwang.shop.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdExample() {
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

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Integer value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Integer value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Integer value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Integer value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Integer value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Integer> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Integer> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Integer value1, Integer value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(Long value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(Long value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(Long value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(Long value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(Long value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(Long value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<Long> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<Long> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(Long value1, Long value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(Long value1, Long value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andAdPositionIsNull() {
            addCriterion("ad_position is null");
            return (Criteria) this;
        }

        public Criteria andAdPositionIsNotNull() {
            addCriterion("ad_position is not null");
            return (Criteria) this;
        }

        public Criteria andAdPositionEqualTo(Integer value) {
            addCriterion("ad_position =", value, "adPosition");
            return (Criteria) this;
        }

        public Criteria andAdPositionNotEqualTo(Integer value) {
            addCriterion("ad_position <>", value, "adPosition");
            return (Criteria) this;
        }

        public Criteria andAdPositionGreaterThan(Integer value) {
            addCriterion("ad_position >", value, "adPosition");
            return (Criteria) this;
        }

        public Criteria andAdPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_position >=", value, "adPosition");
            return (Criteria) this;
        }

        public Criteria andAdPositionLessThan(Integer value) {
            addCriterion("ad_position <", value, "adPosition");
            return (Criteria) this;
        }

        public Criteria andAdPositionLessThanOrEqualTo(Integer value) {
            addCriterion("ad_position <=", value, "adPosition");
            return (Criteria) this;
        }

        public Criteria andAdPositionIn(List<Integer> values) {
            addCriterion("ad_position in", values, "adPosition");
            return (Criteria) this;
        }

        public Criteria andAdPositionNotIn(List<Integer> values) {
            addCriterion("ad_position not in", values, "adPosition");
            return (Criteria) this;
        }

        public Criteria andAdPositionBetween(Integer value1, Integer value2) {
            addCriterion("ad_position between", value1, value2, "adPosition");
            return (Criteria) this;
        }

        public Criteria andAdPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_position not between", value1, value2, "adPosition");
            return (Criteria) this;
        }

        public Criteria andAdStartDateIsNull() {
            addCriterion("ad_start_date is null");
            return (Criteria) this;
        }

        public Criteria andAdStartDateIsNotNull() {
            addCriterion("ad_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andAdStartDateEqualTo(Date value) {
            addCriterion("ad_start_date =", value, "adStartDate");
            return (Criteria) this;
        }

        public Criteria andAdStartDateNotEqualTo(Date value) {
            addCriterion("ad_start_date <>", value, "adStartDate");
            return (Criteria) this;
        }

        public Criteria andAdStartDateGreaterThan(Date value) {
            addCriterion("ad_start_date >", value, "adStartDate");
            return (Criteria) this;
        }

        public Criteria andAdStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ad_start_date >=", value, "adStartDate");
            return (Criteria) this;
        }

        public Criteria andAdStartDateLessThan(Date value) {
            addCriterion("ad_start_date <", value, "adStartDate");
            return (Criteria) this;
        }

        public Criteria andAdStartDateLessThanOrEqualTo(Date value) {
            addCriterion("ad_start_date <=", value, "adStartDate");
            return (Criteria) this;
        }

        public Criteria andAdStartDateIn(List<Date> values) {
            addCriterion("ad_start_date in", values, "adStartDate");
            return (Criteria) this;
        }

        public Criteria andAdStartDateNotIn(List<Date> values) {
            addCriterion("ad_start_date not in", values, "adStartDate");
            return (Criteria) this;
        }

        public Criteria andAdStartDateBetween(Date value1, Date value2) {
            addCriterion("ad_start_date between", value1, value2, "adStartDate");
            return (Criteria) this;
        }

        public Criteria andAdStartDateNotBetween(Date value1, Date value2) {
            addCriterion("ad_start_date not between", value1, value2, "adStartDate");
            return (Criteria) this;
        }

        public Criteria andAdEndDateIsNull() {
            addCriterion("ad_end_date is null");
            return (Criteria) this;
        }

        public Criteria andAdEndDateIsNotNull() {
            addCriterion("ad_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andAdEndDateEqualTo(Date value) {
            addCriterion("ad_end_date =", value, "adEndDate");
            return (Criteria) this;
        }

        public Criteria andAdEndDateNotEqualTo(Date value) {
            addCriterion("ad_end_date <>", value, "adEndDate");
            return (Criteria) this;
        }

        public Criteria andAdEndDateGreaterThan(Date value) {
            addCriterion("ad_end_date >", value, "adEndDate");
            return (Criteria) this;
        }

        public Criteria andAdEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ad_end_date >=", value, "adEndDate");
            return (Criteria) this;
        }

        public Criteria andAdEndDateLessThan(Date value) {
            addCriterion("ad_end_date <", value, "adEndDate");
            return (Criteria) this;
        }

        public Criteria andAdEndDateLessThanOrEqualTo(Date value) {
            addCriterion("ad_end_date <=", value, "adEndDate");
            return (Criteria) this;
        }

        public Criteria andAdEndDateIn(List<Date> values) {
            addCriterion("ad_end_date in", values, "adEndDate");
            return (Criteria) this;
        }

        public Criteria andAdEndDateNotIn(List<Date> values) {
            addCriterion("ad_end_date not in", values, "adEndDate");
            return (Criteria) this;
        }

        public Criteria andAdEndDateBetween(Date value1, Date value2) {
            addCriterion("ad_end_date between", value1, value2, "adEndDate");
            return (Criteria) this;
        }

        public Criteria andAdEndDateNotBetween(Date value1, Date value2) {
            addCriterion("ad_end_date not between", value1, value2, "adEndDate");
            return (Criteria) this;
        }

        public Criteria andAdSortIsNull() {
            addCriterion("ad_sort is null");
            return (Criteria) this;
        }

        public Criteria andAdSortIsNotNull() {
            addCriterion("ad_sort is not null");
            return (Criteria) this;
        }

        public Criteria andAdSortEqualTo(Integer value) {
            addCriterion("ad_sort =", value, "adSort");
            return (Criteria) this;
        }

        public Criteria andAdSortNotEqualTo(Integer value) {
            addCriterion("ad_sort <>", value, "adSort");
            return (Criteria) this;
        }

        public Criteria andAdSortGreaterThan(Integer value) {
            addCriterion("ad_sort >", value, "adSort");
            return (Criteria) this;
        }

        public Criteria andAdSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_sort >=", value, "adSort");
            return (Criteria) this;
        }

        public Criteria andAdSortLessThan(Integer value) {
            addCriterion("ad_sort <", value, "adSort");
            return (Criteria) this;
        }

        public Criteria andAdSortLessThanOrEqualTo(Integer value) {
            addCriterion("ad_sort <=", value, "adSort");
            return (Criteria) this;
        }

        public Criteria andAdSortIn(List<Integer> values) {
            addCriterion("ad_sort in", values, "adSort");
            return (Criteria) this;
        }

        public Criteria andAdSortNotIn(List<Integer> values) {
            addCriterion("ad_sort not in", values, "adSort");
            return (Criteria) this;
        }

        public Criteria andAdSortBetween(Integer value1, Integer value2) {
            addCriterion("ad_sort between", value1, value2, "adSort");
            return (Criteria) this;
        }

        public Criteria andAdSortNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_sort not between", value1, value2, "adSort");
            return (Criteria) this;
        }

        public Criteria andAdClickNumIsNull() {
            addCriterion("\" ad_click_num\" is null");
            return (Criteria) this;
        }

        public Criteria andAdClickNumIsNotNull() {
            addCriterion("\" ad_click_num\" is not null");
            return (Criteria) this;
        }

        public Criteria andAdClickNumEqualTo(Integer value) {
            addCriterion("\" ad_click_num\" =", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumNotEqualTo(Integer value) {
            addCriterion("\" ad_click_num\" <>", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumGreaterThan(Integer value) {
            addCriterion("\" ad_click_num\" >", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("\" ad_click_num\" >=", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumLessThan(Integer value) {
            addCriterion("\" ad_click_num\" <", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumLessThanOrEqualTo(Integer value) {
            addCriterion("\" ad_click_num\" <=", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumIn(List<Integer> values) {
            addCriterion("\" ad_click_num\" in", values, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumNotIn(List<Integer> values) {
            addCriterion("\" ad_click_num\" not in", values, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumBetween(Integer value1, Integer value2) {
            addCriterion("\" ad_click_num\" between", value1, value2, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumNotBetween(Integer value1, Integer value2) {
            addCriterion("\" ad_click_num\" not between", value1, value2, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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