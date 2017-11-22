package com.lming.chcservice.service.impl;

import com.github.pagehelper.PageInfo;
import com.lming.chcservice.entity.DoctorInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
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
public class DoctorServiceImplTest {

    @Autowired
    private DoctorServiceImpl doctorService;

    @Test
    public void findByPage() {

    }

}