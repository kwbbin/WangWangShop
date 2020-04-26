package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.*;
import com.wangwang.shop.bean.VO.OrdersVo;
import com.wangwang.shop.dao.GoodsImagesMapper;
import com.wangwang.shop.dao.ShopOrderMapper;
import com.wangwang.shop.service.GoodsService;
import com.wangwang.shop.service.OrdersService;
import com.wangwang.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    GoodsService goodsService;

    @Autowired
    UserService userService;

    @Autowired
    ShopOrderMapper shopOrderMapper;

    @Autowired
    GoodsImagesMapper goodsImagesMapper;

    @Override
    public ResultBean<List<Long>> addOrders(List<OrdersVo> list, HttpServletRequest request) {
        String token  = request.getHeader("token");
        User user = userService.getUserByToken(token);
        List<Long> oIds = new ArrayList<>();
        for (OrdersVo ordersVo : list){
            ShopOrder order = new ShopOrder();
            Goods goods = goodsService.getGoodsById(ordersVo.getGoodsId()).getData();
            order.setCount(ordersVo.getNum());
            order.setGoodsId(ordersVo.getGoodsId());
            order.setCreateDate(new Date());
            order.setGoodsNum(goods.getGoodsNumber());
            BigDecimal totalPrice = goods.getPrice().multiply(new BigDecimal(ordersVo.getNum()));
            order.setTotalPrice(totalPrice.doubleValue());
            order.setStatus(1);
            order.setPrice(ordersVo.getPrice());
            order.setUserId(user.getUserId());

            shopOrderMapper.insertSelective(order);
            oIds.add(order.getOrderId());
        }
        ResultBean resultBean = new ResultBean(0,"success",oIds);
        return resultBean;
    }

    @Override
    public ResultBean<String> selectOrderNotPay(HttpServletRequest request) {
        String  token = request.getHeader("token");
        User user = userService.getUserByToken(token);
        ShopOrderExample shopOrderExample = new ShopOrderExample();
        shopOrderExample.createCriteria().andUserIdEqualTo(user.getUserId()).andStatusEqualTo(1);
        List<ShopOrder> list = shopOrderMapper.selectByExample(shopOrderExample);
        ResultBean resultBean = new ResultBean(0,"success","true");
        if (list.size()>0){
            return resultBean;
        }else{
            return new ResultBean<>(0,"success","false");
        }
    }

    @Override
    public ResultBean<String> destructionOrders(Long id) {
        try {
            ShopOrderExample shopOrderExample = new ShopOrderExample();
            shopOrderExample.createCriteria().andOrderIdEqualTo(id);
            ShopOrder shopOrder = new ShopOrder();
            shopOrder.setStatus(2);
            shopOrderMapper.updateByExampleSelective(shopOrder,shopOrderExample);
        }catch (Exception e){

        }

        return new ResultBean<>(0,"success","");
    }

    @Override
    public ResultBean<List<OrdersVo>> getAllUnpaidOrders(HttpServletRequest request,String string) {
        String token = request.getHeader("token");
        User user = userService.getUserByToken(token);
        ShopOrderExample shopOrderExample = new ShopOrderExample();
        if("not2".equals(string)){
            shopOrderExample.createCriteria().andUserIdEqualTo(user.getUserId()).andStatusNotEqualTo(2);
        }else {
            shopOrderExample.createCriteria().andUserIdEqualTo(user.getUserId()).andStatusEqualTo(1);
        }

        List<ShopOrder> list = shopOrderMapper.selectByExample(shopOrderExample);
        List<OrdersVo> listVo = new ArrayList<>();
        for (ShopOrder so : list){
            OrdersVo ordersVo = new OrdersVo();
            ordersVo.setOrderId(so.getOrderId());
            Goods goods = goodsService.getGoodsById(so.getGoodsId()).getData();
            GoodsImagesExample goodsImagesExample = new GoodsImagesExample();
            goodsImagesExample.createCriteria().andGoodsIdEqualTo(goods.getGoodsId());
            GoodsImages goodsImages = goodsImagesMapper.selectByExample(goodsImagesExample).get(0);
            String str=goodsImages.getImageUrl();
            if(goodsImages.getImageUrl().contains("/")){
                str=str.substring(str.lastIndexOf("/"));
            }
            ordersVo.setName(goods.getName());
            ordersVo.setGoodsDesc(goods.getGoodsDesc());
            ordersVo.setPrice(goods.getPrice().doubleValue());
            ordersVo.setNum(so.getCount());
            ordersVo.setGoodsId(goods.getGoodsId());
            ordersVo.setImageUrl(str);
            ordersVo.setOrderId(so.getOrderId());
            ordersVo.setStatus(so.getStatus());
            ordersVo.setTotalPrice(ordersVo.getPrice()*ordersVo.getNum());
            listVo.add(ordersVo);
        }

        return new ResultBean<>(0,"success",listVo);
    }

    public ResultBean<OrdersVo> getOrdersVoByGoodsIdAndNum(OrdersVo ordersVo){
        Long goodsId = ordersVo.getGoodsId();
        Integer num = ordersVo.getNum();
        Goods goods = goodsService.getGoodsById(goodsId).getData();
        GoodsImagesExample goodsImagesExample = new GoodsImagesExample();
        goodsImagesExample.createCriteria().andGoodsIdEqualTo(goods.getGoodsId());
        GoodsImages goodsImages = goodsImagesMapper.selectByExample(goodsImagesExample).get(0);
        String str=goodsImages.getImageUrl();
        if(goodsImages.getImageUrl().contains("/")){
            str=str.substring(str.lastIndexOf("/"));
        }
        ordersVo.setName(goods.getName());
        ordersVo.setGoodsDesc(goods.getGoodsDesc());
        ordersVo.setPrice(goods.getPrice().doubleValue());
        ordersVo.setNum(num);
        ordersVo.setGoodsId(goods.getGoodsId());
        ordersVo.setImageUrl(str);
        ordersVo.setTotalPrice(ordersVo.getPrice()*ordersVo.getNum());
        return new ResultBean<>(0,"success",ordersVo);
    }

    @Override
    public ResultBean<List<OrdersVo>> getOrdersVoByOrderIds(List<Long> list) {
        List<OrdersVo> list1 = new ArrayList<>();
        for (Long id : list){
            OrdersVo ordersVo = new OrdersVo();
            ShopOrder shopOrder = shopOrderMapper.selectByPrimaryKey(id);
            Goods goods = goodsService.getGoodsById(shopOrder.getGoodsId()).getData();
            GoodsImagesExample goodsImagesExample = new GoodsImagesExample();
            goodsImagesExample.createCriteria().andGoodsIdEqualTo(goods.getGoodsId());
            GoodsImages goodsImages = goodsImagesMapper.selectByExample(goodsImagesExample).get(0);
            String str=goodsImages.getImageUrl();
            if(goodsImages.getImageUrl().contains("/")){
                str=str.substring(str.lastIndexOf("/"));
            }
            ordersVo.setName(goods.getName());
            ordersVo.setGoodsDesc(goods.getGoodsDesc());
            ordersVo.setPrice(goods.getPrice().doubleValue());
            ordersVo.setNum(shopOrder.getCount());
            ordersVo.setGoodsId(goods.getGoodsId());
            ordersVo.setOrderId(shopOrder.getOrderId());
            ordersVo.setImageUrl(str);
            ordersVo.setTotalPrice(ordersVo.getPrice()*ordersVo.getNum());
            list1.add(ordersVo);
        }
        return new ResultBean<>(0,"success",list1);
    }


}
