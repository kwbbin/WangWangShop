package com.wangwang.shop.dao;

import com.wangwang.shop.bean.SMSCode;
import com.wangwang.shop.bean.SMSCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SMSCodeMapper {
    int countByExample(SMSCodeExample example);

    int deleteByExample(SMSCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SMSCode record);

    int insertSelective(SMSCode record);

    List<SMSCode> selectByExample(SMSCodeExample example);

    SMSCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SMSCode record, @Param("example") SMSCodeExample example);

    int updateByExample(@Param("record") SMSCode record, @Param("example") SMSCodeExample example);

    int updateByPrimaryKeySelective(SMSCode record);

    int updateByPrimaryKey(SMSCode record);
}