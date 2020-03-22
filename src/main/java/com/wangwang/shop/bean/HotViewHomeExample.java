package com.wangwang.shop.bean;

import java.util.ArrayList;
import java.util.List;

public class HotViewHomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotViewHomeExample() {
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

        public Criteria andSortOneNameIsNull() {
            addCriterion("sort_one_name is null");
            return (Criteria) this;
        }

        public Criteria andSortOneNameIsNotNull() {
            addCriterion("sort_one_name is not null");
            return (Criteria) this;
        }

        public Criteria andSortOneNameEqualTo(String value) {
            addCriterion("sort_one_name =", value, "sortOneName");
            return (Criteria) this;
        }

        public Criteria andSortOneNameNotEqualTo(String value) {
            addCriterion("sort_one_name <>", value, "sortOneName");
            return (Criteria) this;
        }

        public Criteria andSortOneNameGreaterThan(String value) {
            addCriterion("sort_one_name >", value, "sortOneName");
            return (Criteria) this;
        }

        public Criteria andSortOneNameGreaterThanOrEqualTo(String value) {
            addCriterion("sort_one_name >=", value, "sortOneName");
            return (Criteria) this;
        }

        public Criteria andSortOneNameLessThan(String value) {
            addCriterion("sort_one_name <", value, "sortOneName");
            return (Criteria) this;
        }

        public Criteria andSortOneNameLessThanOrEqualTo(String value) {
            addCriterion("sort_one_name <=", value, "sortOneName");
            return (Criteria) this;
        }

        public Criteria andSortOneNameLike(String value) {
            addCriterion("sort_one_name like", value, "sortOneName");
            return (Criteria) this;
        }

        public Criteria andSortOneNameNotLike(String value) {
            addCriterion("sort_one_name not like", value, "sortOneName");
            return (Criteria) this;
        }

        public Criteria andSortOneNameIn(List<String> values) {
            addCriterion("sort_one_name in", values, "sortOneName");
            return (Criteria) this;
        }

        public Criteria andSortOneNameNotIn(List<String> values) {
            addCriterion("sort_one_name not in", values, "sortOneName");
            return (Criteria) this;
        }

        public Criteria andSortOneNameBetween(String value1, String value2) {
            addCriterion("sort_one_name between", value1, value2, "sortOneName");
            return (Criteria) this;
        }

