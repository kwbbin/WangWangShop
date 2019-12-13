package com.wangwang.shop.dao;

import com.wangwang.shop.bean.GoodsSortExample;
import com.wangwang.shop.bean.GoodsSortKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSortMapper {
    int countByExample(GoodsSortExample example);

    int deleteByExample(GoodsSortExample example);

    int deleteByPrimaryKey(GoodsSortKey key);

    int insert(GoodsSortKey record);

    int insertSelective(GoodsSortKey record);

    List<GoodsSortKey> selectByExample(GoodsSortExample example);

    int updateByExampleSelective(@Param("record") GoodsSortKey record, @Param("example") GoodsSortExample example);

    int updateByExample(@Param("record") GoodsSortKey record, @Param("example") GoodsSortExample example);
}