package com.lming.chcservice.service.impl;

import com.lming.chcservice.enums.UserTypeEnum;
import com.lming.chcservice.model.MobileNav;
import com.lming.chcservice.service.MobileNavService;
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
public class MobileNavServiceImplTest {

    public static final String openid = "123456789";

    @Autowired
    private MobileNavService mobileNavService;

    @Test
    public void getNavByRoleId() throws Exception {

       List<MobileNav> mobileNavList =  mobileNavService.getNavByRoleId(1);
       log.info("导航列表："+mobileNavList);
       Assert.assertNotNull(mobileNavList);
    }

}