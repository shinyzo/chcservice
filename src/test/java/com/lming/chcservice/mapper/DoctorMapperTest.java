package com.lming.chcservice.mapper;

import com.lming.chcservice.entity.DoctorInfo;
import lombok.extern.slf4j.Slf4j;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DoctorMapperTest {
    @Autowired
    private DoctorMapper mapper;

    @Test
    public void findAll() throws Exception {
        List<DoctorInfo> doctorInfoList = mapper.findAll(new HashMap<>());
        Assert.assertNotEquals(0,doctorInfoList.size());
    }


}
