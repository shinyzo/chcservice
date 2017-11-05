package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.UserNavRepository;
import com.lming.chcservice.dto.UserNavDTO;
import com.lming.chcservice.model.UserNav;
import com.lming.chcservice.service.UserNavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserNavServiceImpl implements UserNavService {

    @Autowired
    private UserNavRepository repository;

    @Override
    public List<UserNav> findByUsertype(String usertype) {

        return repository.findByUsertype(usertype);
    }
}
