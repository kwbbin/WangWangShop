package com.wangwang.shop.service;

import com.wangwang.shop.bean.Goods;
import com.wangwang.shop.bean.GoodsImages;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.SortAll;
import com.wangwang.shop.bean.VO.GoodsImagesVo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface GoodsService {
    ResultBean<Goods> getGoodsById(Long id);
    ResultBean<SortAll> getSortAllByGoodsId(Long id);
    ResultBean<List<GoodsImagesVo>> getGoodsByIds(@RequestBody Long [] ids);
    ResultBean<List<GoodsImages>> getImagesByGoodsId(Long id);
    ResultBean<GoodsImages> getImageByGoodsId(GoodsImages goodsImages);
    ResultBean<String> getCategoryNameById(Integer id);
    ResultBean<List<GoodsImagesVo>> getCategoryGoodsByCId(Integer id);
    ResultBean<List<GoodsImagesVo>>  searchGoods(String str);
    ResultBean<List<GoodsImagesVo>> guessUserLove();
}
