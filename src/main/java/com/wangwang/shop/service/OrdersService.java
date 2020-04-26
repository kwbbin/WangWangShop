package com.wangwang.shop.service;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.VO.OrdersVo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface OrdersService {
    ResultBean<List<Long>> addOrders(List<OrdersVo> list, HttpServletRequest request);
    ResultBean<String> selectOrderNotPay(HttpServletRequest request);
    ResultBean<String> destructionOrders(Long id);
    ResultBean<List<OrdersVo>> getAllUnpaidOrders(HttpServletRequest request,String str);
    ResultBean<OrdersVo> getOrdersVoByGoodsIdAndNum(OrdersVo ordersVo);
    ResultBean<List<OrdersVo>> getOrdersVoByOrderIds(List<Long> list);

}
