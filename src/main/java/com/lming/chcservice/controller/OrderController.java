package com.lming.chcservice.controller;

import com.lming.chcservice.dto.OrderDTO;
import com.lming.chcservice.service.impl.OrderServiceImpl;
import com.lming.chcservice.util.ResultVOUtil;
import com.lming.chcservice.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@RestController
@RequestMapping("/api/v1/")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("/orders/findByOrderId")
    public ResultVO findByOrderId(@RequestParam("orderId") String orderId){
       OrderDTO orderDTO =  orderService.findByOrderId(orderId);

        return ResultVOUtil.success(orderDTO);
    }

    @GetMapping("/orders/findByDoctorId")
    public ResultVO findByDoctorId(@RequestParam("doctorId") Integer doctorId){
        List<OrderDTO> orderDTOList =  orderService.findByDoctorId(doctorId);

        return ResultVOUtil.success(orderDTOList);
    }

    @GetMapping("/orders/findByFromUserId")
    public ResultVO findByFromUserId(@RequestParam("fromUserId") Integer fromUserId){
        List<OrderDTO> orderDTOList =  orderService.findByFromUserId(fromUserId);
        return ResultVOUtil.success(orderDTOList);
    }


    @GetMapping("/orders/findByReserveId")
    public ResultVO findByReserveId(@RequestParam("reserveId") String reserveId){
        OrderDTO orderDTO =  orderService.findByReserveId(reserveId);
        return ResultVOUtil.success(orderDTO);
    }

}
