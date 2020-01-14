package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.SMSCode;
import com.wangwang.shop.bean.SMSCodeExample;
import com.wangwang.shop.bean.User;
import com.wangwang.shop.bean.UserExample;
import com.wangwang.shop.bean.VO.UserVo;
import com.wangwang.shop.dao.SMSCodeMapper;
import com.wangwang.shop.dao.UserMapper;
import com.wangwang.shop.dao.default_dao.UserDao;
import com.wangwang.shop.service.UserService;
import com.wangwang.shop.utils.MD5Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    SMSCodeMapper smsCodeMapper;

    @Autowired
    UserDao userDao;

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
    public boolean existPhone(String phone) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneEqualTo(phone);
        List list = userMapper.selectByExample(userExample);
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

    @Override
    public boolean insertUser(User user) {
        return true;
    }

    public void updateUser(User user){
        userDao.save(user);
    }

    @Override
    public boolean insertUser(UserVo user) {
        SMSCodeExample smsCodeExample = new SMSCodeExample();
        smsCodeExample.createCriteria().andPhoneEqualTo(user.getPhone());
        List<SMSCode> list = smsCodeMapper.selectByExample(smsCodeExample);
        SMSCode smsCode = null;
        if (list.size()>0){
            smsCode = list.get(0);
            Date date1 = smsCode.getDate();
            Date date2 = new Date(date1.getTime()+5*60*1000);
            Date date3 = new Date();
            //判断验证码是否过期
            if (date3.after(date2)||!user.getCode().equals(smsCode.getCode()))
                return false;
        }

        if (smsCode!=null){
            user.setRegisterdate(new Date());
            userMapper.insert(user);
        }else{
            return false;
        }
        return true;
    }
}
