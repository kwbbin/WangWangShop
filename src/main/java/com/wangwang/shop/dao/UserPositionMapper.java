package com.wangwang.shop.dao;

import com.wangwang.shop.bean.UserPosition;
import com.wangwang.shop.bean.UserPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPositionMapper {
    int countByExample(UserPositionExample example);

    int deleteByExample(UserPositionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPosition record);

    int insertSelective(UserPosition record);

    List<UserPosition> selectByExample(UserPositionExample example);

    UserPosition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserPosition record, @Param("example") UserPositionExample example);

    int updateByExample(@Param("record") UserPosition record, @Param("example") UserPositionExample example);

    int updateByPrimaryKeySelective(UserPosition record);

    int updateByPrimaryKey(UserPosition record);
}