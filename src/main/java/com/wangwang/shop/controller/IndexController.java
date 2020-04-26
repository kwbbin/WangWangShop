package com.wangwang.shop.controller;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.SortAll;
import com.wangwang.shop.bean.ViewSort;
import com.wangwang.shop.service.GoodsSortService;
import com.wangwang.shop.service.ViewSortService;
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

    @Autowired
    ViewSortService viewSortService ;

    @RequestMapping("/Category")
    public ResultBean<Map<String, List<String>>> getCategory(){
        return goodsSortService.getGoodsSortAll();
    }

    @RequestMapping("/CategoryDetail")
    public ResultBean<Map<String, List<SortAll>>> getCategoryDetail(){
        return goodsSortService.getSortAllDetail();
    }

    @RequestMapping("/getAllViewSort")
    public ResultBean<List<ViewSort>> getAllViewSort(){
        return viewSortService.getAllViewSort();
    }

}
