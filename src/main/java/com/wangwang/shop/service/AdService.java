package com.wangwang.shop.service;

import com.wangwang.shop.bean.Ad;

public interface AdService {
    void insertAd(Ad ad);
    Ad selectAds(Integer adId);
}
