package com.wangwang.shop.dao.default_dao;

import com.wangwang.shop.bean.GoodsSortOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GoodsSortOneDao extends JpaRepository<GoodsSortOne, Integer>, JpaSpecificationExecutor {

}
