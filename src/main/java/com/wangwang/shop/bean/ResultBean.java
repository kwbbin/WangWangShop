package com.wangwang.shop.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class ResultBean<T> implements Serializable {
    Integer code;
    String message;
    String token;
    T data;

    public ResultBean(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultBean(Integer code, String message, String token, T data) {
        this.code = code;
        this.message = message;
        this.token = token;
        this.data = data;
    }

    public ResultBean() {
    }
}
