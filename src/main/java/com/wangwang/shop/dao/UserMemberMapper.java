package com.wangwang.shop.dao;

import com.wangwang.shop.bean.UserMember;
import com.wangwang.shop.bean.UserMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMemberMapper {
    int countByExample(UserMemberExample example);

    int deleteByExample(UserMemberExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserMember record);

    int insertSelective(UserMember record);

    List<UserMember> selectByExample(UserMemberExample example);

    int updateByExampleSelective(@Param("record") UserMember record, @Param("example") UserMemberExample example);

    int updateByExample(@Param("record") UserMember record, @Param("example") UserMemberExample example);
}