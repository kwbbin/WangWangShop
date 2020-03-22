package com.wangwang.shop.bean;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="images")
@ToString
public class Images {
    private Long imageId;

    private String imageUrl;

    private String imageDesc;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getImageDesc() {
        return imageDesc;
    }

    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc == null ? null : imageDesc.trim();
    }
}