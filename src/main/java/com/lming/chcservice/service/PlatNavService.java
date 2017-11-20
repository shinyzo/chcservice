package com.lming.chcservice.service;

import com.lming.chcservice.model.PlatNav;

import java.util.List;

public interface PlatNavService {

    public List<PlatNav> findByPlatType(String platType);

}
