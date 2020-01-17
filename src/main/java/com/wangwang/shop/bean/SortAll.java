package com.wangwang.shop.bean;

import javax.persistence.*;

@Entity
@Table(name="sort_all")
public class SortAll {
    String sortOne;
    Integer oneId;
    String sortTwo;
    Integer twoId;
    String hotNum;


    public String getSortOne() {
        return sortOne;
    }

    public void setSortOne(String sortOne) {
        this.sortOne = sortOne;
    }

    public Integer getOneId() {
        return oneId;
    }

    public void setOneId(Integer oneId) {
        this.oneId = oneId;
    }

    public String getSortTwo() {
        return sortTwo;
    }

    public void setSortTwo(String sortTwo) {
        this.sortTwo = sortTwo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getTwoId() {
        return twoId;
    }

    public void setTwoId(Integer twoId) {
        this.twoId = twoId;
    }

    public String getHotNum() {
        return hotNum;
    }

    public void setHotNum(String hotNum) {
        this.hotNum = hotNum;
    }

    @Override
    public String toString() {
        return "SortAll{" +
                "sortOne='" + sortOne + '\'' +
                ", oneId=" + oneId +
                ", sortTwo='" + sortTwo + '\'' +
                ", twoId=" + twoId +
                ", hotNum='" + hotNum + '\'' +
                '}';
    }
}
