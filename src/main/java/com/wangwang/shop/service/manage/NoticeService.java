package com.wangwang.shop.service.manage;

import com.wangwang.shop.bean.Notice;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.VO.NoticeVo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface NoticeService {

    ResultBean<String> saveNotice(Notice notice, HttpServletRequest request);

    ResultBean<List<Notice>> getNotLookNitice();

    ResultBean<List<NoticeVo>> getAllNitice();

    void setState(Notice notice);
}
