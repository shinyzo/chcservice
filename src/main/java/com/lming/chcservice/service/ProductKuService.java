package com.lming.chcservice.service;

import com.lming.chcservice.entity.ProductKu;
import com.lming.chcservice.form.ProductQueryForm;

import java.util.List;

public interface ProductKuService {

    List<ProductKu> findAll();

    List<ProductKu> findByCategoryId(String categoryId);

    List<ProductKu> findByStatus(String status);

    ProductKu findById(String productId);

    List<ProductKu> findByCondition(ProductQueryForm productQueryForm);

}
