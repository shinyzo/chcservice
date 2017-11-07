package com.lming.chcservice.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@DynamicUpdate
@Data
public class DoctorInfo {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 与UserInfo 中id关联
     */
    private Integer userId;
    /**
     * 医师名称
     */
    private String doctorName;
    /**
     * 就职医院
     */
    private String workHospital;
    /**
     * 工作年限
     */
    private String workAge;



}
