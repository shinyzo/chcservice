package com.lming.chcservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class MobileNav {

    /**
     * 导航Id
     */
    @Id
    private String navId;
    /**
     * 导航名称
     */
    private String navName;
    /**
     * 跳转url
     */
    private String linkUrl;
    /**
     * 图标
     */
    private String icon;
    /**
     * 排序
     */
    private Integer sort;

}
