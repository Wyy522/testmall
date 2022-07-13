/**
  * Copyright 2019 bejson.com 
  */
package com.market.mall.product.vo;
import com.market.common.to.MemberPrice;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
public class Skus {

    private List<Attr> attr;
    private String skuName;
    private BigDecimal price;
    private String skuTitle;
    private String skuSubtitle;
    private List<Images> images;
    private List<String> descar;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;


}