package com.wangwang.shop.service;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.region.City;

import java.util.List;

public interface RegionService {
    ResultBean<List<City>> getCitysByFather(String id);
    ResultBean<List<City>> getProvince();
}
