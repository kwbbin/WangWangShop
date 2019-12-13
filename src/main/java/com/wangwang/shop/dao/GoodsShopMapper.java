package com.wangwang.shop.dao;

import com.wangwang.shop.bean.GoodsShopExample;
import com.wangwang.shop.bean.GoodsShopKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsShopMapper {
    int countByExample(GoodsShopExample example);

    int deleteByExample(GoodsShopExample example);

    int deleteByPrimaryKey(GoodsShopKey key);

    int insert(GoodsShopKey record);

    int insertSelective(GoodsShopKey record);

    List<GoodsShopKey> selectByExample(GoodsShopExample example);

    int updateByExampleSelective(@Param("record") GoodsShopKey record, @Param("example") GoodsShopExample example);

    int updateByExample(@Param("record") GoodsShopKey record, @Param("example") GoodsShopExample example);
}