package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.HospitalRepository;
import com.lming.chcservice.entity.Hospital;
import com.lming.chcservice.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository repository;

    @Override
    public List<Hospital> findAll() {
        return repository.findAll();
    }
}
