package com.lming.chcservice.service.impl;

import com.lming.chcservice.entity.DoctorInfo;
import com.lming.chcservice.form.DoctorQueryForm;
import com.lming.chcservice.util.GsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
        log.info("doctorInfoList:{}", GsonUtil.toJson(doctorInfoList));
        Assert.assertNotEquals(0,doctorInfoList.size());
    }



}