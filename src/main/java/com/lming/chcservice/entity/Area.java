package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 区域县级编码
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
@Entity
@Data
public class Area {
    @Id
    @GeneratedValue
    private Integer id;

    private String areaId;

    private String areaName;

    private String cityId;

}
