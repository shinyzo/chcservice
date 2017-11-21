package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 医师级别
 */
@Entity
@Data
public class DoctorLevel {
    /**
     * 级别
     */
    @Id
    @GeneratedValue
    private Integer levelId;
    /**
     * 级别名称
     */
    private String levelName;
}
