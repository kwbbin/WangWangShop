package com.wangwang.shop.bean.VO;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class OrdersVo {
    private Long orderId;

    private Date createDate;

    private String name;

    private String goodsDesc;

    private Integer count;

    private Double price;

    private Double totalPrice;

    private Integer goodsNum;

    private Long goodsId;

    private Long userId;

    private String imageUrl;

    private Integer status;

    private Integer num;

}
