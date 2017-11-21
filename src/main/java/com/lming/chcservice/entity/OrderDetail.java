package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 收费明细
 */
@Entity
@Data
public class OrderDetail {
    /**
     * 明细id
     */
    @Id
    private String detailId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 商品id
     */
    private String productId;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 产品分类
     */
    private String categoryId;
    /**
     * 数量
     */
    private Integer count;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 总额
     */
    private BigDecimal totalPrice;

}
