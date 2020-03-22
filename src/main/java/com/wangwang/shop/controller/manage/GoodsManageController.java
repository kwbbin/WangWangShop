package com.wangwang.shop.controller.manage;

import com.wangwang.shop.bean.Goods;
import com.wangwang.shop.bean.ImagesGoodsKey;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.service.manage.GoodsImagesService;
import com.wangwang.shop.service.manage.GoodsManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manage")
public class GoodsManageController {

    @Autowired
    GoodsManageService goodsManageService;

    @Autowired
    GoodsImagesService goodsImagesService;

    @RequestMapping("/goods/add")
    public ResultBean<String> GoodsAdd(@RequestBody Goods goods){
        ResultBean<String> resultBean = goodsManageService.GoodsAdd(goods);
        return resultBean;
    }

    @RequestMapping("/goodsImages/add")
    public void saveGoodsAndImages(@RequestBody ImagesGoodsKey imagesGoodsKey){
        goodsImagesService.saveImageGoods(imagesGoodsKey);
    }



}
