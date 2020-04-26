package com.wangwang.shop.controller;

import com.wangwang.shop.bean.GoodsSortTwo;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryGoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/getCategoryNameById")
    public ResultBean<String> getCategoryNameById(@RequestBody GoodsSortTwo sortTwo){
        return goodsService.getCategoryNameById(sortTwo.getGoodsSortTwoId());
    }
}
