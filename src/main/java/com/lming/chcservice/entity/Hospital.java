package com.lming.chcservice.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 医院
 */
@Entity
@Data
@DynamicUpdate
public class Hospital {
    /*
     * 医院id
     */
    @Id
    @GeneratedValue
    private Integer hospitalId;
    /**
     * 医院名称
     */
    private String hospitalName;
    /**
     * 医院类型
     */
    private String hospitalType;
    /**
     * 医院级别
     * 三级甲等
     * 二级甲等
     */
    private String hospitalLevel;
    /**
     * 地址
     */
    private String address;
    /**
     * 经度
     */
    private String lat;
    /**
     * 纬度
     */
    private String lng;
    /**
     * 电话
     */
    private String telnum;
}
