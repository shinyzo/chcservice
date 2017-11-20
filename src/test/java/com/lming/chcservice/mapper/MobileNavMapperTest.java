package com.lming.chcservice.mapper;

import com.lming.chcservice.model.MobileNav;
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
public class MobileNavMapperTest {
    @Autowired
    private MobileNavMapper mapper;
    @Test
    public void findAll() throws Exception {
      List<MobileNav> mobileNavList =   mapper.findAll();
      log.info("导航列表："+mobileNavList);
      Assert.assertNotEquals(0,mobileNavList);
    }

}