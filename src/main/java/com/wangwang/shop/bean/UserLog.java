package com.wangwang.shop.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user_log")
public class UserLog {
    private Long id;

    private Date loginDate;

    private Long loginUser;

    private String token;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }
}