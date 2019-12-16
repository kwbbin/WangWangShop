package com.wangwang.shop.service.ServiceImpl;


import com.wangwang.shop.bean.User;
import com.wangwang.shop.bean.UserExample;
import com.wangwang.shop.bean.UserLog;
import com.wangwang.shop.bean.UserLogExample;
import com.wangwang.shop.dao.UserLogMapper;
import com.wangwang.shop.dao.UserMapper;
import com.wangwang.shop.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class UserLogServiceImpl implements UserLogService {
    @Autowired
    UserLogMapper userLogMapper;

    @Autowired
    UserMapper userMapper;
    @Override
    public Integer countNumLogin(String loginName) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andLoginNameEqualTo(loginName);
        List<User> li = userMapper.selectByExample(userExample);
        Long id=-1L;
        if (li.size()>0){
            id = li.get(0).getUserId();
        }
        Calendar cal=Calendar.getInstance();
        int y,m,d,h,mi,s;
        y=cal.get(Calendar.YEAR);
        m=cal.get(Calendar.MONTH);
        d=cal.get(Calendar.DATE);
        h=cal.get(Calendar.HOUR_OF_DAY);
        mi=cal.get(Calendar.MINUTE);
        s=cal.get(Calendar.SECOND);

        Date date1=new Date(y-1900,m,d,0,0,0);
        Date date2=new Date(y-1900,m,d+1,0,0,0);
        UserLogExample userLogExample = new UserLogExample();
        userLogExample.createCriteria().andLoginUserEqualTo(id).andLoginDateBetween(date1,date2);
        List<UserLog> list= userLogMapper.selectByExample(userLogExample);

        return list.size();
    }

    @Override
    public void insertUserLog(Long id) {
        UserLog userLog=new UserLog();
        userLog.setLoginDate(new Date());
        userLog.setLoginUser(id);
        userLogMapper.insert(userLog);
    }
}
