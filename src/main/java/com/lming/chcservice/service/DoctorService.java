package com.lming.chcservice.service;

import com.github.pagehelper.PageInfo;
import com.lming.chcservice.entity.DoctorInfo;

import java.util.List;

public interface DoctorService {

    public List<DoctorInfo> findAll();

    public PageInfo<DoctorInfo> findByPage(int pageNum, int pageSize);

}
