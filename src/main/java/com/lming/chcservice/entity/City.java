package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 省市县编码
 */
@Entity
@Data
public class City {
    /**
     * 城市Id
     */
    @Id
    private String cityId;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 父级城市id
     */
    private String parentId;

}
