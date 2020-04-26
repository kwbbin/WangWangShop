package com.wangwang.shop.service;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.ViewSort;

import java.util.List;

public interface ViewSortService {
    ResultBean<List<ViewSort>> getAllViewSort();
}
