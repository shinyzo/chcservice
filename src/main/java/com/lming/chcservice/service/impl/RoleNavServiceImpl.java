package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.UserNavRepository;
import com.lming.chcservice.model.RoleNav;
import com.lming.chcservice.service.RoleNavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleNavServiceImpl implements RoleNavService {

    @Autowired
    private UserNavRepository repository;

    @Override
    public List<RoleNav> findByRoleId(Integer roleId){

        return repository.findByRoleId(roleId);
    }
}
