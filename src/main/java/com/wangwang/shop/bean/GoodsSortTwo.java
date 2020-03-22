package com.wangwang.shop.bean;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="goods_sort_two")
@ToString
public class GoodsSortTwo {
    private Integer goodsSortTwoId;

    private String sortName;

    private Integer hotNum;

    private Byte state;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Integer getHotNum() {
        return hotNum;
    }

    public void setHotNum(Integer hotNum) {
        this.hotNum = hotNum;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}