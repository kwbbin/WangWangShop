package com.wangwang.shop.controller;

import com.wangwang.shop.bean.*;
import com.wangwang.shop.bean.VO.GoodsImagesVo;
import com.wangwang.shop.service.ServiceImpl.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsServiceImpl goodsService;

    @PostMapping("/getGoodsById")
    public ResultBean<Goods> getGoodsById(@RequestBody Goods goodsId){
        return goodsService.getGoodsById(goodsId.getGoodsId());
    }

    @PostMapping("/getGoodsByIds")
    public ResultBean<List<GoodsImagesVo>> getGoodsByIds(@RequestBody Long [] ids){
        return goodsService.getGoodsByIds(ids);
    }

    @PostMapping("/getSortAllById")
    public ResultBean<SortAll> getSortAllByGoodsId(@RequestBody Goods goods){
        return goodsService.getSortAllByGoodsId(goods.getGoodsId());
    }

    @PostMapping("/getImagesById")
    public ResultBean<List<GoodsImages>> getImagesByGoodsId(@RequestBody GoodsImages goodsImages){
        return goodsService.getImagesByGoodsId(goodsImages.getGoodsId());
    };

    @PostMapping("/getImageById")
    public ResultBean<GoodsImages> getImageByGoodsId(@RequestBody GoodsImages goodsImages){
        return goodsService.getImageByGoodsId(goodsImages);
    };

    @RequestMapping("/getCategoryGoodsByCId")
    public ResultBean<List<GoodsImagesVo>> getCategoryGoodsByCId(@RequestBody GoodsSortTwo goodsSortTwo){
        return goodsService.getCategoryGoodsByCId(goodsSortTwo.getGoodsSortTwoId());
    }

    @RequestMapping("/searchGoods")
    ResultBean<List<GoodsImagesVo>> searchGoods(@RequestBody myString str){
        return goodsService.searchGoods(str.getStr());
    }

    @RequestMapping("/guessUserLove")
    public ResultBean<List<GoodsImagesVo>> guessUserLove(){
        return goodsService.guessUserLove();
    }

}

class myString {
    String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}