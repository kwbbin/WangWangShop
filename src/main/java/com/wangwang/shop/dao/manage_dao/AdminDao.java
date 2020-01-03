package com.wangwang.shop.dao.manage_dao;

import com.wangwang.shop.bean.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdminDao extends JpaRepository<Admin, Long>, JpaSpecificationExecutor {
    public Admin getAdminByUserMemberId(Long id);
}
