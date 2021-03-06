package com.lming.chcservice.service.impl;

import com.lming.chcservice.util.GsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryServiceImplTest {
    @Test
    public void findAll1() throws Exception {
    }

    @Autowired
    private ProductCategoryServiceImpl productCategoryService;

    @Test
    public void findAll() throws Exception {
        List<Object> treeList = productCategoryService.findAll();
        log.info("treelist={}", GsonUtil.toJson(treeList));
    }

}