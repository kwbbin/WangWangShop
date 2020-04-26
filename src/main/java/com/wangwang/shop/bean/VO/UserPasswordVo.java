package com.wangwang.shop.bean.VO;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserPasswordVo {
    String newPass;
    String oldPass;
    String newPassAgain;


}
