package com.wangwang.shop.config;

import com.wangwang.shop.interceptor.UserLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {


  @Autowired
  UserLoginInterceptor userLoginInterceptor;
 
  // 这个方法是用来配置静态资源的，比如html，js，css，等等
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {

  }
 
  // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
//     addPathPatterns("/**") 表示拦截所有的请求，
    // excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
//    registry.addInterceptor(adminCookieReadInterceptor).addPathPatterns("/manage/**");//.excludePathPatterns("/manage/", "/manage")
    registry.addInterceptor(userLoginInterceptor).addPathPatterns("/**").excludePathPatterns("/user/**","/manage/login","**/swagger-ui.html","/error")
            .excludePathPatterns("/swagger-ui.html")
            .excludePathPatterns("/configuration/ui")
            .excludePathPatterns("/swagger-resources")
            .excludePathPatterns("/configuration/security")
            .excludePathPatterns("/v2/api-docs")
            .excludePathPatterns("/error")
            .excludePathPatterns("/webjars/**")
            .excludePathPatterns("/**/favicon.ico");
  }
}