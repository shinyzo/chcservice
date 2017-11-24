package com.lming.chcservice.util.menutree;

import java.util.List;

/**
 *
 * 树的基本结构
 *
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
public interface Tree {
    /**
     * 节点
     * @return
     */
    public String getNodeId();

    /**
     * 父节点
     * @return
     */
    public String getParentId();

    /**
     * 节点名称
     * @return
     */
    public String getNodeName();

    /**
     * 是否有孩子
     * @param isHasChild
     */
    public void isHasChildren(Boolean isHasChild);

    /**
     * 孩子节点集合
     * @param childrens
     */
    public void setChildrens(List<?> childrens);
}
