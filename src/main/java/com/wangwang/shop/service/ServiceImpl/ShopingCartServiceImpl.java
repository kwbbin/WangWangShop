package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.ShoppingCart;
import com.wangwang.shop.bean.ShoppingCartExample;
import com.wangwang.shop.bean.User;
import com.wangwang.shop.bean.VO.ShopCartVo;
import com.wangwang.shop.dao.ShoppingCartMapper;
import com.wangwang.shop.service.ShopingCartService;
import com.wangwang.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class ShopingCartServiceImpl implements ShopingCartService {
    @Autowired
    ShoppingCartMapper shoppingCartMapper;

    @Autowired
    UserService userService;

    public ResultBean<List<ShoppingCart>> getShoppingCartByUid(Long id){
        ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
        shoppingCartExample.createCriteria().andUidEqualTo(id);
        List<ShoppingCart> list = shoppingCartMapper.selectByExample(shoppingCartExample);
        ResultBean resultBean = new ResultBean();
        resultBean.setMessage("success");
        resultBean.setCode(0);
        resultBean.setData(list);
        return resultBean;
    }

    @Override
    public void saveShoppingCart(List<ShopCartVo> list, HttpServletRequest request) {
        User user = userService.getUserByToken(request.getHeader("token"));
        Long id=user.getUserId();
        for(ShopCartVo shopCartVo:list){
            ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
            shoppingCartExample.createCriteria().andGoodsIdEqualTo(shopCartVo.getGoodsId());
            shoppingCartExample.createCriteria().andUidEqualTo(id);
            List<ShoppingCart> list2 = shoppingCartMapper.selectByExample(shoppingCartExample);
            if(list2.size()==0){
                ShoppingCart shoppingCart = new ShoppingCart();
                shoppingCart.setCreateTime(new Date());
                shoppingCart.setGoodsId(shopCartVo.getGoodsId());
                shoppingCart.setNum(shopCartVo.getGoodsNum());
                shoppingCart.setUid(id);
                shoppingCartMapper.insert(shoppingCart);
            }
        }

    }

    @Override
    public void deleteShoppingCart(Long gid, HttpServletRequest request) {
        User user = userService.getUserByToken(request.getHeader("token"));
        Long uid=user.getUserId();
        ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
        shoppingCartExample.createCriteria().andGoodsIdEqualTo(gid);
        shoppingCartExample.createCriteria().andUidEqualTo(uid);
        shoppingCartMapper.deleteByExample(shoppingCartExample);
    }

    @Override
    public void deleteShoppingCartByIds(List<Long> ids, HttpServletRequest request) {
        User user = userService.getUserByToken(request.getHeader("token"));
        Long uid=user.getUserId();
        for(Long id:ids){
            ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
            shoppingCartExample.createCriteria().andGoodsIdEqualTo(id);
            shoppingCartExample.createCriteria().andUidEqualTo(uid);
            shoppingCartMapper.deleteByExample(shoppingCartExample);
        }
    }
}
