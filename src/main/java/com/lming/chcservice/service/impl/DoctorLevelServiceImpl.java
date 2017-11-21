package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.DoctorLevelRepository;
import com.lming.chcservice.entity.DoctorLevel;
import com.lming.chcservice.service.DoctorLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorLevelServiceImpl implements DoctorLevelService{
    @Autowired
    private DoctorLevelRepository repository;
    @Override
    public List<DoctorLevel> findAll() {
       return repository.findAll();
    }
}
