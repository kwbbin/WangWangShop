package com.wangwang.shop.controller;


import com.wangwang.shop.bean.ResultBean;

public class BaseController {
    ResultBean resultBean;
    Object data;

    public ResultBean success(String str){
        if (resultBean==null){
            resultBean = new ResultBean();
        }
        resultBean.setCode(0);
        resultBean.setMessage(str);

        return resultBean;
    }

    public ResultBean failed(String str){
        if (resultBean==null){
            resultBean = new ResultBean();
        }
        resultBean.setCode(1);
        resultBean.setMessage(str);

        return resultBean;
    }

    private <T> void setData(T obj){
        data = (T)obj;
    }

}
