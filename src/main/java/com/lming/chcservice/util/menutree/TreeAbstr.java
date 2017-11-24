package com.lming.chcservice.util.menutree;

import lombok.Data;

import java.util.List;

/**
 * 抽象类实现树
 * 并可以对树进行扩展
 * 例如 icon,linkUrl等属性
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
@Data
public abstract class TreeAbstr implements Tree {

    private String nodeId;

    private String nodeName;

    private String parentId;

    private Boolean isHasChildren;

    private List<?> childrens;

    public TreeAbstr() {
    }

    public TreeAbstr(String nodeId, String nodeName, String parentId) {
        this.nodeId = nodeId;
        this.nodeName = nodeName;
        this.parentId = parentId;
    }

    @Override
    public void isHasChildren(Boolean isHasChild) {
        this.isHasChildren = isHasChild;
    }
}
