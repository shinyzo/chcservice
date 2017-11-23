package com.lming.chcservice.service.impl;

import com.lming.chcservice.entity.ProductKu;
import com.lming.chcservice.form.Form2MapConvert;
import com.lming.chcservice.form.ProductQueryForm;
import com.lming.chcservice.mapper.ProductKuMapper;
import com.lming.chcservice.service.ProductKuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductKuServiceImpl implements ProductKuService{

    @Autowired
    private ProductKuMapper mapper;


    @Override
    public List<ProductKu> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<ProductKu> findByCategoryId(String categoryId) {
        return mapper.findByCategoryId(categoryId);
    }

    @Override
    public List<ProductKu> findByStatus(String status) {
        return mapper.findByStatus(status);
    }

    @Override
    public ProductKu findById(String productId) {
        return mapper.findById(productId);
    }

    @Override
    public List<ProductKu> findByCondition(ProductQueryForm productQueryForm) {
        Map<String,Object> paramsMap = Form2MapConvert.convert(productQueryForm);
        return mapper.findByCondition(paramsMap);
    }
}
