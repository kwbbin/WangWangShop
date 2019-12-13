package com.wangwang.shop.bean;

import java.util.Date;

public class Coupon {
    private Integer couponId;

    private String name;

    private Integer getPrice;

    private Integer reachPrice;

    private Date dateStart;

    private Date dateEnd;

    private Integer status;

    private String desc;

    private Date createDate;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(Integer getPrice) {
        this.getPrice = getPrice;
    }

    public Integer getReachPrice() {
        return reachPrice;
    }

    public void setReachPrice(Integer reachPrice) {
        this.reachPrice = reachPrice;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}