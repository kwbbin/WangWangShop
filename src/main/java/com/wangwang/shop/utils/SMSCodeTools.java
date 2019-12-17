package com.wangwang.shop.utils;

/**
 * 生成短信验证码
 */
public class SMSCodeTools {
    public static String getSMSCode(){
        String str="";
        for (int i = 0 ; i<6 ; i++ ){
            int num = (int)(Math.random()*9+1);
            str+=num;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(getSMSCode());;
    }
}
