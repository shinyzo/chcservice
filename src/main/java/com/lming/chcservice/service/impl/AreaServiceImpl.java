package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.AreaRepository;
import com.lming.chcservice.entity.Area;
import com.lming.chcservice.entity.City;
import com.lming.chcservice.service.AreaService;
import com.lming.chcservice.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
@Service
public class AreaServiceImpl implements AreaService {


    @Autowired
    private AreaRepository repository;

    @Override
    public List<Area> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Area> findByCityId(String cityId) {
        return repository.findByCityId(cityId);
    }
}
