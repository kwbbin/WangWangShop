package com.wangwang.shop.controller;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.ShopOrder;
import com.wangwang.shop.bean.VO.OrdersVo;
import com.wangwang.shop.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrdersService ordersService;

    @RequestMapping("/saveOrders")
    public ResultBean<List<Long>> addOrders(@RequestBody List<OrdersVo> list, HttpServletRequest request){
        return ordersService.addOrders(list,request);
    }

    @RequestMapping("/selectOrderNotPay")
    public ResultBean<String> selectOrderNotPay(HttpServletRequest request) {
        return ordersService.selectOrderNotPay(request);
    }

    @RequestMapping("/getAllNoFailureOrders")
    public ResultBean<List<OrdersVo>> getAllNoFailureOrders(HttpServletRequest request){
        return ordersService.getAllUnpaidOrders(request,"not2");
    }

    @RequestMapping("/getAllUnpaidOrders")
    public ResultBean<List<OrdersVo>> getAllUnpaidOrders(HttpServletRequest request){
        return ordersService.getAllUnpaidOrders(request,"");
    }

    @RequestMapping("/getOrdersVoByGoodsIdAndNum")
    public ResultBean<OrdersVo> getOrdersVoByGoodsIdAndNum(@RequestBody OrdersVo ordersVo){
        return ordersService.getOrdersVoByGoodsIdAndNum(ordersVo);
    }

    @RequestMapping("/getOrdersVoByOrderIds")
    public ResultBean<List<OrdersVo>> getOrdersVoByOrderIds(@RequestBody List<Long> list){
        return ordersService.getOrdersVoByOrderIds(list);
    }

    @RequestMapping("/destructionOrders")
    public ResultBean<String> destructionOrders(@RequestBody ShopOrder shopOrder){
        return ordersService.destructionOrders(shopOrder.getOrderId());
    }
}
