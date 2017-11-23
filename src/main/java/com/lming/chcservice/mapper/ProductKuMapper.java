package com.lming.chcservice.mapper;

import com.lming.chcservice.entity.ProductKu;
import com.lming.chcservice.form.ProductQueryForm;

import java.util.List;
import java.util.Map;

public interface ProductKuMapper {

    List<ProductKu> findAll();

    List<ProductKu> findByCategoryId(String categoryId);

    List<ProductKu> findByStatus(String status);

    ProductKu findById(String productId);

    List<ProductKu> findByCondition(Map<String,Object> paramsMap);

}
