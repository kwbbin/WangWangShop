package com.wangwang.shop.service;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.ShoppingCart;
import com.wangwang.shop.bean.VO.ShopCartVo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ShopingCartService {
    ResultBean<List<ShoppingCart>> getShoppingCartByUid(Long id);
    void saveShoppingCart(List<ShopCartVo> list, HttpServletRequest request);
    void deleteShoppingCart(Long id, HttpServletRequest request);
    void deleteShoppingCartByIds(List<Long> ids, HttpServletRequest request);
}
