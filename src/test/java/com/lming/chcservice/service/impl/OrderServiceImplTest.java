package com.lming.chcservice.service.impl;

import com.lming.chcservice.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    @Test
    public void findByReserveId() throws Exception {
    }

    @Test
    public void findByOrderId() throws Exception {
        String orderId = "1111111";
        OrderDTO orderDTO = orderService.findByOrderId(orderId);
        log.info("orderDTO:{}", orderDTO);
    }

    @Test
    public void findByDoctorId() throws Exception {
    }

    @Test
    public void findByFromUserId() throws Exception {
        Integer fromUserId = 1;
        List<OrderDTO> orderDTOList = orderService.findByFromUserId(fromUserId);
        log.info("orderDTO:{}", orderDTOList);

    }

}