package com.lming.chcservice.dao;

import com.lming.chcservice.entity.City;
import com.lming.chcservice.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
public interface CityRepository extends JpaRepository<City,Integer> {


    List<City> findByProvinceId(String provinceId);
}
