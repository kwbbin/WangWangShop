package com.wangwang.shop.service.manage.manageImpl;

import com.wangwang.shop.bean.ImagesGoodsKey;
import com.wangwang.shop.dao.manage_dao.GoodsImageDao;
import com.wangwang.shop.service.manage.GoodsImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsImagesServiceImpl implements GoodsImagesService {
    @Autowired
    GoodsImageDao goodsImageDao;

    @Override
    public void saveImageGoods(ImagesGoodsKey imagesGoodsKey) {
        goodsImageDao.save(imagesGoodsKey);
    }
}
