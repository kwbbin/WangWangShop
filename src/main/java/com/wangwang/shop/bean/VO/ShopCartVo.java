package com.wangwang.shop.bean.VO;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ShopCartVo {
    Long goodsId;
    Long uid;
    int goodsNum;
}
