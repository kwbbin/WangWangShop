package com.wangwang.shop.dao;

import com.wangwang.shop.bean.GoodsImages;
import com.wangwang.shop.bean.GoodsImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsImagesMapper {
    int countByExample(GoodsImagesExample example);

    int deleteByExample(GoodsImagesExample example);

    int insert(GoodsImages record);

    int insertSelective(GoodsImages record);

    List<GoodsImages> selectByExample(GoodsImagesExample example);

    int updateByExampleSelective(@Param("record") GoodsImages record, @Param("example") GoodsImagesExample example);

    int updateByExample(@Param("record") GoodsImages record, @Param("example") GoodsImagesExample example);
}