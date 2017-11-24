package com.lming.chcservice.dto;

import com.lming.chcservice.util.menutree.TreeAbstr;
import lombok.Data;

/**
 * 产品分类树形结构
 *
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@Data
public class ProductCategoryTree extends TreeAbstr {
    /**
     * 图标
     */
    private String icon;
    /**
     * 状态
     */
    private String status;

    public ProductCategoryTree(String nodeId, String nodeName, String parentId, String icon, String status) {
        super(nodeId, nodeName, parentId);
        this.icon = icon;
        this.status = status;
    }
}
