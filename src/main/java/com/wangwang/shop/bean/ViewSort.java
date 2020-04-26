package com.wangwang.shop.bean;

public class ViewSort {
    private Integer goodsSortOne;

    private String viewName;

    public Integer getGoodsSortOne() {
        return goodsSortOne;
    }

    public void setGoodsSortOne(Integer goodsSortOne) {
        this.goodsSortOne = goodsSortOne;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName == null ? null : viewName.trim();
    }
}