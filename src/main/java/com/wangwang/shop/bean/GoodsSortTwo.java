package com.wangwang.shop.bean;

public class GoodsSortTwo {
    private Integer goodsSortTwoId;

    private String sortName;

    public Integer getGoodsSortTwoId() {
        return goodsSortTwoId;
    }

    public void setGoodsSortTwoId(Integer goodsSortTwoId) {
        this.goodsSortTwoId = goodsSortTwoId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName == null ? null : sortName.trim();
    }
}