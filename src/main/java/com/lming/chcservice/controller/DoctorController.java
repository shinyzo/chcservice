package com.lming.chcservice.controller;

import com.github.pagehelper.PageInfo;
import com.lming.chcservice.entity.DoctorInfo;
import com.lming.chcservice.form.DoctorQueryForm;
import com.lming.chcservice.service.impl.DoctorServiceImpl;
import com.lming.chcservice.util.ResultVOUtil;
import com.lming.chcservice.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1")
@Slf4j
public class DoctorController {

    @Autowired
    private DoctorServiceImpl doctorService;

    @GetMapping("/doctors")
    public ResultVO queryAll(DoctorQueryForm doctorQueryForm) {
        List<DoctorInfo> doctorInfoList = doctorService.findAll(doctorQueryForm);
        return ResultVOUtil.success(doctorInfoList);
    }

    @GetMapping("/doctors/page")
    public ResultVO queryByPage(DoctorQueryForm doctorQueryForm) {
        PageInfo<DoctorInfo> pageInfo = doctorService.findByPage(doctorQueryForm);
        return ResultVOUtil.success(pageInfo);
    }

    @GetMapping("/doctors/{id}")
    public ResultVO findOne(@PathVariable("id") Integer doctorId){
       DoctorInfo doctorInfo =  doctorService.findById(doctorId);
       return  ResultVOUtil.success(doctorInfo);
    }


}
