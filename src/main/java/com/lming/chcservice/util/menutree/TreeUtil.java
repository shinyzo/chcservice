package com.lming.chcservice.util.menutree;

import com.lming.chcservice.util.JsonUtil;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 树形结构工具类
 * <p>
 * 将一组list对象转成树形结构
 * 该list需符合设定的字段类型
 */
public class TreeUtil {


    public static Map<String, Object> mapArray = new LinkedHashMap<String, Object>();

    public List<TreeAbstr> menuCommon;
    public List<Object> list = new ArrayList<Object>();

    public List<Object> treeMenu(List<TreeAbstr> menu) {
        this.menuCommon = menu;
        for (TreeAbstr treeNode : menu) {
            // Map<String, Object> mapArr = new LinkedHashMap<String, Object>();
            List<Object> childList = new ArrayList<>();
            if (treeNode.getParentId().equals("0")) {
                //setTreeMap(mapArr, treeNode);
                setChildList(childList, treeNode);
                list.add(childList);
            }
        }
        return list;
    }

    public List<?> menuChild(String id) {
        List<Object> lists = new ArrayList<Object>();
        for (TreeAbstr a : menuCommon) {
            //Map<String, Object> childArray = new LinkedHashMap<String, Object>();
            List<Object> childList = new ArrayList<>();
            if (a.getParentId().equals(id)) {
                //setTreeMap(childArray, a);
                setChildList(childList, a);
                lists.add(childList);
            }
        }
        return lists;
    }

    private void setTreeMap(Map<String, Object> mapArr, TreeAbstr treeNode) {
        mapArr.put("nodeId", treeNode.getNodeId());
        mapArr.put("nodeName", treeNode.getNodeName());
        mapArr.put("parentId", treeNode.getParentId());
        List<?> childrens = menuChild(treeNode.getNodeId());
        if (childrens.size() > 0) {
            mapArr.put("hasChildren", true);
        } else {
            mapArr.put("hasChildren", false);
        }
        mapArr.put("childrens", childrens);
    }

    private void setChildList(List<Object> childList, TreeAbstr treeNode) {

        List<?> childrens = menuChild(treeNode.getNodeId());
        treeNode.setChildrens(childrens);
        if (childrens.size() > 0) {
            treeNode.isHasChildren(true);
        } else {
            treeNode.isHasChildren(false);
        }
        childList.add(treeNode);
    }

    public static void main(String[] args) {

        List<TreeAbstr> treeNodeList = new ArrayList<>();
        TreeNode treeNode1 = new TreeNode("1",  "首页","0");
        TreeNode treeNode2 = new TreeNode("2",  "订单","0");
        TreeNode treeNode3 = new TreeNode("3",  "预约","1");
        TreeNode treeNode4 = new TreeNode("4", "订单", "2");
        TreeNode treeNode5 = new TreeNode("5", "我订单", "4");
        TreeNode treeNode7 = new TreeNode("7", "个人中心2", "5");
        TreeNode treeNode8 = new TreeNode("8", "个人中心4", "7");
        treeNode1.setIcon("icon-home");
        treeNode1.setRightUrl("/index");
        treeNodeList.add(treeNode1);
        treeNodeList.add(treeNode5);
        treeNodeList.add(treeNode3);
        treeNodeList.add(treeNode4);
        treeNodeList.add(treeNode2);
        treeNodeList.add(treeNode7);
        treeNodeList.add(treeNode8);


        TreeUtil treeUtil = new TreeUtil();
        List<Object> objectList = treeUtil.treeMenu(treeNodeList);
        System.out.print(JsonUtil.toJson(objectList));

    }


}
