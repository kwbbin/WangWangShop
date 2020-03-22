package com.wangwang.shop.dao.default_dao;

import com.wangwang.shop.bean.GoodsSortOneTwo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface GoodsSortOneTwoDao  extends JpaRepository<GoodsSortOneTwo, Integer>, JpaSpecificationExecutor {
    List<GoodsSortOneTwo> getAllByGoodsSortOneId(Integer id);
}
