package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.MobileNavRepository;
import com.lming.chcservice.dao.PlatNavRepository;
import com.lming.chcservice.entity.MobileNav;
import com.lming.chcservice.entity.PlatNav;
import com.lming.chcservice.service.MobileNavService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class MobileNavServiceImpl implements MobileNavService{

    @Autowired
    private PlatNavRepository platNavRepository;


    @Autowired
    private MobileNavRepository repository;

    @Override
    public List<MobileNav> getNavByPlatType(String platType) {

        List<PlatNav> PlatNavList = platNavRepository.findByPlatType(platType);
        if(CollectionUtils.isEmpty(PlatNavList)){
            log.error("【导航菜单】- APP类型菜单未配置，platType={}",platType);
            return null;
        }

        List<String> navIdList =new ArrayList<String>();
        for(PlatNav platNav:PlatNavList){
            navIdList.add(platNav.getNavId());
        }

        return repository.findByNavIdIn(navIdList);

    }

}
