package com.wangwang.shop.service;

import com.wangwang.shop.bean.User;
import com.wangwang.shop.bean.VO.UserVo;

public interface UserService {
    User getUser(Long id);

    User getUserByLoginNamePas(String loginName, String password);

    boolean existLoginName(String loginName);

    boolean existPhone(String phone);

    User getUserByLoginName(String loginName);

    boolean insertUser(User user);

    boolean insertUser(UserVo user);
}
