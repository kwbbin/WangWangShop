package com.wangwang.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @description:配置访问外部文件
 * @author: Administrator
 * @date: 2019-07-10 16:17
 */
 
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
 
    @Value("${cbs.filePath}")
    private String filePath;//文件地址
 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("文件路径=="+filePath);
        registry.addResourceHandler("/appFile/**").addResourceLocations(filePath);
        super.addResourceHandlers(registry);
    }
 
}