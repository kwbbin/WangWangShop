package com.wangwang.shop.service;

import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.User;
import com.wangwang.shop.bean.UserPosition;
import com.wangwang.shop.bean.VO.UserPasswordVo;
import com.wangwang.shop.bean.VO.UserVo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    ResultBean<List<UserPosition>> getUserPositionByiUid(Long id);

    ResultBean<User> getUserInfo(HttpServletRequest request);
    ResultBean<String> updateUserInfo(User user,HttpServletRequest request);

    ResultBean<String> updateUserPassword(UserPasswordVo upv, HttpServletRequest request);

    ResultBean<String> addUserPosition(UserPosition userPosition,HttpServletRequest request);

    ResultBean<List<UserPosition>> selectUserPosition(HttpServletRequest request);

    ResultBean<String> deleteUserPositionById(Long id);


}
