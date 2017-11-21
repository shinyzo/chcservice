package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 社区医院
 */
@Entity
@Data
public class CommunityHspl {
    /**
     * id
     */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 社区医院名称
     */
    private String hsplName;
    /**
     * 社区医院电话
     */
    private String hsplPhone;
    /**
     * 营业时间
     */
    private String workTime;
    /**
     * 营业执照号
     */
    private String businessCode;
    /**
     * 法人姓名
     */
    private String artificalName;
    /**
     * 身份证号
     */
    private String idCardNo;
    /**
     * 社区医院地址
     */
    private String hsplAddress;
    /**
     * 经度
     */
    private String lat;
    /**
     * 维度
     */
    private String lng;
    /**
     * 登录用户id
     */
    private Integer userId;


}
