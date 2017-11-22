package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 预约
 */
@Entity
@Data
public class Reserve {
    /**
     * 预约号
     */
    @Id
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
     * 医师id
     */
    private Integer doctorId;
    /**
     * 状态
     * 0：预约中
     * 1：预约成功
     * 2：拒绝
     */
    private String status;
    /**
     * 预约时间
     */
    private String reserveTime;
    /**
     * 预约日期
     */
    private String reserveDate;
    /**
     * 预约地点
     */
    private String reserveAddress;
}
