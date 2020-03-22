package com.wangwang.shop.bean;

import java.io.Serializable;

public class GoodsImagesPK implements Serializable {
    private Long goodsId;
    private Long imageId;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }
}
