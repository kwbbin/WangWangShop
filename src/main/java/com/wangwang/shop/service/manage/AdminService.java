package com.wangwang.shop.service.manage;

import com.wangwang.shop.bean.Admin;
import com.wangwang.shop.bean.ResultBean;

import javax.servlet.http.HttpServletRequest;

public interface AdminService {
    Admin getAdminById(Integer id);
    ResultBean checkUserNameAndPass(Admin ad, HttpServletRequest request);
    Admin getUserByLoginNamePas(String loginName, String password);
    Admin getAdminByToken(String token);

}
