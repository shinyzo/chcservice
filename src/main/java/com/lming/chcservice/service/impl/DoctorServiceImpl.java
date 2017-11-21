package com.lming.chcservice.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lming.chcservice.dao.DoctorRepository;
import com.lming.chcservice.entity.DoctorInfo;
import com.lming.chcservice.mapper.DoctorMapper;
import com.lming.chcservice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository repository;

    @Autowired
    private DoctorMapper mapper;

    @Override
    public List<DoctorInfo> findAll() {
        return repository.findAll();
    }

    @Override
    public PageInfo<DoctorInfo> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<DoctorInfo> doctorInfos = mapper.findAll(new HashMap<>());
        PageInfo<DoctorInfo> pageInfo = new PageInfo<>(doctorInfos);
        return pageInfo;
    }
}
