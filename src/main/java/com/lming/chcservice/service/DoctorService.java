package com.lming.chcservice.service;

import com.github.pagehelper.PageInfo;
import com.lming.chcservice.dto.DoctorInfoDTO;
import com.lming.chcservice.entity.DoctorInfo;
import com.lming.chcservice.form.DoctorQueryForm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DoctorService {

    public DoctorInfo findById(Integer doctorId);

    public List<DoctorInfo> findAll(DoctorQueryForm doctorQueryForm);

    public PageInfo<DoctorInfo> findByPage(DoctorQueryForm doctorQueryForm);

}
