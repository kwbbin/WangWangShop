package com.wangwang.shop.utils;

public class StringUtils {
    public static String trim(String str){
        if (str == null)
            return str;
        else if (str.trim() == ""){
            str=null;
            return str;
        }
        return str.trim();
    };
}
