package com.wangwang.shop.bean;

import lombok.ToString;

@ToString
public class ViewHome {
    private Integer goodsSortOneId;

    private String sortOneName;

    private Integer goodsSortTwoId;

    private String sortTwoName;

    private Long goodsId;

    private String name;

    private String goodsNumber;

    private Integer goodsSortId;

    private Integer saleTotal;

    private Integer visitNum;

    private String imageDesc;

    private String imageUrl;

    private Long imageId;

    private String viewName;

    public Integer getGoodsSortOneId() {
        return goodsSortOneId;
    }

    public void setGoodsSortOneId(Integer goodsSortOneId) {
        this.goodsSortOneId = goodsSortOneId;
    }

    public String getSortOneName() {
        return sortOneName;
    }

    public void setSortOneName(String sortOneName) {
        this.sortOneName = sortOneName == null ? null : sortOneName.trim();
    }

    public Integer getGoodsSortTwoId() {
        return goodsSortTwoId;
    }

    public void setGoodsSortTwoId(Integer goodsSortTwoId) {
        this.goodsSortTwoId = goodsSortTwoId;
    }

    public String getSortTwoName() {
        return sortTwoName;
    }

    public void setSortTwoName(String sortTwoName) {
        this.sortTwoName = sortTwoName == null ? null : sortTwoName.trim();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber == null ? null : goodsNumber.trim();
    }

    public Integer getGoodsSortId() {
        return goodsSortId;
    }

    public void setGoodsSortId(Integer goodsSortId) {
        this.goodsSortId = goodsSortId;
    }

    public Integer getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(Integer saleTotal) {
        this.saleTotal = saleTotal;
    }

    public Integer getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    public String getImageDesc() {
        return imageDesc;
    }

    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc == null ? null : imageDesc.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName == null ? null : viewName.trim();
    }
}