package com.wangwang.shop.bean;

public class GoodsSortOne {
    private Integer goodsSortOneId;

    private String sortName;

    public Integer getGoodsSortOneId() {
        return goodsSortOneId;
    }

    public void setGoodsSortOneId(Integer goodsSortOneId) {
        this.goodsSortOneId = goodsSortOneId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName == null ? null : sortName.trim();
    }
}