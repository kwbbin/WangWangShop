package com.wangwang.shop.dao.default_dao;

import com.wangwang.shop.bean.GoodsSortTwo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GoodsSortTwoDao  extends JpaRepository<GoodsSortTwo, Integer>, JpaSpecificationExecutor {
    GoodsSortTwo findByGoodsSortTwoId(Integer id);
}
