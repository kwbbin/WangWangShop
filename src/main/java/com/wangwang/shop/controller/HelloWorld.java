package com.wangwang.shop.controller;

import com.wangwang.shop.bean.Ad;
import com.wangwang.shop.bean.AdExample;
import com.wangwang.shop.dao.AdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {

    @Autowired
    AdMapper adMapper;

    @RequestMapping("/hello")
    public List<Ad> helloWorld(){
        AdExample adExample = new AdExample();
        adExample.createCriteria().andAdIdEqualTo(1);
        List<Ad> list = adMapper.selectByExample(adExample);
        return list;
    }
}
