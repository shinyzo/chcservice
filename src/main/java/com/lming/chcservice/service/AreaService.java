package com.lming.chcservice.service;

import com.lming.chcservice.entity.Area;
import com.lming.chcservice.entity.City;
import com.lming.chcservice.entity.Province;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
public interface AreaService {

    List<Area> findAll();

    List<Area> findByCityId(String cityId);
}
