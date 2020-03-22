package com.wangwang.shop.service.manage.manageImpl;

import com.wangwang.shop.bean.Goods;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.dao.manage_dao.GoodsManageDao;
import com.wangwang.shop.service.manage.GoodsManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GoodsManageServiceImpl implements GoodsManageService {
    @Autowired
    GoodsManageDao goodsManageDao;


    @Override
    public ResultBean<String> GoodsAdd(Goods goods) {
        ResultBean<String > resultBean = new ResultBean();
        goods.setCreateDate(new Date());
        goods.setSaleDate(new Date());
        goods.setVisitNum(0);
        goods.setCollected(0);
        Goods goods1=goodsManageDao.save(goods);
        goods1.setGoodsNumber(goods1.getGoodsId()+"");
        goodsManageDao.save(goods1);
        resultBean.setData(goods1.getGoodsId()+"");
        resultBean.setCode(0);
        resultBean.setMessage("保存成功");
        return resultBean;
    }
}
