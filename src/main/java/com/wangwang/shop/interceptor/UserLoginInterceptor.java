package com.wangwang.shop.interceptor;

import com.alibaba.fastjson.JSON;
import com.wangwang.shop.bean.Admin;
import com.wangwang.shop.bean.ResultBean;
import com.wangwang.shop.service.UserService;
import com.wangwang.shop.service.manage.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

@Component
public class UserLoginInterceptor implements HandlerInterceptor {
    @Autowired
    UserService userService;

    @Autowired
    AdminService adminService;

    //这个方法是在访问接口之前执行的，我们只需要在这里写验证登陆状态的业务逻辑，就可以在用户调用指定接口之前验证登陆状态了
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        ResultBean resultBean = new ResultBean();
        //每一个项目对于登陆的实现逻辑都有所区别，我这里使用最简单的Session提取User来验证登陆。
        HttpSession session = request.getSession();
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //这里的User是登陆时放入session的
        Admin admin = (Admin) session.getAttribute("admin");
        String  token = request.getHeader("token");
        //如果session中没有admin，表示没登陆
        if (token==null|| adminService.getAdminByToken(token) == null){
            resultBean.setCode(1);
            resultBean.setMessage("请您先登录");
            //这个方法返回false表示忽略当前请求，如果一个用户调用了需要登陆才能使用的接口，如果他没有登陆这里会直接忽略掉
            //当然你可以利用response给用户返回一些提示信息，告诉他没登陆

//            System.out.println(request.getRequestURL());
            PrintWriter pw = response.getWriter();
            pw.write(JSON.toJSONString(resultBean));
            pw.flush();
            pw.close();
            return false;
        }else{
            return true;
        }
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}