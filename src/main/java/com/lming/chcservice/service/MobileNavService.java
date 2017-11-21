package com.lming.chcservice.service;

import com.lming.chcservice.entity.MobileNav;

import java.util.List;

public interface MobileNavService {


    public List<MobileNav> getNavByPlatType(String platType);


}
