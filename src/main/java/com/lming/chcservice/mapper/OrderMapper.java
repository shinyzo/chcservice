package com.lming.chcservice.mapper;

import com.lming.chcservice.dto.OrderDTO;

import java.util.List;

public interface OrderMapper {

    /**
     * 根据订单号查询
     * @param orderId
     * @return
     */
    OrderDTO findByOrderId(String orderId);

    /**
     * 根据病人id查询
     * @param fromUserId
     * @return
     */
    List<OrderDTO> findByFromUserId(Integer fromUserId);

    /**
     * 根据医师id查询
     * @param doctorId
     * @return
     */
    List<OrderDTO> findByDoctorId(Integer doctorId);

    /**
     * 根据预约单号查询
     * @param reserveId
     * @return
     */
    OrderDTO findByReserveId(String reserveId);
}
