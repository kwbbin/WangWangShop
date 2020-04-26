package com.wangwang.shop.controller.manage;

import com.wangwang.shop.bean.Notice;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.VO.NoticeVo;
import com.wangwang.shop.service.manage.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class NoticeController {
    @Autowired
    NoticeService noticeService;

    @RequestMapping("/saveNotice")
    public ResultBean<String> saveNotice(@RequestBody Notice notice, HttpServletRequest request){
        return noticeService.saveNotice(notice,request);
    }

    @RequestMapping("/getNotLookNitice")
    public ResultBean<List<Notice>> getNotLookNitice(){
        return noticeService.getNotLookNitice();
    }

    @RequestMapping("/getAllNitice")
    public ResultBean<List<NoticeVo>> getAllNitice(){
        return noticeService.getAllNitice();
    }

    @RequestMapping("/setNoticeState")
    public void setState(@RequestBody Notice notice){
        noticeService.setState(notice);
    }

}
