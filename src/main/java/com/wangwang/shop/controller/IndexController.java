package com.wangwang.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/home")
public class IndexController {

    @RequestMapping("/Category")
    public void getCategory(){

    }
}
