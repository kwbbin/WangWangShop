package com.wangwang.shop.bean;

import java.util.Date;

public class Ad {
    private Integer adId;

    private String name;

    private Long imgUrl;

    private Integer adPosition;

    private Date adStartDate;

    private Date adEndDate;

    private Integer adSort;

    private Integer adClickNum;

    private Date createTime;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Long imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getAdPosition() {
        return adPosition;
    }

    public void setAdPosition(Integer adPosition) {
        this.adPosition = adPosition;
    }

    public Date getAdStartDate() {
        return adStartDate;
    }

    public void setAdStartDate(Date adStartDate) {
        this.adStartDate = adStartDate;
    }

    public Date getAdEndDate() {
        return adEndDate;
    }

    public void setAdEndDate(Date adEndDate) {
        this.adEndDate = adEndDate;
    }

    public Integer getAdSort() {
        return adSort;
    }

    public void setAdSort(Integer adSort) {
        this.adSort = adSort;
    }

    public Integer getAdClickNum() {
        return adClickNum;
    }

    public void setAdClickNum(Integer adClickNum) {
        this.adClickNum = adClickNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}