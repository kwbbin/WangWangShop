package com.wangwang.shop.dao;

import com.wangwang.shop.bean.ViewSort;
import com.wangwang.shop.bean.ViewSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewSortMapper {
    int countByExample(ViewSortExample example);

    int deleteByExample(ViewSortExample example);

    int deleteByPrimaryKey(Integer goodsSortOne);

    int insert(ViewSort record);

    int insertSelective(ViewSort record);

    List<ViewSort> selectByExample(ViewSortExample example);

    ViewSort selectByPrimaryKey(Integer goodsSortOne);

    int updateByExampleSelective(@Param("record") ViewSort record, @Param("example") ViewSortExample example);

    int updateByExample(@Param("record") ViewSort record, @Param("example") ViewSortExample example);

    int updateByPrimaryKeySelective(ViewSort record);

    int updateByPrimaryKey(ViewSort record);
}