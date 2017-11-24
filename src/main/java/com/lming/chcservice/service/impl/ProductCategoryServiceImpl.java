package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.ProductCategoryRepository;
import com.lming.chcservice.dto.ProductCategoryTree;
import com.lming.chcservice.entity.ProductCategory;
import com.lming.chcservice.mapper.ProductCategoryMapper;
import com.lming.chcservice.service.ProductCategoryService;
import com.lming.chcservice.util.menutree.TreeAbstr;
import com.lming.chcservice.util.menutree.TreeUtil;
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
    public List<Object> findAll() {

        List<ProductCategory> fullCategorys = repository.findAll();
        List<TreeAbstr> productCategoryTreeList = convert(fullCategorys);

        TreeUtil treeUtil = new TreeUtil();
        List<Object> treeList = treeUtil.treeMenu(productCategoryTreeList);
        return treeList;
    }

    private List<TreeAbstr> convert(List<ProductCategory> categories) {
        List<TreeAbstr>  productCategoryTrees = new ArrayList<>();
        for(int i=0;i<categories.size();i++)
        {
            ProductCategory productCategory = categories.get(i);
            ProductCategoryTree productCategoryTree = new ProductCategoryTree(
                    productCategory.getCategoryId(),
                    productCategory.getCategoryName(),
                    productCategory.getParentId(),
                    productCategory.getIcon(),
                    productCategory.getStatus()
            );
            productCategoryTrees.add(productCategoryTree);
        }
        return productCategoryTrees;
    }


}
