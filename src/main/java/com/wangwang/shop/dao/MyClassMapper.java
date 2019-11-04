package com.wangwang.shop.dao;

import com.wangwang.shop.bean.MyClass;
import com.wangwang.shop.bean.MyClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyClassMapper {
    int countByExample(MyClassExample example);

    int deleteByExample(MyClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MyClass record);

    int insertSelective(MyClass record);

    List<MyClass> selectByExample(MyClassExample example);

    MyClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MyClass record, @Param("example") MyClassExample example);

    int updateByExample(@Param("record") MyClass record, @Param("example") MyClassExample example);

    int updateByPrimaryKeySelective(MyClass record);

    int updateByPrimaryKey(MyClass record);
}