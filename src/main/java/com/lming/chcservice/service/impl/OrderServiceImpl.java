package com.lming.chcservice.service.impl;

import com.lming.chcservice.vo.OrderVO;
import com.lming.chcservice.mapper.OrderMapper;
import com.lming.chcservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper mapper;
    @Override
    public OrderVO findByOrderId(String orderId) {
        return mapper.findByOrderId(orderId);
    }

    @Override
    public List<OrderVO> findByDoctorId(Integer doctorId) {
        return mapper.findByDoctorId(doctorId);
    }

    @Override
    public List<OrderVO> findByFromUserId(Integer fromUserId) {
        return mapper.findByFromUserId(fromUserId);
    }

    @Override
    public OrderVO findByReserveId(String reserveId) {
        return mapper.findByReserveId(reserveId);
    }
}
