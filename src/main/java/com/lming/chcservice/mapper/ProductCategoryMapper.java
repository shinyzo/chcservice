package com.lming.chcservice.mapper;

import com.lming.chcservice.entity.ProductCategory;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
public interface ProductCategoryMapper {

    List<ProductCategory> findByParentId(String parentId);

    List<ProductCategory> findAll();
}
