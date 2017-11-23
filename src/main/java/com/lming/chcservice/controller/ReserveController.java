package com.lming.chcservice.controller;

import com.lming.chcservice.entity.ReserveEntity;
import com.lming.chcservice.service.impl.ReserveServiceImpl;
import com.lming.chcservice.util.ResultVOUtil;
import com.lming.chcservice.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 预约控制层
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@RestController
@RequestMapping("/api/v1")
public class ReserveController {

    @Autowired
    private ReserveServiceImpl reserveService;
    @GetMapping("/reserves/formuser/{id}")
    public ResultVO queryReserveByFromUserId(@PathVariable("id") Integer fromUserId)
    {
        List<ReserveEntity> reserveList = reserveService.findAllByFromUserId(fromUserId);
        return ResultVOUtil.success(reserveList);
    }

    @GetMapping("/reserves/fromdoctor/{id}")
    public ResultVO queryReserveByDoctorId(@PathVariable("id") Integer doctorId)
    {
        List<ReserveEntity> reserveList = reserveService.findAllByDoctorId(doctorId);
        return ResultVOUtil.success(reserveList);
    }


}
