package com.lming.chcservice.service;

import com.lming.chcservice.vo.OrderVO;

import java.util.List;

public interface OrderService {

    OrderVO findByOrderId(String orderId);

    List<OrderVO> findByDoctorId(Integer doctorId);

    List<OrderVO> findByFromUserId(Integer fromUserId);

    OrderVO findByReserveId(String reserveId);

}
