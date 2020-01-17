package com.wangwang.shop.dao.manage_dao;

import com.wangwang.shop.bean.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdminDao extends JpaRepository<Admin, Integer>, JpaSpecificationExecutor {
    Admin getAdminByAdminId(Integer id);
    Admin getAdminByUserId(Long id);
    Admin getAdminByLoginNameAndPassword(String loginName, String password);
    Admin getAdminByToken(String token);
}
