package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.PlatNavRepository;
import com.lming.chcservice.model.PlatNav;
import com.lming.chcservice.service.PlatNavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlatNavServiceImpl implements PlatNavService {

    @Autowired
    private PlatNavRepository repository;

    @Override
    public List<PlatNav> findByPlatType(String platType){

        return repository.findByPlatType(platType);
    }
}
