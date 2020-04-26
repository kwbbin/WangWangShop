package com.wangwang.shop.bean.VO;

import com.wangwang.shop.bean.Notice;

public class NoticeVo extends Notice {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NoticeVo{" +
                "name='" + name + '\'' +
                '}';
    }
}
