package com.lming.chcservice.service.impl;

import com.lming.chcservice.mapper.DoctorMapper;
import com.lming.chcservice.entity.DoctorInfo;

import java.util.List;
import java.util.Map;

public class DoctorMapperImpl implements DoctorMapper {
    @Override
    public List<DoctorInfo> findAll(Map<String, String> map) {
        return null;
    }

    @Override
    public List<DoctorInfo> findByPage(Map<String, String> map, Page page) {
        return null;
    }

    @Override
    public int getTotal(Map<String, String> map) {
        return 0;
    }
}
