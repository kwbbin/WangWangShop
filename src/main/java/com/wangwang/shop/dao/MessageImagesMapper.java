package com.wangwang.shop.dao;

import com.wangwang.shop.bean.MessageImages;
import com.wangwang.shop.bean.MessageImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageImagesMapper {
    int countByExample(MessageImagesExample example);

    int deleteByExample(MessageImagesExample example);

    int deleteByPrimaryKey(Long imageId);

    int insert(MessageImages record);

    int insertSelective(MessageImages record);

    List<MessageImages> selectByExample(MessageImagesExample example);

    MessageImages selectByPrimaryKey(Long imageId);

    int updateByExampleSelective(@Param("record") MessageImages record, @Param("example") MessageImagesExample example);

    int updateByExample(@Param("record") MessageImages record, @Param("example") MessageImagesExample example);

    int updateByPrimaryKeySelective(MessageImages record);

    int updateByPrimaryKey(MessageImages record);
}