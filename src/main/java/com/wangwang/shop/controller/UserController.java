package com.wangwang.shop.controller;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.VO.UserVo;
import com.wangwang.shop.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
@Api(tags="用户相关类",value="用户相关类")
public class UserController extends BaseController {

    @Autowired
    UserService userService;

    @PostMapping("/reginster")
    @ApiOperation(value="注册", notes="注册")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="String", name = "loginName", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="String", name = "password", value = "密码", required = true, dataType = "String")
    })
    public ResultBean userRegister(@RequestParam UserVo userVo){
        if (userVo.getPhone()==null||userVo.getLoginName()==null||userVo.getCode()==null){
         return failed("请检查数据是否填写完整！！");
        }
        if(userService.existLoginName(userVo.getLoginName())){
            return failed("用户已存在！");
        };
        if(userService.existPhone(userVo.getPhone())){
            return failed("该手机号已注册！");
        };


        return null;
    }


}
