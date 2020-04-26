package com.wangwang.shop.bean.region;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class ResponseEntry {
    String ret;
    String msg;
    List<City> data;
}
