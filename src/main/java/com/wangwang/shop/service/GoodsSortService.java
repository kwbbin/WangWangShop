package com.wangwang.shop.service;

import com.wangwang.shop.bean.*;
import com.wangwang.shop.bean.VO.SortAllVo;

import java.util.List;
import java.util.Map;

public interface GoodsSortService {
    ResultBean<Map<String, List<String>>> getGoodsSortAll();
    ResultBean<String> addSrot(SortAllVo sortAll);
    ResultBean<List<SortAll>> getSortAll();
    ResultBean<String> updateSortAll(SortAll sortAll);
    ResultBean updateSortHot(Integer id);
    ResultBean<List<GoodsSortTwo>> getAllSortTwoByOneId(Integer id);
    ResultBean<Map<String, List<SortAll>>> getSortAllDetail();
    ResultBean<List<ViewSort>> getAllViewSort();
    ResultBean<List<GoodsSortOne>> getAllSortOneNotInViewSort();
    ResultBean<String> addViewSort(ViewSort viewSort);
    ResultBean<String> removeViewSortById(Integer id);


}
