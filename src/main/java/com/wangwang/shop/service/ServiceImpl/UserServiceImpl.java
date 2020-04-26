package com.wangwang.shop.service.ServiceImpl;

import com.wangwang.shop.bean.*;
import com.wangwang.shop.bean.VO.UserPasswordVo;
import com.wangwang.shop.bean.VO.UserVo;
import com.wangwang.shop.dao.SMSCodeMapper;
import com.wangwang.shop.dao.UserMapper;
import com.wangwang.shop.dao.UserPositionMapper;
import com.wangwang.shop.dao.default_dao.UserDao;
import com.wangwang.shop.service.UserLogService;
import com.wangwang.shop.service.UserService;
import com.wangwang.shop.utils.MD5Tools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    UserMapper userMapper;

    @Autowired
    SMSCodeMapper smsCodeMapper;

    @Autowired
    UserDao userDao;

    @Autowired
    UserService userService;
    @Autowired
    UserLogService userLogService;

    @Autowired
    UserPositionMapper userPositionMapper;



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

    public ResultBean<String> userLogin(User u, HttpServletRequest request){
        String token  = request.getSession().getId();
        ResultBean resultBean = new ResultBean();
        String loginName = u.getLoginName();
        String password = u.getPassword();
        if (loginName==null||password==null){
            resultBean.setCode(1);
            resultBean.setMessage("请检查参数");
            return resultBean;
        }
        User user=null;
        int num=userLogService.countNumLogin(loginName);
        if(num<=4){
            if(userService.existLoginName(loginName)){
                user=userService.getUserByLoginNamePas(loginName,password);
                if (user==null){
                    if (num<5){
                        Long id = userService.getUserByLoginName(loginName).getUserId();
                        userLogService.insertUserLog(id);
                        resultBean.setCode(1);
                        resultBean.setMessage("密码错误，您今天还有"+(5-num-1)+"次机会");
                        return resultBean;
                    }else{
                        resultBean.setCode(1);
                        resultBean.setMessage("登录密码错误到达五次，请明天再试！");
                        return resultBean;
                    }
                }

            }else{
                resultBean.setCode(1);
                resultBean.setMessage("用户不存在！");
                return resultBean;
            }
        }else{
            resultBean.setCode(1);
            resultBean.setMessage("登录密码错误到达五次，请明天再试！");
            return resultBean;
        }
        UserLog userLog = new UserLog();
        userLog.setLoginDate(new Date());
        userLog.setLoginUser(user.getUserId());
        userLog.setToken(token);
        userLogService.insertUserLog(userLog);
        userService.updateUserToken(user.getUserId(),token);
        logger.info("登录成功");
        resultBean.setCode(0);
        resultBean.setMessage("登录成功！");
        resultBean.setData(token);
        return resultBean;
    }

    public void updateUserToken(Long id, String token){
        User user = userService.getUser(id);
        user.setToken(token);
        userDao.save(user);
    }

    @Override
    public User getUserByToken(String token) {
        return userDao.findUserByToken(token);
    }

    @Override
    public ResultBean loginOut(HttpServletRequest request) {
        ResultBean resultBean = new ResultBean();
        User user = userService.getUserByToken(request.getHeader("token"));
        user.setToken(null);
        userDao.save(user);
        resultBean.setCode(0);
        resultBean.setMessage("注销成功");
        logger.info("注销");
        return resultBean;
    }

    @Override
    public ResultBean<List<UserPosition>> getUserPositionByiUid(Long id) {
        UserPositionExample userPositionExample = new UserPositionExample();
        userPositionExample.createCriteria().andUidEqualTo(id);
        List<UserPosition> list =userPositionMapper.selectByExample(userPositionExample);
        ResultBean resultBean = new ResultBean(0,"success",list);
        return resultBean;
    }

    public ResultBean<User>  getUserInfo(HttpServletRequest request){
        String token = request.getHeader("token");
        User user = getUserByToken(token);
        user.setPassword(null);

        return new ResultBean<>(0,"success",user);
    }

    @Override
    public ResultBean<String> updateUserInfo(User user,HttpServletRequest request) {
        try {
            String token = request.getHeader("token");
            User u = userService.getUserByToken(token);
            user.setUserId(u.getUserId());
            userMapper.updateByPrimaryKeySelective(user );
        }catch (Exception e){
            return new ResultBean<>(1,"faild","修改失败");
        }

        return new ResultBean<>(0,"success","成功");
    }

    @Override
    public ResultBean<String> updateUserPassword(UserPasswordVo upv, HttpServletRequest request) {
        String token = request.getHeader("token");
        String userLoginName = getUserByToken(token).getLoginName();
        if(upv.getNewPass()==null||upv.getOldPass()==null||upv.getNewPassAgain()==null){
            return new ResultBean<>(1,"faile","数据不完整");
        }

        if(!upv.getNewPassAgain().equals(upv.getNewPass())){
            return new ResultBean<>(1,"faile","两次输入密码不一致");
        }else if(upv.getNewPassAgain().equals(upv.getOldPass())){
            return new ResultBean<>(1,"faile","新旧密码不能一样");
        }else{
            String newPassword = MD5Tools.string2MD5(upv.getNewPass());
            User user = getUserByLoginNamePas(userLoginName,upv.getOldPass());
            System.out.println(upv.getOldPass());
            System.out.println(user);
            if (user!=null){
                User u = new User();
                u.setUserId(user.getUserId());
                u.setPassword(newPassword);
                userMapper.updateByPrimaryKeySelective(u);
                return new ResultBean<>(0,"success","修改成功");
            }else {
                return new ResultBean<>(1,"faile","密码错误");
            }
        }
    }

    @Override
    public ResultBean<String> addUserPosition(UserPosition userPosition,HttpServletRequest request) {
        try {
            String token = request.getHeader("token");
            User user = userService.getUserByToken(token);
            userPosition.setUid(user.getUserId());
            userPositionMapper.insert(userPosition);
        }catch (Exception e){
            return new ResultBean<>(1,"faile ","保存失败");
        }
        return  new ResultBean<>(0,"success ","保存成功");
    }

    @Override
    public ResultBean<List<UserPosition>> selectUserPosition(HttpServletRequest request) {
        List<UserPosition> list=null;
        try {
            String token = request.getHeader("token");
            User user = userService.getUserByToken(token);
            list = userPositionMapper.selectByExample(new UserPositionExample());
        }catch (Exception e){
            return new ResultBean<>(1,"faile ",null);
        }
        return  new ResultBean<>(0,"success ",list);
    }

    @Override
    public ResultBean<String> deleteUserPositionById(Long id) {
        userPositionMapper.deleteByPrimaryKey(id);
        return new ResultBean<>(0,"success","删除成功");

    }


}
