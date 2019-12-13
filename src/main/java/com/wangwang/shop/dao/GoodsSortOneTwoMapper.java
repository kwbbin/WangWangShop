package com.wangwang.shop.dao;

import com.wangwang.shop.bean.GoodsSortOneTwo;
import com.wangwang.shop.bean.GoodsSortOneTwoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSortOneTwoMapper {
    int countByExample(GoodsSortOneTwoExample example);

    int deleteByExample(GoodsSortOneTwoExample example);

    int insert(GoodsSortOneTwo record);

    int insertSelective(GoodsSortOneTwo record);

    List<GoodsSortOneTwo> selectByExample(GoodsSortOneTwoExample example);

    int updateByExampleSelective(@Param("record") GoodsSortOneTwo record, @Param("example") GoodsSortOneTwoExample example);

    int updateByExample(@Param("record") GoodsSortOneTwo record, @Param("example") GoodsSortOneTwoExample example);
}