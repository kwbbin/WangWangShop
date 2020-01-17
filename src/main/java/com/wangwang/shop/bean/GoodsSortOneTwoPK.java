package com.wangwang.shop.bean;

import java.io.Serializable;

//@Embeddable
public class GoodsSortOneTwoPK implements Serializable {
    private Integer goodsSortOneId;

    private Integer goodSortTwoId;

    public Integer getGoodsSortOneId() {
        return goodsSortOneId;
    }

    public void setGoodsSortOneId(Integer goodsSortOneId) {
        this.goodsSortOneId = goodsSortOneId;
    }

    public Integer getGoodSortTwoId() {
        return goodSortTwoId;
    }

    public void setGoodSortTwoId(Integer goodSortTwoId) {
        this.goodSortTwoId = goodSortTwoId;
    }
}
