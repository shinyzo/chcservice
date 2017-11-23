package com.lming.chcservice.dto;

import lombok.Data;

import java.util.List;

/**
 * 产品分类树形结构
 *
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@Data
public class ProductCategoryTree {

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
     * 父节点
     */
    private String parentId;
    /**
     * 是否有子节点
     */
    private boolean hasChildren;
    /**
     * 子节点集合
     */
    private List<ProductCategoryTree> children;

}
