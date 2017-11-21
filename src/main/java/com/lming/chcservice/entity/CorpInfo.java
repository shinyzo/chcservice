package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
public class CorpInfo {
    /**
     * id
     */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 企业Id
     */
    private String corpId;
    /**
     * 企业名称
     */
    private String corpName;
    /**
     * 营业执照号
     */
    private String businessCode;
    /**
     * 法人姓名
     */
    private String artificialName;
    /**
     * 身份证号
     */
    private String idCardNo;
    /**
     * 企业电话
     */
    private String corpPhone;
    /**
     * 企业Logo
     */
    private String corpLogo;
    /**
     * 经度
     */
    private String lat;
    /**
     * 纬度
     */
    private String lng;
    /**
     * 到期日
     */
    private Date expireDate;
    /**
     * 企业状态
     */
    private String corpStatus;
    /**
     * 开放状态
     */
    private String openStatus;
    /**
     * 描述
     */
    private String desc;

}
