package com.wangwang.shop.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsSortOneTwoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSortOneTwoExample() {
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

        public Criteria andGoodsSortOneIdIsNull() {
            addCriterion("goods_sort_one_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortOneIdIsNotNull() {
            addCriterion("goods_sort_one_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortOneIdEqualTo(Integer value) {
            addCriterion("goods_sort_one_id =", value, "goodsSortOneId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortOneIdNotEqualTo(Integer value) {
            addCriterion("goods_sort_one_id <>", value, "goodsSortOneId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortOneIdGreaterThan(Integer value) {
            addCriterion("goods_sort_one_id >", value, "goodsSortOneId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortOneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sort_one_id >=", value, "goodsSortOneId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortOneIdLessThan(Integer value) {
            addCriterion("goods_sort_one_id <", value, "goodsSortOneId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortOneIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sort_one_id <=", value, "goodsSortOneId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortOneIdIn(List<Integer> values) {
            addCriterion("goods_sort_one_id in", values, "goodsSortOneId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortOneIdNotIn(List<Integer> values) {
            addCriterion("goods_sort_one_id not in", values, "goodsSortOneId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortOneIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort_one_id between", value1, value2, "goodsSortOneId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortOneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort_one_id not between", value1, value2, "goodsSortOneId");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdIsNull() {
            addCriterion("good_sort_two_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdIsNotNull() {
            addCriterion("good_sort_two_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdEqualTo(Integer value) {
            addCriterion("good_sort_two_id =", value, "goodSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdNotEqualTo(Integer value) {
            addCriterion("good_sort_two_id <>", value, "goodSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdGreaterThan(Integer value) {
            addCriterion("good_sort_two_id >", value, "goodSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_sort_two_id >=", value, "goodSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdLessThan(Integer value) {
            addCriterion("good_sort_two_id <", value, "goodSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdLessThanOrEqualTo(Integer value) {
            addCriterion("good_sort_two_id <=", value, "goodSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdIn(List<Integer> values) {
            addCriterion("good_sort_two_id in", values, "goodSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdNotIn(List<Integer> values) {
            addCriterion("good_sort_two_id not in", values, "goodSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdBetween(Integer value1, Integer value2) {
            addCriterion("good_sort_two_id between", value1, value2, "goodSortTwoId");
            return (Criteria) this;
        }

        public Criteria andGoodSortTwoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("good_sort_two_id not between", value1, value2, "goodSortTwoId");
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