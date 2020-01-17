package com.wangwang.shop.service.manage.manageImpl;

import com.wangwang.shop.bean.Admin;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.dao.default_dao.UserDao;
import com.wangwang.shop.dao.manage_dao.AdminDao;
import com.wangwang.shop.service.UserService;
import com.wangwang.shop.service.manage.AdminService;
import com.wangwang.shop.utils.MD5Tools;
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
    public ResultBean checkUserNameAndPass(Admin ad, HttpServletRequest request) {
        ResultBean resultBean = new ResultBean();
        String token  = request.getSession().getId();
        if (StringUtils.trim(ad.getLoginName()) == null || StringUtils.trim(ad.getPassword()) == null){
            resultBean.setCode(1);
            resultBean.setMessage("请完整填写用户名和密码");
            return resultBean;
        }

        Admin admin = getUserByLoginNamePas(StringUtils.trim(ad.getLoginName()),StringUtils.trim(ad.getPassword()));
        if (admin == null){
            resultBean.setCode(1);
            resultBean.setMessage("用户名或密码错误");
            return resultBean;
        }

        resultBean.setCode(0);
        resultBean.setMessage("登录成功");
        resultBean.setData(admin);
        resultBean.setToken(token);
        admin.setToken(token);
        request.getSession().setAttribute("admin",admin);
//        System.out.println("adminSession======"+request.getSession().getAttribute("admin")+"sessionId"+request.getSession().getId());
        adminDao.save(admin);

        return resultBean;
    }

    @Override
    public Admin getUserByLoginNamePas(String loginName, String password) {
        password = MD5Tools.string2MD5(password);
        Admin admin = adminDao.getAdminByLoginNameAndPassword(loginName,password);
        return admin;
    }

    @Override
    public Admin getAdminByToken(String token) {
        Admin admin = adminDao.getAdminByToken(token);
        return admin;
    }
}
