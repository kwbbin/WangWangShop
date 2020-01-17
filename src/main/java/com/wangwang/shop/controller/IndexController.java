package com.wangwang.shop.controller;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.service.GoodsSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user/home")
public class IndexController {

    @Autowired
    GoodsSortService goodsSortService;

    @RequestMapping("/Category")
    public ResultBean<Map<String, List<String>>> getCategory(){
        return goodsSortService.getGoodsSortAll();
    }
}
