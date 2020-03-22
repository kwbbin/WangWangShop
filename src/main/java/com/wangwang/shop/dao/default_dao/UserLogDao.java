package com.wangwang.shop.dao.default_dao;

import com.wangwang.shop.bean.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserLogDao extends JpaRepository<UserLog, Long>, JpaSpecificationExecutor {
}
