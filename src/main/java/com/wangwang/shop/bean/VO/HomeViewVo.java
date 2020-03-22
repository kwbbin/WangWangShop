package com.wangwang.shop.bean.VO;

import com.wangwang.shop.bean.HotViewHome;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class HomeViewVo {
    Integer num;
    String name;
    List<HotViewHome> list;
}

