package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 产品库
 */
@Entity
@Data
public class ProductKu {
    /**
     * 产品id
     */
    @Id
    private String productId;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 产品类别
     */
    private String categoryId;
    /**
     * 产品条码
     */
    private String productCode;
    /**
     * 产品编号
     */
    private String productNo;
    /**
     * 产品图片
     */
    private String productImg;
    /**
     * 产品描述简介
     */
    private String desc;
    /**
     * 产品对应积分
     */
    private Float score;

}
