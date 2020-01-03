package com.wangwang.shop.service.manage.manageImpl;

import com.wangwang.shop.bean.Admin;
import com.wangwang.shop.dao.manage_dao.AdminDao;
import com.wangwang.shop.service.manage.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;


    @Override
    public Admin getAdminById(Long id) {
        return adminDao.getAdminByUserMemberId(id);
    }
}
