package com.wangwang.shop.utils;

import java.util.ArrayList;
import java.util.List;

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

    public static List copyList(List listOld){
        List list =new ArrayList();
        for (Object obj : listOld){
            list.add(obj);
        }
        return list;
    }
}
