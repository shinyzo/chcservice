package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.DoctorRepository;
import com.lming.chcservice.entity.DoctorInfo;
import com.lming.chcservice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository repository;
    @Override
    public List<DoctorInfo> findAll() {
        return repository.findAll();
    }
}
