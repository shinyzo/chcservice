package com.lming.chcservice.mapper;

import com.github.pagehelper.Page;
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
        PageHelper.startPage(1, 2);
        List<MobileNav> mobileNavList = mapper.findAll();
        for(int i=0;i<mobileNavList.size();i++)
        {
            log.info(mobileNavList.get(i).getNavId());
            log.info(mobileNavList.get(i).getNavName());
        }
        System.out.print(mobileNavList);
        PageInfo<MobileNav> pageInfo = new PageInfo<>(mobileNavList);
        log.info("共{}页，当前页{}，下一页{},总记录{}",pageInfo.getPages(),pageInfo.getNavigatePages(),pageInfo.getNextPage(),pageInfo.getTotal());
    }

}