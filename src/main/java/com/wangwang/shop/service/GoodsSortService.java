package com.wangwang.shop.service;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.SortAll;
import com.wangwang.shop.bean.VO.SortAllVo;

import java.util.List;
import java.util.Map;

public interface GoodsSortService {
    ResultBean<Map<String, List<String>>> getGoodsSortAll();
    ResultBean<String> addSrot(SortAllVo sortAll);
    ResultBean<List<SortAll>> getSortAll();
    ResultBean<String> updateSortAll(SortAll sortAll);
    ResultBean updateSortHot(Integer id);
}
