package com.wangwang.shop.controller;

import com.wangwang.shop.bean.Ad;
import com.wangwang.shop.service.AdService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    AdService adService;

    @PostMapping("/login")
    @ApiOperation(value="测试类", notes="测试类")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="String", name = "loginName", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="String", name = "password", value = "密码", required = true, dataType = "String")
    })
    @RequestMapping("/hello")
    public Ad helloWorld(){
        return adService.selectAds(1);
    }
}
