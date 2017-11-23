package com.lming.chcservice.dto;

import com.lming.chcservice.entity.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class OrderDTO {

    private String orderId;
    private String reserveId;
    private Integer fromUserId;
    private Integer toUserId;
    private String conditionDescription;
    private String diagnosisOpinion;
    private String attachment;
    private String signName;
    private BigDecimal orderAmt;
    private String orderStatus;
    private String payStatus;
    private String nextId;

    private List<OrderDetail> orderDetailList;


}
