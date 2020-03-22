package com.wangwang.shop.controller;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.User;
import com.wangwang.shop.service.UserLogService;
import com.wangwang.shop.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
@Api(tags="登录类",value="登录类")
public class LoginController extends BaseController {

    @Autowired
    UserService userService;
    @Autowired
    UserLogService userLogService;





    @PostMapping("/getUser")
    public User getStudent(@RequestParam Long id){
        return userService.getUser(id);
    }

    @PostMapping("/login")
    @ApiOperation(value="通过用户名密码登录", notes="正确匹配才能登录")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="String", name = "loginName", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="String", name = "password", value = "密码", required = true, dataType = "String")
    })
    public ResultBean login(@RequestBody User u, HttpServletRequest request){
        return userService.userLogin(u,request);
    }

    @PostMapping("/loginOut")
    public ResultBean loginOut(HttpServletRequest request){
        return userService.loginOut(request);
    }


    @PostMapping("/getLoginUser")
    public ResultBean<User> getClientUser(HttpServletRequest request){
        ResultBean<User> resultBean = new ResultBean<>();
        User user = userService.getUserByToken(request.getHeader("token"));
        System.out.println("user "+user);
        String token = request.getHeader("token");
        if(token != null && token != ""){
            resultBean.setData(user);
            resultBean.setMessage("获取成功");
            resultBean.setCode(0);
        }
        else{
            resultBean.setMessage("获取失败");
            resultBean.setCode(1);
        }
        return resultBean;
    }



}
