package com.wangwang.shop.controller;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.VO.UserVo;
import com.wangwang.shop.service.UserService;
import com.wangwang.shop.utils.MD5Tools;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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
            @ApiImplicitParam(paramType="String", name = "password", value = "密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="String", name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="String", name = "code", value = "验证码", required = true, dataType = "String")
    })
    @ResponseBody
    public ResultBean userRegister(@RequestBody UserVo userVo, HttpServletRequest request){
        if (userVo.getLoginName()==null||userVo.getPassword()==null||userVo.getCode()==null||userVo.getPhone()==null){
         return failed("请检查数据是否填写完整！！");
        }
        if(userService.existLoginName(userVo.getLoginName())){
            return failed("用户已存在！");
        };
        if(userService.existPhone(userVo.getPhone())){
            return failed("该手机号已注册！");
        };

        UserVo user=new UserVo();
        user.setLoginName(userVo.getLoginName());
        user.setPassword(MD5Tools.string2MD5(userVo.getPassword()));
        user.setPhone(userVo.getPhone());
        user.setCode(userVo.getCode());
        if (!userService.insertUser(user)){
            return failed("验证码错误或者过期！");
        };

        request.getSession().setAttribute("user",userService.getUserByLoginName(user.getLoginName()));

        return success("注册成功！");
    }


}
