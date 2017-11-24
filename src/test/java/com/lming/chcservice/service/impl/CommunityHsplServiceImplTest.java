package com.lming.chcservice.service.impl;

import com.lming.chcservice.entity.CommunityHspl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CommunityHsplServiceImplTest {

    @Autowired
    private CommunityHsplServiceImpl communityHsplService;
    @Test
    public void findAll() throws Exception {
        List<CommunityHspl> communityHsplList = communityHsplService.findAll();
        log.info("list => {}",communityHsplList);
        Assert.assertNotEquals(0,communityHsplList.size());
    }

    @Test
    public void findByHsplName() throws Exception {
        List<CommunityHspl> communityHsplList = communityHsplService.findByHsplName("社区医院");
        log.info("list => {}",communityHsplList);
        Assert.assertNotEquals(0,communityHsplList.size());
    }

}