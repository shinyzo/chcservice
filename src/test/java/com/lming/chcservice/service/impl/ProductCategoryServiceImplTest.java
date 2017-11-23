package com.lming.chcservice.service.impl;

import com.lming.chcservice.dto.ProductCategoryTree;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryServiceImplTest {
    @Autowired
    private ProductCategoryServiceImpl productCategoryService;

    @Test
    public void findAll() throws Exception {
        List<ProductCategoryTree> treeList = productCategoryService.findAll();
        log.info("treelist={}",treeList);
    }

}