package com.wangwang.shop.dao.manage_dao;

import com.wangwang.shop.bean.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GoodsManageDao extends JpaRepository<Goods, Long>, JpaSpecificationExecutor {
}
