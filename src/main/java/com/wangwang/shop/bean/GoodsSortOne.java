package com.wangwang.shop.bean;

import javax.persistence.*;

@Entity
@Table(name="goods_sort_one")
public class GoodsSortOne {
    private Integer goodsSortOneId;

    private String sortName;

    private Byte state;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}