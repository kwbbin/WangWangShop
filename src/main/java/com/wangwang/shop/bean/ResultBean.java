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
}
