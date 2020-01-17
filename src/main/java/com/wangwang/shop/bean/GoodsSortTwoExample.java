package com.wangwang.shop.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsSortTwoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSortTwoExample() {
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

        public Criteria andGoodsSortTwoIdIsNull() {
            addCriterion("goods_sort_two_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortTwoIdIsNotNull() {
            addCriterion("goods_sort_two_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortTwoIdEqualTo(Integer value) {
            addCriterion("goods_sort_two_id =", value, "goodsSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortTwoIdNotEqualTo(Integer value) {
            addCriterion("goods_sort_two_id <>", value, "goodsSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortTwoIdGreaterThan(Integer value) {
            addCriterion("goods_sort_two_id >", value, "goodsSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortTwoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sort_two_id >=", value, "goodsSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortTwoIdLessThan(Integer value) {
            addCriterion("goods_sort_two_id <", value, "goodsSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortTwoIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sort_two_id <=", value, "goodsSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortTwoIdIn(List<Integer> values) {
            addCriterion("goods_sort_two_id in", values, "goodsSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortTwoIdNotIn(List<Integer> values) {
            addCriterion("goods_sort_two_id not in", values, "goodsSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortTwoIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort_two_id between", value1, value2, "goodsSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortTwoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort_two_id not between", value1, value2, "goodsSortTwoId");
            return (Criteria) this;
        }

        public Criteria andSortNameIsNull() {
            addCriterion("sort_name is null");
            return (Criteria) this;
        }

        public Criteria andSortNameIsNotNull() {
            addCriterion("sort_name is not null");
            return (Criteria) this;
        }

        public Criteria andSortNameEqualTo(String value) {
            addCriterion("sort_name =", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotEqualTo(String value) {
            addCriterion("sort_name <>", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameGreaterThan(String value) {
            addCriterion("sort_name >", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameGreaterThanOrEqualTo(String value) {
            addCriterion("sort_name >=", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameLessThan(String value) {
            addCriterion("sort_name <", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameLessThanOrEqualTo(String value) {
            addCriterion("sort_name <=", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameLike(String value) {
            addCriterion("sort_name like", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotLike(String value) {
            addCriterion("sort_name not like", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameIn(List<String> values) {
            addCriterion("sort_name in", values, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotIn(List<String> values) {
            addCriterion("sort_name not in", values, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameBetween(String value1, String value2) {
            addCriterion("sort_name between", value1, value2, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotBetween(String value1, String value2) {
            addCriterion("sort_name not between", value1, value2, "sortName");
            return (Criteria) this;
        }

        public Criteria andHotNumIsNull() {
            addCriterion("hot_num is null");
            return (Criteria) this;
        }

        public Criteria andHotNumIsNotNull() {
            addCriterion("hot_num is not null");
            return (Criteria) this;
        }

        public Criteria andHotNumEqualTo(Integer value) {
            addCriterion("hot_num =", value, "hotNum");
            return (Criteria) this;
        }

        public Criteria andHotNumNotEqualTo(Integer value) {
            addCriterion("hot_num <>", value, "hotNum");
            return (Criteria) this;
        }

        public Criteria andHotNumGreaterThan(Integer value) {
            addCriterion("hot_num >", value, "hotNum");
            return (Criteria) this;
        }

        public Criteria andHotNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("hot_num >=", value, "hotNum");
            return (Criteria) this;
        }

        public Criteria andHotNumLessThan(Integer value) {
            addCriterion("hot_num <", value, "hotNum");
            return (Criteria) this;
        }

        public Criteria andHotNumLessThanOrEqualTo(Integer value) {
            addCriterion("hot_num <=", value, "hotNum");
            return (Criteria) this;
        }

        public Criteria andHotNumIn(List<Integer> values) {
            addCriterion("hot_num in", values, "hotNum");
            return (Criteria) this;
        }

        public Criteria andHotNumNotIn(List<Integer> values) {
            addCriterion("hot_num not in", values, "hotNum");
            return (Criteria) this;
        }

        public Criteria andHotNumBetween(Integer value1, Integer value2) {
            addCriterion("hot_num between", value1, value2, "hotNum");
            return (Criteria) this;
        }

        public Criteria andHotNumNotBetween(Integer value1, Integer value2) {
            addCriterion("hot_num not between", value1, value2, "hotNum");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
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