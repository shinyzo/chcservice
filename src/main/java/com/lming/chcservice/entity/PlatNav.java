package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class PlatNav {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 平台类型
     */
    private String platType;
    /**
     * 导航id
     */
    private String navId;

}
