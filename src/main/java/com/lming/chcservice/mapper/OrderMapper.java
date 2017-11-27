package com.lming.chcservice.mapper;

import com.lming.chcservice.vo.OrderVO;

import java.util.List;

public interface OrderMapper {

    /**
     * 根据订单号查询
     * @param orderId
     * @return
     */
    OrderVO findByOrderId(String orderId);

    /**
     * 根据病人id查询
     * @param fromUserId
     * @return
     */
    List<OrderVO> findByFromUserId(Integer fromUserId);

    /**
     * 根据医师id查询
     * @param doctorId
     * @return
     */
    List<OrderVO> findByDoctorId(Integer doctorId);

    /**
     * 根据预约单号查询
     * @param reserveId
     * @return
     */
    OrderVO findByReserveId(String reserveId);
}
