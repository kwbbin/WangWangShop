package com.wangwang.shop.service.manage;

import com.wangwang.shop.bean.Admin;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.User;

import javax.servlet.http.HttpServletRequest;

public interface AdminService {
    Admin getAdminById(Integer id);
    ResultBean checkUserNameAndPass(User user, HttpServletRequest request);
}
