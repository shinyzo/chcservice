package com.lming.chcservice.service;

import com.lming.chcservice.entity.TravelSchedule;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
public interface TravelScheduService {

    List<TravelSchedule> findByDoctorId(Integer doctorId);
}
