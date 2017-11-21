package com.lming.chcservice.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@DynamicUpdate
@Data
public class DoctorInfo implements Serializable {


    /**
     * 主键id
     */
    @Id
    @GeneratedValue
    private Integer doctorId;
    /**
     * 与UserInfo 中id关联
     */
    private Integer userId;
    /**
     * 医师名称
     */
    private String doctorName;
    /**
     * 医师性别
     */
    private String sex;
    /**
     * 出生年月日
     */
    private String birthday;
    /**
     * 身份证号
     */
    private String idCardNo;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 医师资格证书编号
     */
    private String qafcaCertNo;
    /**
     * 证书图片
     */
    private String qafcaCertImg;
    /**
     * 发证日期
     */
    private String qafcaCertSignDate;
    /**
     * 执业资格证书编号
     */
    private String practCertNo;
    /**
     * 图片
     */
    private String practCertImg;
    /**
     * 注册日期
     */
    private String practCertRegisterDate;
    /**
     * 就职医院
     */
    private String workHospital;
    /**
     * 科室Id
     */
    private String subjectId;
    /**
     * 医师级别Id
     */
    private String doctorLevel;
    /**
     * 医师编号
     */
    private String doctorNo;
    /**
     * 大学名称
     */
    private String collegeName;
    /**
     * 工作年限
     */
    private Integer workAge;
    /**
     * 擅长领域
     */
    private String fav_subject;
    /**
     * 办公电话
     */
    private String officePhone;
    /**
     * 私人电话
     */
    private String personalPhone;
    /**
     * 状态
     */
    private String status;
    /**
     * 录入类型
     * 1：后台导入
     * 2：自行注册
     */
    private String inputType;
    /**
     * 医师描述
     */
    private String desc;
    /**
     * 积分
     */
    private Float score;

}
