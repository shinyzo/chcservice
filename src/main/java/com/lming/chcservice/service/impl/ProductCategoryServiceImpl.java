package com.lming.chcservice.service.impl;

import com.lming.chcservice.converter.ProductCategory2ProductCategorTreeConverter;
import com.lming.chcservice.dao.ProductCategoryRepository;
import com.lming.chcservice.dto.ProductCategoryTree;
import com.lming.chcservice.entity.ProductCategory;
import com.lming.chcservice.mapper.ProductCategoryMapper;
import com.lming.chcservice.service.ProductCategoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    public static final String DEFAULT_PARENT_ID = "0";

    @Autowired
    private ProductCategoryMapper mapper;

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public List<ProductCategoryTree> findAll() {

        List<ProductCategory> fullCategorys = repository.findAll();

        List<ProductCategoryTree> rootTrees = new ArrayList<>();

        for (int i = 0; i < fullCategorys.size(); i++) {
            if (DEFAULT_PARENT_ID.equals(fullCategorys.get(i).getParentId())) {
                ProductCategory productCategory = fullCategorys.get(i);
                ProductCategoryTree productCategoryTree = ProductCategory2ProductCategorTreeConverter
                        .convert(productCategory);
                rootTrees.add(productCategoryTree);
            }
        }
        for(int i=0 ;i<rootTrees.size();i++)
        {
            List<ProductCategoryTree> childs = getChild(rootTrees.get(i).getCategoryId(),fullCategorys);
            if(childs.size()==0){
                rootTrees.get(i).setHasChildren(false);
            }
            rootTrees.get(i).setChildren(childs);
        }
        return rootTrees;
    }


    private List<ProductCategoryTree> getChild(String menuId, List<ProductCategory> fullCategorys) {

        // 子菜单
        List<ProductCategoryTree> childList = new ArrayList<>();
        for (ProductCategory menu : fullCategorys) {
            // 遍历所有节点，将父菜单id与传过来的id比较
            if (StringUtils.isNotBlank(menu.getParentId())) {
                if (menu.getParentId().equals(menuId)) {
                    childList.add(ProductCategory2ProductCategorTreeConverter.convert(menu));
                    fullCategorys.remove(menu);
                }
            }
        }
        if(childList.size()>0){
            for (ProductCategoryTree menu : childList) {// 没有url子菜单还有子菜单
                getChild(menu.getCategoryId(),fullCategorys);
            } // 递归退
        }

        return childList;
    }
}
