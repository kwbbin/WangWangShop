package com.wangwang.shop.bean.VO;

import com.wangwang.shop.bean.GoodsImages;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@ToString
@Data
public class GoodsImagesVo {
    private Long goodsId;

    private String goodsNumber;

    private String name;

    private Integer goodsSortId;

    private Integer collected;

    private Integer goodsStock;

    private Integer isSale;

    private Integer isHot;

    private Integer isNew;

    private String goodsDesc;

    private Integer saleTotal;

    private BigDecimal price;

    private Date saleDate;

    private Integer visitNum;

    private Date createDate;

    private String spec;

    private String imageUrl;
    List<GoodsImages> list;
}
