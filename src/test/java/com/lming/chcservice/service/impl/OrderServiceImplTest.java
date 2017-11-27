package com.lming.chcservice.service.impl;

import com.lming.chcservice.vo.OrderVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    @Test
    public void findByReserveId() throws Exception {
        String reserveId = "1";
        OrderVO orderDTO = orderService.findByReserveId(reserveId);
        log.info("orderDTO:{}", orderDTO);
    }

    @Test
    public void findByOrderId() throws Exception {
        String orderId = "1111111";
        OrderVO orderDTO = orderService.findByOrderId(orderId);
        log.info("orderDTO:{}", orderDTO);
    }

    @Test
    public void findByDoctorId() throws Exception {

        Integer doctorId = 1;
        List<OrderVO> orderDTOList = orderService.findByDoctorId(doctorId);
        log.info("orderDTO:{}", orderDTOList);

    }

    @Test
    public void findByFromUserId() throws Exception {
        Integer fromUserId = 1;
        List<OrderVO> orderDTOList = orderService.findByFromUserId(fromUserId);
        log.info("orderDTO:{}", orderDTOList);

    }

}