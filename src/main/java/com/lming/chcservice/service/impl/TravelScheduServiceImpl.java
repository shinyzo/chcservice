package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.TravelScheduRepository;
import com.lming.chcservice.entity.TravelSchedule;
import com.lming.chcservice.service.TravelScheduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@Service
public class TravelScheduServiceImpl implements TravelScheduService {

    @Autowired
    private TravelScheduRepository repository;

    @Override
    public List<TravelSchedule> findByDoctorId(Integer doctorId) {
        return repository.findByDoctorId(doctorId);
    }
}
