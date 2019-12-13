package com.wangwang.shop.bean;

import java.util.Date;

public class Shop {
    private String shopNumber;

    private Integer shopId;

    private String shopName;

    private Long shopDirecto;

    private String shopImage;

    private String shopPhone;

    private String shopQq;

    private String shopAdress;

    private Date serviceTimeBegin;

    private Date serviceTimeEnd;

    private Date createDate;

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber == null ? null : shopNumber.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Long getShopDirecto() {
        return shopDirecto;
    }

    public void setShopDirecto(Long shopDirecto) {
        this.shopDirecto = shopDirecto;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage == null ? null : shopImage.trim();
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone == null ? null : shopPhone.trim();
    }

    public String getShopQq() {
        return shopQq;
    }

    public void setShopQq(String shopQq) {
        this.shopQq = shopQq == null ? null : shopQq.trim();
    }

    public String getShopAdress() {
        return shopAdress;
    }

    public void setShopAdress(String shopAdress) {
        this.shopAdress = shopAdress == null ? null : shopAdress.trim();
    }

    public Date getServiceTimeBegin() {
        return serviceTimeBegin;
    }

    public void setServiceTimeBegin(Date serviceTimeBegin) {
        this.serviceTimeBegin = serviceTimeBegin;
    }

    public Date getServiceTimeEnd() {
        return serviceTimeEnd;
    }

    public void setServiceTimeEnd(Date serviceTimeEnd) {
        this.serviceTimeEnd = serviceTimeEnd;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}