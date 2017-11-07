package com.lming.chcservice.service;

import com.lming.chcservice.model.RoleNav;

import java.util.List;

public interface RoleNavService {

    public List<RoleNav> findByRoleId(Integer roleId);

}
