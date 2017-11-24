package com.lming.chcservice.controller;

import com.lming.chcservice.service.impl.ProductCategoryServiceImpl;
import com.lming.chcservice.util.ResultVOUtil;
import com.lming.chcservice.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ProductCategoryController {
    @Autowired
    private ProductCategoryServiceImpl productCategoryService;

    @GetMapping("/categorys")
    public ResultVO categorys() {
        List<Object> objectList = productCategoryService.findAll();
        return ResultVOUtil.success(objectList);
    }
}
