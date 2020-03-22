package com.wangwang.shop.dao;

import com.wangwang.shop.bean.ViewHome;
import com.wangwang.shop.bean.ViewHomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewHomeMapper {
    int countByExample(ViewHomeExample example);

    int deleteByExample(ViewHomeExample example);

    int insert(ViewHome record);

    int insertSelective(ViewHome record);

    List<ViewHome> selectByExample(ViewHomeExample example);

    int updateByExampleSelective(@Param("record") ViewHome record, @Param("example") ViewHomeExample example);

    int updateByExample(@Param("record") ViewHome record, @Param("example") ViewHomeExample example);
}