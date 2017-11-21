package com.lming.chcservice.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lming.chcservice.entity.DoctorInfo;
import lombok.extern.slf4j.Slf4j;
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
        log.info("doctorList:{}",doctorInfoList);
        Assert.assertNotEquals(0,doctorInfoList.size());
    }

    @Test
    public void findBypage()throws  Exception{
        Page<DoctorInfo> page = PageHelper.startPage(1,2); // 设置分页，参数1=页数，参数2=每页显示条数
        List<DoctorInfo> doctorInfoList = mapper.findAll(new HashMap<>());
        log.info("doctorList:{}",doctorInfoList);
        log.info("page:{}",page);
        PageInfo<DoctorInfo> pageInfo = new PageInfo<DoctorInfo>(doctorInfoList);
        log.info("{}",pageInfo.getList());
        Assert.assertNotEquals(0,pageInfo.getTotal());

    }


}
