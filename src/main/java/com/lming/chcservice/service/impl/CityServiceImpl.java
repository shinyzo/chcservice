package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.CityRepository;
import com.lming.chcservice.dao.ProvinceRepository;
import com.lming.chcservice.entity.City;
import com.lming.chcservice.entity.Province;
import com.lming.chcservice.service.CityService;
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
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository repository;
    @Override
    public List<City> findAll() {
        return repository.findAll();
    }

    @Override
    public List<City> findByProvinceId(String provinceId) {
        return repository.findByProvinceId(provinceId);
    }
}
