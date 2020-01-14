package com.wangwang.shop.dao.default_dao;

import com.wangwang.shop.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao  extends JpaRepository<User, Integer>, JpaSpecificationExecutor {
}
