package com.wangwang.shop.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopNumberIsNull() {
            addCriterion("shop_number is null");
            return (Criteria) this;
        }

        public Criteria andShopNumberIsNotNull() {
            addCriterion("shop_number is not null");
            return (Criteria) this;
        }

        public Criteria andShopNumberEqualTo(String value) {
            addCriterion("shop_number =", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotEqualTo(String value) {
            addCriterion("shop_number <>", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberGreaterThan(String value) {
            addCriterion("shop_number >", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberGreaterThanOrEqualTo(String value) {
            addCriterion("shop_number >=", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberLessThan(String value) {
            addCriterion("shop_number <", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberLessThanOrEqualTo(String value) {
            addCriterion("shop_number <=", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberLike(String value) {
            addCriterion("shop_number like", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotLike(String value) {
            addCriterion("shop_number not like", value, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberIn(List<String> values) {
            addCriterion("shop_number in", values, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotIn(List<String> values) {
            addCriterion("shop_number not in", values, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberBetween(String value1, String value2) {
            addCriterion("shop_number between", value1, value2, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopNumberNotBetween(String value1, String value2) {
            addCriterion("shop_number not between", value1, value2, "shopNumber");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopDirectoIsNull() {
            addCriterion("shop_directo is null");
            return (Criteria) this;
        }

        public Criteria andShopDirectoIsNotNull() {
            addCriterion("shop_directo is not null");
            return (Criteria) this;
        }

        public Criteria andShopDirectoEqualTo(Long value) {
            addCriterion("shop_directo =", value, "shopDirecto");
            return (Criteria) this;
        }

        public Criteria andShopDirectoNotEqualTo(Long value) {
            addCriterion("shop_directo <>", value, "shopDirecto");
            return (Criteria) this;
        }

        public Criteria andShopDirectoGreaterThan(Long value) {
            addCriterion("shop_directo >", value, "shopDirecto");
            return (Criteria) this;
        }

        public Criteria andShopDirectoGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_directo >=", value, "shopDirecto");
            return (Criteria) this;
        }

        public Criteria andShopDirectoLessThan(Long value) {
            addCriterion("shop_directo <", value, "shopDirecto");
            return (Criteria) this;
        }

        public Criteria andShopDirectoLessThanOrEqualTo(Long value) {
            addCriterion("shop_directo <=", value, "shopDirecto");
            return (Criteria) this;
        }

        public Criteria andShopDirectoIn(List<Long> values) {
            addCriterion("shop_directo in", values, "shopDirecto");
            return (Criteria) this;
        }

        public Criteria andShopDirectoNotIn(List<Long> values) {
            addCriterion("shop_directo not in", values, "shopDirecto");
            return (Criteria) this;
        }

        public Criteria andShopDirectoBetween(Long value1, Long value2) {
            addCriterion("shop_directo between", value1, value2, "shopDirecto");
            return (Criteria) this;
        }

        public Criteria andShopDirectoNotBetween(Long value1, Long value2) {
            addCriterion("shop_directo not between", value1, value2, "shopDirecto");
            return (Criteria) this;
        }

        public Criteria andShopImageIsNull() {
            addCriterion("shop_image is null");
            return (Criteria) this;
        }

        public Criteria andShopImageIsNotNull() {
            addCriterion("shop_image is not null");
            return (Criteria) this;
        }

        public Criteria andShopImageEqualTo(String value) {
            addCriterion("shop_image =", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotEqualTo(String value) {
            addCriterion("shop_image <>", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageGreaterThan(String value) {
            addCriterion("shop_image >", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageGreaterThanOrEqualTo(String value) {
            addCriterion("shop_image >=", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLessThan(String value) {
            addCriterion("shop_image <", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLessThanOrEqualTo(String value) {
            addCriterion("shop_image <=", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLike(String value) {
            addCriterion("shop_image like", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotLike(String value) {
            addCriterion("shop_image not like", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageIn(List<String> values) {
            addCriterion("shop_image in", values, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotIn(List<String> values) {
            addCriterion("shop_image not in", values, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageBetween(String value1, String value2) {
            addCriterion("shop_image between", value1, value2, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotBetween(String value1, String value2) {
            addCriterion("shop_image not between", value1, value2, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNull() {
            addCriterion("shop_phone is null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNotNull() {
            addCriterion("shop_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneEqualTo(String value) {
            addCriterion("shop_phone =", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotEqualTo(String value) {
            addCriterion("shop_phone <>", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThan(String value) {
            addCriterion("shop_phone >", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shop_phone >=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThan(String value) {
            addCriterion("shop_phone <", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThanOrEqualTo(String value) {
            addCriterion("shop_phone <=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLike(String value) {
            addCriterion("shop_phone like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotLike(String value) {
            addCriterion("shop_phone not like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIn(List<String> values) {
            addCriterion("shop_phone in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotIn(List<String> values) {
            addCriterion("shop_phone not in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneBetween(String value1, String value2) {
            addCriterion("shop_phone between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotBetween(String value1, String value2) {
            addCriterion("shop_phone not between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopQqIsNull() {
            addCriterion("shop_qq is null");
            return (Criteria) this;
        }

        public Criteria andShopQqIsNotNull() {
            addCriterion("shop_qq is not null");
            return (Criteria) this;
        }

        public Criteria andShopQqEqualTo(String value) {
            addCriterion("shop_qq =", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqNotEqualTo(String value) {
            addCriterion("shop_qq <>", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqGreaterThan(String value) {
            addCriterion("shop_qq >", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqGreaterThanOrEqualTo(String value) {
            addCriterion("shop_qq >=", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqLessThan(String value) {
            addCriterion("shop_qq <", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqLessThanOrEqualTo(String value) {
            addCriterion("shop_qq <=", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqLike(String value) {
            addCriterion("shop_qq like", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqNotLike(String value) {
            addCriterion("shop_qq not like", value, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqIn(List<String> values) {
            addCriterion("shop_qq in", values, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqNotIn(List<String> values) {
            addCriterion("shop_qq not in", values, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqBetween(String value1, String value2) {
            addCriterion("shop_qq between", value1, value2, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopQqNotBetween(String value1, String value2) {
            addCriterion("shop_qq not between", value1, value2, "shopQq");
            return (Criteria) this;
        }

        public Criteria andShopAdressIsNull() {
            addCriterion("shop_adress is null");
            return (Criteria) this;
        }

        public Criteria andShopAdressIsNotNull() {
            addCriterion("shop_adress is not null");
            return (Criteria) this;
        }

        public Criteria andShopAdressEqualTo(String value) {
            addCriterion("shop_adress =", value, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andShopAdressNotEqualTo(String value) {
            addCriterion("shop_adress <>", value, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andShopAdressGreaterThan(String value) {
            addCriterion("shop_adress >", value, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andShopAdressGreaterThanOrEqualTo(String value) {
            addCriterion("shop_adress >=", value, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andShopAdressLessThan(String value) {
            addCriterion("shop_adress <", value, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andShopAdressLessThanOrEqualTo(String value) {
            addCriterion("shop_adress <=", value, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andShopAdressLike(String value) {
            addCriterion("shop_adress like", value, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andShopAdressNotLike(String value) {
            addCriterion("shop_adress not like", value, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andShopAdressIn(List<String> values) {
            addCriterion("shop_adress in", values, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andShopAdressNotIn(List<String> values) {
            addCriterion("shop_adress not in", values, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andShopAdressBetween(String value1, String value2) {
            addCriterion("shop_adress between", value1, value2, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andShopAdressNotBetween(String value1, String value2) {
            addCriterion("shop_adress not between", value1, value2, "shopAdress");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginIsNull() {
            addCriterion("service_time_begin is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginIsNotNull() {
            addCriterion("service_time_begin is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginEqualTo(Date value) {
            addCriterion("service_time_begin =", value, "serviceTimeBegin");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginNotEqualTo(Date value) {
            addCriterion("service_time_begin <>", value, "serviceTimeBegin");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginGreaterThan(Date value) {
            addCriterion("service_time_begin >", value, "serviceTimeBegin");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("service_time_begin >=", value, "serviceTimeBegin");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginLessThan(Date value) {
            addCriterion("service_time_begin <", value, "serviceTimeBegin");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginLessThanOrEqualTo(Date value) {
            addCriterion("service_time_begin <=", value, "serviceTimeBegin");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginIn(List<Date> values) {
            addCriterion("service_time_begin in", values, "serviceTimeBegin");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginNotIn(List<Date> values) {
            addCriterion("service_time_begin not in", values, "serviceTimeBegin");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginBetween(Date value1, Date value2) {
            addCriterion("service_time_begin between", value1, value2, "serviceTimeBegin");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBeginNotBetween(Date value1, Date value2) {
            addCriterion("service_time_begin not between", value1, value2, "serviceTimeBegin");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndIsNull() {
            addCriterion("service_time_end is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndIsNotNull() {
            addCriterion("service_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndEqualTo(Date value) {
            addCriterion("service_time_end =", value, "serviceTimeEnd");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndNotEqualTo(Date value) {
            addCriterion("service_time_end <>", value, "serviceTimeEnd");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndGreaterThan(Date value) {
            addCriterion("service_time_end >", value, "serviceTimeEnd");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("service_time_end >=", value, "serviceTimeEnd");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndLessThan(Date value) {
            addCriterion("service_time_end <", value, "serviceTimeEnd");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("service_time_end <=", value, "serviceTimeEnd");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndIn(List<Date> values) {
            addCriterion("service_time_end in", values, "serviceTimeEnd");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndNotIn(List<Date> values) {
            addCriterion("service_time_end not in", values, "serviceTimeEnd");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndBetween(Date value1, Date value2) {
            addCriterion("service_time_end between", value1, value2, "serviceTimeEnd");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("service_time_end not between", value1, value2, "serviceTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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