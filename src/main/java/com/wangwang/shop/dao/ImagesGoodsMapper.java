package com.wangwang.shop.dao;

import com.wangwang.shop.bean.ImagesGoodsExample;
import com.wangwang.shop.bean.ImagesGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImagesGoodsMapper {
    int countByExample(ImagesGoodsExample example);

    int deleteByExample(ImagesGoodsExample example);

    int deleteByPrimaryKey(ImagesGoodsKey key);

    int insert(ImagesGoodsKey record);

    int insertSelective(ImagesGoodsKey record);

    List<ImagesGoodsKey> selectByExample(ImagesGoodsExample example);

    int updateByExampleSelective(@Param("record") ImagesGoodsKey record, @Param("example") ImagesGoodsExample example);

    int updateByExample(@Param("record") ImagesGoodsKey record, @Param("example") ImagesGoodsExample example);
}