package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.User;
import com.wangwang.shop.bean.UserExample;
import com.wangwang.shop.dao.UserMapper;
import com.wangwang.shop.service.UserService;
import com.wangwang.shop.utils.MD5Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(Long id){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserIdEqualTo(id);
        List<User> list = userMapper.selectByExample(userExample);
        return list.get(0);
    }

    @Override
    public User getUserByLoginNamePas(String loginName, String password) {
        String str= MD5Tools.string2MD5(password);
        UserExample userExample=new UserExample();
        userExample.createCriteria().andLoginNameEqualTo(loginName).andPasswordEqualTo(str);
        List<User> list = userMapper.selectByExample(userExample);
        if (list.size()>0){
            return list.get(0);
        }else {
            return null;
        }
    }

    @Override
    public boolean existLoginName(String loginName) {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andLoginNameEqualTo(loginName);
        List<User> list = userMapper.selectByExample(userExample);

        if (list.size()>0){
            return true;
        }
        return false;
    }

    @Override
    public User getUserByLoginName(String loginName) {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andLoginNameEqualTo(loginName);
        List<User> list = userMapper.selectByExample(userExample);

        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
