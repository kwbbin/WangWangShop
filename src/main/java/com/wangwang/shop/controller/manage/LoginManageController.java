package com.wangwang.shop.controller.manage;

import com.wangwang.shop.bean.Admin;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.service.manage.AdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manage")
@Api(tags="登录类",value="登录类")
public class LoginManageController {
    @Autowired
    AdminService adminService;

    @RequestMapping("login")
    public ResultBean loginByUserNamePassword(){
        return null;
    }

    @RequestMapping("/test")
    public Admin test(){
        return adminService.getAdminById(9L);
    }
}
