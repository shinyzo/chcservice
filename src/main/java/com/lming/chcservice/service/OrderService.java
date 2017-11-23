package com.lming.chcservice.service;

import com.lming.chcservice.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    OrderDTO findByOrderId(String orderId);

    List<OrderDTO> findByDoctorId(Integer doctorId);

    List<OrderDTO> findByFromUserId(Integer fromUserId);

    OrderDTO findByReserveId(String reserveId);

}
