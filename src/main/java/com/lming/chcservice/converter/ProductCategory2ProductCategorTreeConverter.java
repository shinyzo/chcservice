package com.lming.chcservice.converter;

import com.lming.chcservice.dto.ProductCategoryTree;
import com.lming.chcservice.dto.UserInfoDTO;
import com.lming.chcservice.entity.ProductCategory;
import org.springframework.beans.BeanUtils;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
public class ProductCategory2ProductCategorTreeConverter {

    public static ProductCategoryTree convert(ProductCategory productCategory)
    {
        ProductCategoryTree productCategoryTree = new ProductCategoryTree();
        BeanUtils.copyProperties(productCategory,productCategoryTree);
        return productCategoryTree;
    }
}
