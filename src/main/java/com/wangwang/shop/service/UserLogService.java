package com.wangwang.shop.service;

public interface UserLogService {
    Integer countNumLogin(String loginName);
    void insertUserLog(Long id);
}
