package com.wangwang.shop.bean.region;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class City {
    String pinyin;
    String lng;
    Integer level;
    String parentId;
    String areaCode;
    String name;
    String mergerName;
    String cityCode;
    String ShortName;
    String id;
    String zipCode;
    String lat;
}
