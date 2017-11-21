package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 订单主表
 */
@Entity
@Data
public class OrderMaster {
    /**
     * 订单id
     */
    @Id
    private String orderId;
    /**
     * 预约号
     */
    private String reserveId;
    /**
     * 预约者
     */
    private Integer fromUserId;
    /**
     * 被预约者
     */
    private Integer toUserId;
    /**
     * 病情描述
     */
    private String conditionDescription;
    /**
     * 诊断意见
     */
    private String diagnosisOpinion;
    /**
     * 附件
     */
    private String attachment;
    /**
     * 医师签名
     */
    private String signName;
    /**
     * 订单金额
     */
    private BigDecimal orderAmt;
    /**
     * 订单状态
     */
    private String orderStatus;
    /**
     * 支付状态
     */
    private String payStatus;
    /**
     * 下一个流转id
     */
    private String nextId;
}
