package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 医师行程计划表
 */
@Entity
@Data
public class TravelSchedule {

    /**
     * 自增id
     */
    @Id
    @GeneratedValue
    private Integer travelId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 业务日期
     */
    private Date businessDate;
    /**
     * 开始时间
     */
    private String beginTime;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 经度
     */
    private String lat;
    /**
     * 纬度
     */
    private String lng;
    /**
     * 地点
     */
    private String travelAddress;
    /**
     * 状态
     * 0：未来
     * 1：过去
     */
    private String status;

}
