package com.wangwang.shop.service.manage.manageImpl;

import com.wangwang.shop.bean.Admin;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.bean.User;
import com.wangwang.shop.dao.default_dao.UserDao;
import com.wangwang.shop.dao.manage_dao.AdminDao;
import com.wangwang.shop.service.UserService;
import com.wangwang.shop.service.manage.AdminService;
import com.wangwang.shop.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;

    @Autowired
    UserService userService;

    @Autowired
    UserDao userDao;

    @Override
    public Admin getAdminById(Integer id) {
        return adminDao.getAdminByAdminId(id);
    }

    @Override
    public ResultBean checkUserNameAndPass(User user, HttpServletRequest request) {
        ResultBean resultBean = new ResultBean();
        String token  = request.getSession().getId();
        if (StringUtils.trim(user.getLoginName()) == null || StringUtils.trim(user.getPassword()) == null){
            resultBean.setCode(1);
            resultBean.setMessage("请完整填写用户名和密码");
            return resultBean;
        }

        User u = userService.getUserByLoginNamePas(StringUtils.trim(user.getLoginName()),StringUtils.trim(user.getPassword()));
        if (u == null){
            resultBean.setCode(1);
            resultBean.setMessage("用户名或密码错误");
            return resultBean;
        }
        Admin admin = adminDao.getAdminByUserId(u.getUserId());
        if (admin == null){
            resultBean.setCode(1);
            resultBean.setMessage("你不是管理员，请退出");
            return resultBean;
        }

        resultBean.setCode(0);
        resultBean.setMessage("登录成功");
        resultBean.setData(admin);
        resultBean.setToken(token);
        request.getSession().setAttribute("admin",admin);
        u.setToken(token);
        userDao.save(u);

        return resultBean;
    }
}
