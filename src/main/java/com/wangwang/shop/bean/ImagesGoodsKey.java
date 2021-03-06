package com.wangwang.shop.bean;

import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="images_goods")
@ToString
@IdClass(GoodsImagesPK.class)
public class ImagesGoodsKey extends GoodsImagesPK{
    private Long goodsId;

    private Long imageId;

    @Id
    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Id
    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }
}