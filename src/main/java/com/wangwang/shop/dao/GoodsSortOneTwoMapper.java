package com.wangwang.shop.dao;

import com.wangwang.shop.bean.GoodsSortOneTwoExample;
import com.wangwang.shop.bean.GoodsSortOneTwoKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSortOneTwoMapper {
    int countByExample(GoodsSortOneTwoExample example);

    int deleteByExample(GoodsSortOneTwoExample example);

    int deleteByPrimaryKey(GoodsSortOneTwoKey key);

    int insert(GoodsSortOneTwoKey record);

    int insertSelective(GoodsSortOneTwoKey record);

    List<GoodsSortOneTwoKey> selectByExample(GoodsSortOneTwoExample example);

    int updateByExampleSelective(@Param("record") GoodsSortOneTwoKey record, @Param("example") GoodsSortOneTwoExample example);

    int updateByExample(@Param("record") GoodsSortOneTwoKey record, @Param("example") GoodsSortOneTwoExample example);
}