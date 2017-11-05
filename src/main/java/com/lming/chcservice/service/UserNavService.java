package com.lming.chcservice.service;

import com.lming.chcservice.dto.UserNavDTO;
import com.lming.chcservice.model.UserNav;

import java.util.List;

public interface UserNavService {

    public List<UserNav> findByUsertype(String usertype);

}
