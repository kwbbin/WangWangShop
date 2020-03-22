package com.wangwang.shop.service.manage;

import com.wangwang.shop.bean.Goods;
import com.wangwang.shop.bean.ResultBean;

public interface GoodsManageService {

    ResultBean<String> GoodsAdd(Goods goods);
}
