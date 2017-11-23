package com.lming.chcservice.controller;

import com.lming.chcservice.entity.DoctorInfo;
import com.lming.chcservice.entity.Hospital;
import com.lming.chcservice.form.DoctorQueryForm;
import com.lming.chcservice.service.impl.DoctorServiceImpl;
import com.lming.chcservice.service.impl.HospitalServiceImpl;
import com.lming.chcservice.util.ResultVOUtil;
import com.lming.chcservice.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@RestController
@RequestMapping(value = "/api/v1")
@Slf4j
public class HospitalController {

    @Autowired
    private HospitalServiceImpl hospitalService;

    @GetMapping("/hospitals")
    public ResultVO queryAll() {
        List<Hospital> hospitalList = hospitalService.findAll();
        return ResultVOUtil.success(hospitalList);
    }

}
