package com.lming.chcservice.dao;

import com.lming.chcservice.entity.TravelSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
public interface TravelScheduRepository extends JpaRepository<TravelSchedule,String>{

    List<TravelSchedule> findByDoctorId(Integer doctorId);
}
