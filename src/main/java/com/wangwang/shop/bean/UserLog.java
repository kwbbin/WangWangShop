package com.wangwang.shop.bean;

import java.util.Date;

public class UserLog {
    private Long id;

    private Date loginDate;

    private Long loginUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Long getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(Long loginUser) {
        this.loginUser = loginUser;
    }
}