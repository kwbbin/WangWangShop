package com.wangwang.shop.service;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.User;
import com.wangwang.shop.bean.VO.UserVo;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    User getUser(Long id);

    User getUserByLoginNamePas(String loginName, String password);

    boolean existLoginName(String loginName);

    boolean existPhone(String phone);

    User getUserByLoginName(String loginName);

    boolean insertUser(User user);

    void updateUser(User user);

    boolean insertUser(UserVo user);

    ResultBean userLogin(User u, HttpServletRequest request);

    void updateUserToken(Long id, String token);

    User getUserByToken(String token);

    ResultBean loginOut(HttpServletRequest request);
}
