package com.lming.chcservice.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lming.chcservice.entity.MobileNav;
import com.lming.chcservice.vo.PageResult;
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
public class MobileNavMapperTest {
    @Autowired
    private MobileNavMapper mapper;

    @Test
    public void findAll() throws Exception {
        List<MobileNav> mobileNavList = mapper.findAll();
        log.info("导航列表：" + mobileNavList);
        Assert.assertNotEquals(0, mobileNavList);
    }

    @Test
    public void findByPage() {
        PageHelper.startPage(2, 2);
        List<MobileNav> mobileNavList = mapper.findAll();
        log.info("mobileNav:{}", mobileNavList);
        PageInfo<MobileNav> pageInfo = new PageInfo<>(mobileNavList);
        PageResult pageResult = new PageResult();
        pageResult.setTotal(pageInfo.getTotal());
        pageResult.setRows(mobileNavList);
        log.info("pageResult:{}", pageResult);

        log.info("{}", pageInfo);
    }

}