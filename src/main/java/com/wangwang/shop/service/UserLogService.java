package com.wangwang.shop.service;

import com.wangwang.shop.bean.UserLog;

public interface UserLogService {
    Integer countNumLogin(String loginName);
    void insertUserLog(Long id);
    void insertUserLog(UserLog userLog);
}
