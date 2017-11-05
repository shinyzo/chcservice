package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.MobileNavRepository;
import com.lming.chcservice.dao.UserNavRepository;
import com.lming.chcservice.enums.ResultEnum;
import com.lming.chcservice.exception.ChcProcessException;
import com.lming.chcservice.model.MobileNav;
import com.lming.chcservice.model.UserNav;
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
    private UserNavRepository userNavRepository;

    @Autowired
    private MobileNavRepository repository;

    @Override
    public List<MobileNav> getNavByUsertype(String usertype) {
        if(StringUtils.isEmpty(usertype))
        {
            log.error("【导航菜单】- 用户usertype为空.");
            throw new ChcProcessException(ResultEnum.USERTYPE_EMPTY);
        }
        List<UserNav> userNavList = userNavRepository.findByUsertype(usertype);
        if(CollectionUtils.isEmpty(userNavList)){
            log.info("【导航菜单】- 用户未配置菜单，usertype={}",usertype);
            return null;
        }

        List<String> navIdList =new ArrayList<String>();
        for(UserNav userNav:userNavList){
            navIdList.add(userNav.getNavId());
        }

        return repository.findByNavIdIn(navIdList);

    }
}
