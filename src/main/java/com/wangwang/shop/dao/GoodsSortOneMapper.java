package com.wangwang.shop.dao;

import com.wangwang.shop.bean.GoodsSortOne;
import com.wangwang.shop.bean.GoodsSortOneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSortOneMapper {
    int countByExample(GoodsSortOneExample example);

    int deleteByExample(GoodsSortOneExample example);

    int deleteByPrimaryKey(Integer goodsSortOneId);

    int insert(GoodsSortOne record);

    int insertSelective(GoodsSortOne record);

    List<GoodsSortOne> selectByExample(GoodsSortOneExample example);

    GoodsSortOne selectByPrimaryKey(Integer goodsSortOneId);

    int updateByExampleSelective(@Param("record") GoodsSortOne record, @Param("example") GoodsSortOneExample example);

    int updateByExample(@Param("record") GoodsSortOne record, @Param("example") GoodsSortOneExample example);

    int updateByPrimaryKeySelective(GoodsSortOne record);

    int updateByPrimaryKey(GoodsSortOne record);
}