package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 省份编码
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
@Entity
@Data
public class Province {
    @Id
    @GeneratedValue
    private Integer id;

    private String provinceId;

    private String provinceName;
}
