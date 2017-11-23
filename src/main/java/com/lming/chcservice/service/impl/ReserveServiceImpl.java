package com.lming.chcservice.service.impl;

import com.lming.chcservice.entity.ReserveEntity;
import com.lming.chcservice.mapper.ReserveMapper;
import com.lming.chcservice.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@Service
public class ReserveServiceImpl implements ReserveService {
    @Autowired
    private ReserveMapper mapper;

    @Override
    public List<ReserveEntity> findAllByFromUserId(Integer fromUserId) {
        return mapper.findAllByFromUserId(fromUserId);
    }

    @Override
    public List<ReserveEntity> findAllByDoctorId(Integer doctorId) {
        return mapper.findAllByDoctorId(doctorId);
    }
}
