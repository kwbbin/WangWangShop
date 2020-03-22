package com.wangwang.shop.controller;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.VO.HomeViewVo;
import com.wangwang.shop.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户主页
 */
@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    HomeService homeService;

    @RequestMapping("/goods")
    public ResultBean<List<HomeViewVo>> getViewHome(){
        return homeService.getHomeView();
    }
}
