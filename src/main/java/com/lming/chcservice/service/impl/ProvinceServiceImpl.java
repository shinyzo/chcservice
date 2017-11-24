package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.ProvinceRepository;
import com.lming.chcservice.entity.Province;
import com.lming.chcservice.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository repository;
    @Override
    public List<Province> findAll() {
        return repository.findAll();
    }
}
