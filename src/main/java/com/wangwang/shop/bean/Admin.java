package com.wangwang.shop.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
    @Id
    private Long userMemberId;

    public Long getUserMemberId() {
        return userMemberId;
    }

    public void setUserMemberId(Long userMemberId) {
        this.userMemberId = userMemberId;
    }
}