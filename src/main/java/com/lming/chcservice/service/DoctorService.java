package com.lming.chcservice.service;

import com.github.pagehelper.PageInfo;
import com.lming.chcservice.entity.DoctorInfo;
import com.lming.chcservice.form.DoctorQueryForm;

import java.util.List;

public interface DoctorService {

    public DoctorInfo findById(Integer doctorId);

    public List<DoctorInfo> findAll(DoctorQueryForm doctorQueryForm);

    public PageInfo<DoctorInfo> findByPage(DoctorQueryForm doctorQueryForm);

}
