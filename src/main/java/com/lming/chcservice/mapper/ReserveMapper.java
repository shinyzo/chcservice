package com.lming.chcservice.mapper;

import com.lming.chcservice.entity.ReserveEntity;

import java.util.List;

public interface ReserveMapper {

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

    int createReserve(ReserveEntity reserveEntity);

    int cancelReserve(ReserveEntity reserveEntity);
}
