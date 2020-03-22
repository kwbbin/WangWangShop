package com.wangwang.shop.service;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.VO.HomeViewVo;

import java.util.List;

public interface HomeService {
    ResultBean<List<HomeViewVo>> getHomeView();
}
