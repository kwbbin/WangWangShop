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
        String loginName = u.getLoginName();
        String password = u.getPassword();
        if (loginName==null||password==null){
            return failed("请检查参数");
        }
        User user=null;
        int num=userLogService.countNumLogin(loginName);
        if(num<=4){
            if(userService.existLoginName(loginName)){
                user=userService.getUserByLoginNamePas(loginName,password);
                if (user==null){
                    if (num<5){
                        Long id = userService.getUserByLoginName(loginName).getUserId();
                        userLogService.insertUserLog(id);
                        return failed("密码错误，您今天还有"+(5-num-1)+"次机会");
                    }else{
                        return failed("登录密码错误到达五次，请明天再试！");
                    }
                }

            }else{
                return failed("用户不存在！");
            }
        }else{
            return failed("登录密码错误到达五次，请明天再试！");
        }

        request.getSession().setAttribute("user",user);

        return success("登录成功");
    }
}
