package com.lming.chcservice.dao;

import com.lming.chcservice.entity.Area;
import com.lming.chcservice.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
public interface AreaRepository extends JpaRepository<Area,Integer> {

    List<Area> findByCityId(String cityId);
}
