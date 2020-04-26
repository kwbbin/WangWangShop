package com.wangwang.shop.controller;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.User;
import com.wangwang.shop.bean.UserPosition;
import com.wangwang.shop.bean.VO.UserPasswordVo;
import com.wangwang.shop.bean.VO.UserVo;
import com.wangwang.shop.bean.region.City;
import com.wangwang.shop.service.RegionService;
import com.wangwang.shop.service.UserService;
import com.wangwang.shop.utils.MD5Tools;
import com.wangwang.shop.utils.StringUtils;
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
import java.util.List;

@Controller
@RequestMapping("/user")
@Api(tags="用户相关类",value="用户相关类")
public class UserController extends BaseController {

    @Autowired
    UserService userService;

    @Autowired
    RegionService regionService;

    @PostMapping("/reginster")
    @ApiOperation(value="注册", notes="注册")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="String", name = "loginName", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="String", name = "password", value = "密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="String", name = "phone", value = "手机号", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="String", name = "email", value = "邮箱", required = true, dataType = "String"),
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
        if (StringUtils.trim(user.getEmail()) != null){
            user.setEmail(userVo.getEmail());
        }
        user.setCode(userVo.getCode());
        if (!userService.insertUser(user)){
            return failed("验证码错误或者过期！");
        };

        request.getSession().setAttribute("user",userService.getUserByLoginName(user.getLoginName()));

        return success("注册成功！请登录");
    }

    @RequestMapping("/getProvince")
    @ResponseBody
    public ResultBean<List<City>> getProvince(){
        return regionService.getProvince();
    }

    @RequestMapping("/getCityById")
    @ResponseBody
    public ResultBean<List<City>> getCityById(@RequestBody String id){
        return regionService.getCitysByFather(id);
    }



    @RequestMapping("/getUserPositionByiUid")
    @ResponseBody
    public ResultBean<List<UserPosition>> getUserPositionByiUid(@RequestBody Long id){
        return null;
    }


    @RequestMapping("/getUserInfo")
    @ResponseBody
    public ResultBean<User>  getUserInfo(HttpServletRequest request){
        return userService.getUserInfo(request);
    }

    @RequestMapping("/updateUserInfo")
    @ResponseBody
    public ResultBean<String> updateUserInfo(@RequestBody User user,HttpServletRequest request){
        return userService.updateUserInfo(user,request);
    }


    @RequestMapping("/updateUserPass")
    @ResponseBody
    public ResultBean<String> updateUserPass(@RequestBody UserPasswordVo upv, HttpServletRequest request){
        return userService.updateUserPassword(upv,request);
    }

    @RequestMapping("/addUserPosition")
    @ResponseBody
    public ResultBean<String> addUserPosition(@RequestBody UserPosition userPosition,HttpServletRequest request){
        return userService.addUserPosition(userPosition,request);
    }

    @RequestMapping("/selectUserPosition")
    @ResponseBody
    public ResultBean<List<UserPosition>> selectUserPosition(HttpServletRequest request){
        return userService.selectUserPosition(request);
    }

    @RequestMapping("/deleteUserPositionById")
    @ResponseBody
    public ResultBean<String> deleteUserPositionById(@RequestBody UserPosition userPosition){
        return userService.deleteUserPositionById(userPosition.getId());
    }

}
