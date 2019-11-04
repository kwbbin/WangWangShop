package com.wangwang.shop.controller;

import com.wangwang.shop.bean.Student;
import com.wangwang.shop.bean.StudentExample;
import com.wangwang.shop.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {

    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/hello")
    public List<Student> helloWorld(){
        StudentExample example=new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        List<Student> list=studentMapper.selectByExample(example);

        return list;
    }
}
