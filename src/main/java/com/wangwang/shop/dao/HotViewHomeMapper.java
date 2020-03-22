package com.wangwang.shop.dao;

import com.wangwang.shop.bean.HotViewHome;
import com.wangwang.shop.bean.HotViewHomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotViewHomeMapper {
    int countByExample(HotViewHomeExample example);

    int deleteByExample(HotViewHomeExample example);

    int insert(HotViewHome record);

    int insertSelective(HotViewHome record);

    List<HotViewHome> selectByExample(HotViewHomeExample example);

    int updateByExampleSelective(@Param("record") HotViewHome record, @Param("example") HotViewHomeExample example);

    int updateByExample(@Param("record") HotViewHome record, @Param("example") HotViewHomeExample example);
}