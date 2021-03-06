package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 城市编码
 */
@Entity
@Data
public class City {

    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 城市Id
     */
    private String cityId;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 父级城市id
     */
    private String provinceId;

}
