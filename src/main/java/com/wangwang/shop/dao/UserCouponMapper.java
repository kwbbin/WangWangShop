package com.wangwang.shop.dao;

import com.wangwang.shop.bean.UserCouponExample;
import com.wangwang.shop.bean.UserCouponKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCouponMapper {
    int countByExample(UserCouponExample example);

    int deleteByExample(UserCouponExample example);

    int deleteByPrimaryKey(UserCouponKey key);

    int insert(UserCouponKey record);

    int insertSelective(UserCouponKey record);

    List<UserCouponKey> selectByExample(UserCouponExample example);

    int updateByExampleSelective(@Param("record") UserCouponKey record, @Param("example") UserCouponExample example);

    int updateByExample(@Param("record") UserCouponKey record, @Param("example") UserCouponExample example);
}