        public Criteria andSortOneNameNotBetween(String value1, String value2) {
            addCriterion("sort_one_name not between", value1, value2, "sortOneName");
            return (Criteria) this;
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

        public Criteria andSortTwoNameIsNull() {
            addCriterion("sort_two_name is null");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameIsNotNull() {
            addCriterion("sort_two_name is not null");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameEqualTo(String value) {
            addCriterion("sort_two_name =", value, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameNotEqualTo(String value) {
            addCriterion("sort_two_name <>", value, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameGreaterThan(String value) {
            addCriterion("sort_two_name >", value, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameGreaterThanOrEqualTo(String value) {
            addCriterion("sort_two_name >=", value, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameLessThan(String value) {
            addCriterion("sort_two_name <", value, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameLessThanOrEqualTo(String value) {
            addCriterion("sort_two_name <=", value, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameLike(String value) {
            addCriterion("sort_two_name like", value, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameNotLike(String value) {
            addCriterion("sort_two_name not like", value, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameIn(List<String> values) {
            addCriterion("sort_two_name in", values, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameNotIn(List<String> values) {
            addCriterion("sort_two_name not in", values, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameBetween(String value1, String value2) {
            addCriterion("sort_two_name between", value1, value2, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andSortTwoNameNotBetween(String value1, String value2) {
            addCriterion("sort_two_name not between", value1, value2, "sortTwoName");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(String value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(String value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(String value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(String value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(String value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLike(String value) {
            addCriterion("goods_number like", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotLike(String value) {
            addCriterion("goods_number not like", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<String> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<String> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(String value1, String value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(String value1, String value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdIsNull() {
            addCriterion("goods_sort_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdIsNotNull() {
            addCriterion("goods_sort_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdEqualTo(Integer value) {
            addCriterion("goods_sort_id =", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdNotEqualTo(Integer value) {
            addCriterion("goods_sort_id <>", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdGreaterThan(Integer value) {
            addCriterion("goods_sort_id >", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sort_id >=", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdLessThan(Integer value) {
            addCriterion("goods_sort_id <", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sort_id <=", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdIn(List<Integer> values) {
            addCriterion("goods_sort_id in", values, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdNotIn(List<Integer> values) {
            addCriterion("goods_sort_id not in", values, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort_id between", value1, value2, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort_id not between", value1, value2, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andSaleTotalIsNull() {
            addCriterion("sale_total is null");
            return (Criteria) this;
        }

        public Criteria andSaleTotalIsNotNull() {
            addCriterion("sale_total is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTotalEqualTo(Integer value) {
            addCriterion("sale_total =", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalNotEqualTo(Integer value) {
            addCriterion("sale_total <>", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalGreaterThan(Integer value) {
            addCriterion("sale_total >", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_total >=", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalLessThan(Integer value) {
            addCriterion("sale_total <", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalLessThanOrEqualTo(Integer value) {
            addCriterion("sale_total <=", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalIn(List<Integer> values) {
            addCriterion("sale_total in", values, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalNotIn(List<Integer> values) {
            addCriterion("sale_total not in", values, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalBetween(Integer value1, Integer value2) {
            addCriterion("sale_total between", value1, value2, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_total not between", value1, value2, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNull() {
            addCriterion("visit_num is null");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNotNull() {
            addCriterion("visit_num is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNumEqualTo(Integer value) {
            addCriterion("visit_num =", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotEqualTo(Integer value) {
            addCriterion("visit_num <>", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThan(Integer value) {
            addCriterion("visit_num >", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("visit_num >=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThan(Integer value) {
            addCriterion("visit_num <", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThanOrEqualTo(Integer value) {
            addCriterion("visit_num <=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumIn(List<Integer> values) {
            addCriterion("visit_num in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotIn(List<Integer> values) {
            addCriterion("visit_num not in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumBetween(Integer value1, Integer value2) {
            addCriterion("visit_num between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("visit_num not between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andImageDescIsNull() {
            addCriterion("image_desc is null");
            return (Criteria) this;
        }

        public Criteria andImageDescIsNotNull() {
            addCriterion("image_desc is not null");
            return (Criteria) this;
        }

        public Criteria andImageDescEqualTo(String value) {
            addCriterion("image_desc =", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescNotEqualTo(String value) {
            addCriterion("image_desc <>", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescGreaterThan(String value) {
            addCriterion("image_desc >", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescGreaterThanOrEqualTo(String value) {
            addCriterion("image_desc >=", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescLessThan(String value) {
            addCriterion("image_desc <", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescLessThanOrEqualTo(String value) {
            addCriterion("image_desc <=", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescLike(String value) {
            addCriterion("image_desc like", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescNotLike(String value) {
            addCriterion("image_desc not like", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescIn(List<String> values) {
            addCriterion("image_desc in", values, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescNotIn(List<String> values) {
            addCriterion("image_desc not in", values, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescBetween(String value1, String value2) {
            addCriterion("image_desc between", value1, value2, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescNotBetween(String value1, String value2) {
            addCriterion("image_desc not between", value1, value2, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNull() {
            addCriterion("image_id is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("image_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Long value) {
            addCriterion("image_id =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Long value) {
            addCriterion("image_id <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Long value) {
            addCriterion("image_id >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("image_id >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Long value) {
            addCriterion("image_id <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Long value) {
            addCriterion("image_id <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Long> values) {
            addCriterion("image_id in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Long> values) {
            addCriterion("image_id not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Long value1, Long value2) {
            addCriterion("image_id between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Long value1, Long value2) {
            addCriterion("image_id not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andViewNameIsNull() {
            addCriterion("view_name is null");
            return (Criteria) this;
        }

        public Criteria andViewNameIsNotNull() {
            addCriterion("view_name is not null");
            return (Criteria) this;
        }

        public Criteria andViewNameEqualTo(String value) {
            addCriterion("view_name =", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotEqualTo(String value) {
            addCriterion("view_name <>", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameGreaterThan(String value) {
            addCriterion("view_name >", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameGreaterThanOrEqualTo(String value) {
            addCriterion("view_name >=", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameLessThan(String value) {
            addCriterion("view_name <", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameLessThanOrEqualTo(String value) {
            addCriterion("view_name <=", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameLike(String value) {
            addCriterion("view_name like", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotLike(String value) {
            addCriterion("view_name not like", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameIn(List<String> values) {
            addCriterion("view_name in", values, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotIn(List<String> values) {
            addCriterion("view_name not in", values, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameBetween(String value1, String value2) {
            addCriterion("view_name between", value1, value2, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotBetween(String value1, String value2) {
            addCriterion("view_name not between", value1, value2, "viewName");
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