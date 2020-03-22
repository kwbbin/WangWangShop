package com.wangwang.shop.dao.manage_dao;

import com.wangwang.shop.bean.ImagesGoodsKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GoodsImageDao  extends JpaRepository<ImagesGoodsKey, Long>, JpaSpecificationExecutor {

}
