package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ProductCategory {
    /**
     * 分类id
     */
    @Id
    private String categoryId;
    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 图标
     */
    private String icon;
    /**
     * 父类id
     */
    private String parentId;
    /**
     * 状态
     */
    private String status;
}
