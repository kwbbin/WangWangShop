package com.wangwang.shop.controller;

import com.wangwang.shop.bean.Goods;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.ShoppingCart;
import com.wangwang.shop.bean.User;
import com.wangwang.shop.bean.VO.ShopCartVo;
import com.wangwang.shop.service.ShopingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
public class ShoppingCartController {

    @Autowired
    ShopingCartService shopingCartService;


    @RequestMapping("/getshopCartByUid")
    public ResultBean<List<ShoppingCart>> getShoppingCartByUid(@RequestBody User user){
        return shopingCartService.getShoppingCartByUid(user.getUserId());
    }

    @RequestMapping("/saveShopCart")
    public void saveShoppingCart(@RequestBody List<ShopCartVo> list, HttpServletRequest request){
        shopingCartService.saveShoppingCart(list,request);
    }

    @RequestMapping("/deleteShopCartByGoodsId")
    public void deleteShoppingCart(@RequestBody Goods goods, HttpServletRequest request){
        shopingCartService.deleteShoppingCart(goods.getGoodsId(),request);
    }

    @RequestMapping("/deleteShopCartByGoodsIds")
    public void deleteShoppingCartByIds(@RequestBody List<Long> ids, HttpServletRequest request){
        shopingCartService.deleteShoppingCartByIds(ids,request);
    }
}
