package com.lming.chcservice.service.impl;

import com.github.pagehelper.PageInfo;
import com.lming.chcservice.dto.DoctorInfoDTO;
import com.lming.chcservice.entity.DoctorInfo;
import com.lming.chcservice.form.DoctorQueryForm;
import com.lming.chcservice.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DoctorServiceImplTest {

    @Autowired
    private DoctorServiceImpl doctorService;

    @Test
    public void findAll() {
        DoctorQueryForm doctorQueryForm = new DoctorQueryForm();
        List<DoctorInfo> doctorInfoList = doctorService.findAll(doctorQueryForm);
        log.info("doctorInfoList:{}", JsonUtil.toJson(doctorInfoList));
        Assert.assertNotEquals(0,doctorInfoList.size());
    }



}