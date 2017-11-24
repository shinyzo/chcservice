package com.lming.chcservice.util.menutree;

import lombok.Data;

/**
 * 具体项目中树林
 */
@Data
public class TreeNode extends TreeAbstr {

    public TreeNode(String nodeId, String nodeName, String parentId) {
        super(nodeId, nodeName, parentId);
    }

    public TreeNode(String nodeId, String nodeName, String parentId, String rightUrl, String icon) {
        super(nodeId, nodeName, parentId);
        this.rightUrl = rightUrl;
        this.icon = icon;
    }

    private String rightUrl;

    private String icon;


}
