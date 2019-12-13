package com.wangwang.shop.dao;

import com.wangwang.shop.bean.GoodsSortTwo;
import com.wangwang.shop.bean.GoodsSortTwoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSortTwoMapper {
    int countByExample(GoodsSortTwoExample example);

    int deleteByExample(GoodsSortTwoExample example);

    int deleteByPrimaryKey(Integer goodsSortTwoId);

    int insert(GoodsSortTwo record);

    int insertSelective(GoodsSortTwo record);

    List<GoodsSortTwo> selectByExample(GoodsSortTwoExample example);

    GoodsSortTwo selectByPrimaryKey(Integer goodsSortTwoId);

    int updateByExampleSelective(@Param("record") GoodsSortTwo record, @Param("example") GoodsSortTwoExample example);

    int updateByExample(@Param("record") GoodsSortTwo record, @Param("example") GoodsSortTwoExample example);

    int updateByPrimaryKeySelective(GoodsSortTwo record);

    int updateByPrimaryKey(GoodsSortTwo record);
}