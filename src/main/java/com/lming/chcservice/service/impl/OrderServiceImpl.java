package com.lming.chcservice.service.impl;

import com.lming.chcservice.dto.OrderDTO;
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
    public OrderDTO findByOrderId(String orderId) {
        return mapper.findByOrderId(orderId);
    }

    @Override
    public List<OrderDTO> findByDoctorId(Integer doctorId) {
        return mapper.findByDoctorId(doctorId);
    }

    @Override
    public List<OrderDTO> findByFromUserId(Integer fromUserId) {
        return mapper.findByFromUserId(fromUserId);
    }

    @Override
    public OrderDTO findByReserveId(String reserveId) {
        return null;
    }
}
