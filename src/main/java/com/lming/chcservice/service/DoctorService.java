package com.lming.chcservice.service;

import com.github.pagehelper.PageInfo;
import com.lming.chcservice.entity.DoctorInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DoctorService {

    public List<DoctorInfo> findAll();

    public PageInfo<DoctorInfo> findByPage(Integer pageNum, Integer pageSize, Map<String,String> paramsMap);


}
