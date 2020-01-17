package com.wangwang.shop.bean.VO;

public class SortAllVo {
    String sortOne;
    Integer oneId;
    String sortTwo;
    Integer twoId;
    String type;

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

    public Integer getTwoId() {
        return twoId;
    }

    public void setTwoId(Integer twoId) {
        this.twoId = twoId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SortAllVo{" +
                "sortOne='" + sortOne + '\'' +
                ", oneId=" + oneId +
                ", sortTwo='" + sortTwo + '\'' +
                ", twoId=" + twoId +
                ", type='" + type + '\'' +
                '}';
    }
}
