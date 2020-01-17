package com.wangwang.shop.controller.manage;

import com.wangwang.shop.bean.Admin;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.service.manage.AdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/manage")
@Api(tags="登录类",value="登录类")
public class LoginManageController {
    @Autowired
    AdminService adminService;

    @RequestMapping("login")
    public ResultBean loginByUserNamePassword(@RequestBody Admin admin, HttpServletRequest request){
        return adminService.checkUserNameAndPass(admin,request);
    }

    @RequestMapping("/test")
    public Admin test(){
        return adminService.getAdminById(1);
    }
}
