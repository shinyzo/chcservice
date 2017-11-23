package com.lming.chcservice.service;

import com.lming.chcservice.entity.ReserveEntity;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
public interface ReserveService {

    /**
     * 患者-我的预约
     * @return
     */
    List<ReserveEntity> findAllByFromUserId(Integer fromUserId);

    /**
     * 医生我的预约
     * @return
     */
    List<ReserveEntity> findAllByDoctorId(Integer doctorId);
}
