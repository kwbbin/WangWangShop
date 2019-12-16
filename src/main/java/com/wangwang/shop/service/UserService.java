package com.wangwang.shop.service;

import com.wangwang.shop.bean.User;

public interface UserService {
    User getUser(Long id);

    User getUserByLoginNamePas(String loginName, String password);

    boolean existLoginName(String loginName);

    User getUserByLoginName(String loginName);
}
