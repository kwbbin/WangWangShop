package com.wangwang.shop.bean;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="goods_sort_one_two")
@ToString
@IdClass(GoodsSortOneTwoPK.class)
public class GoodsSortOneTwo extends GoodsSortOneTwoPK {

    private Integer goodsSortOneId;


    private Integer goodSortTwoId;

    @Id
    public Integer getGoodsSortOneId() {
        return goodsSortOneId;
    }

    public void setGoodsSortOneId(Integer goodsSortOneId) {
        this.goodsSortOneId = goodsSortOneId;
    }

    @Id
    public Integer getGoodSortTwoId() {
        return goodSortTwoId;
    }

    public void setGoodSortTwoId(Integer goodSortTwoId) {
        this.goodSortTwoId = goodSortTwoId;
    }
}