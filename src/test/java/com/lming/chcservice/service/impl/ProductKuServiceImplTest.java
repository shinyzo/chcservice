package com.lming.chcservice.service.impl;

import com.lming.chcservice.entity.ProductKu;
import com.lming.chcservice.form.ProductQueryForm;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductKuServiceImplTest {

    @Autowired
    private ProductKuServiceImpl productKuService;

    @Test
    public void findAll() throws Exception {
        List<ProductKu> productKuList =  productKuService.findAll();
        log.info("productKuList => {}",productKuList);
        Assert.assertNotEquals(0,productKuList.size());
    }

    @Test
    public void findByCategoryId() throws Exception {
        String categoryId = "26";
        List<ProductKu> productKuList =  productKuService.findByCategoryId(categoryId);
        log.info("productKuList => {}",productKuList);
        Assert.assertNotEquals(0,productKuList.size());
    }

    @Test
    public void findByStatus() throws Exception {
        String status = "0";
        List<ProductKu> productKuList =  productKuService.findByStatus(status);
        log.info("productKuList => {}",productKuList);
        Assert.assertNotEquals(0,productKuList.size());
    }

    @Test
    public void findById() throws Exception {
        String productId = "5900";
        ProductKu productKu=  productKuService.findById(productId);
        log.info("productKuList => {}",productKu);
        Assert.assertNotNull(productKu);
    }

    @Test
    public void findByCondition() throws Exception {
        ProductQueryForm productQueryForm = new ProductQueryForm();
        productQueryForm.setProductName("海马");
        List<ProductKu> productKuList =  productKuService.findByCondition(productQueryForm);
        log.info("productKuList => {}",productKuList);
        Assert.assertNotEquals(0,productKuList.size());

    }

}