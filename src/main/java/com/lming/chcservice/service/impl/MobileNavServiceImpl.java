package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.MobileNavRepository;
import com.lming.chcservice.dao.UserNavRepository;
import com.lming.chcservice.enums.ResultEnum;
import com.lming.chcservice.exception.ChcProcessException;
import com.lming.chcservice.model.MobileNav;
import com.lming.chcservice.model.RoleNav;
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
    public List<MobileNav> getNavByRoleId(Integer roleId) {
        if(StringUtils.isEmpty(roleId))
        {
            log.error("【导航菜单】- 用户roleId为空.");
            throw new ChcProcessException(ResultEnum.ROLEID_EMPTY);
        }
        List<RoleNav> userNavList = userNavRepository.findByRoleId(roleId);
        if(CollectionUtils.isEmpty(userNavList)){
            log.info("【导航菜单】- 用户未配置菜单，roleId={}",roleId);
            return null;
        }

        List<String> navIdList =new ArrayList<String>();
        for(RoleNav userNav:userNavList){
            navIdList.add(userNav.getNavId());
        }

        return repository.findByNavIdIn(navIdList);

    }
}
