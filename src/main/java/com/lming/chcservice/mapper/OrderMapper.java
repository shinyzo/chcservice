package com.lming.chcservice.mapper;

import com.lming.chcservice.dto.OrderDTO;

import java.util.List;

public interface OrderMapper {

    OrderDTO findByOrderId(String orderId);
    List<OrderDTO> findByFromUserId(Integer fromUserId);
    List<OrderDTO> findByDoctorId(Integer doctorId);
    List<OrderDTO> findByReserveId(String reserveId);
}
