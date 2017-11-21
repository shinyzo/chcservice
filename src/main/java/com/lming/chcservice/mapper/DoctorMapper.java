package com.lming.chcservice.mapper;

import com.lming.chcservice.entity.DoctorInfo;

import java.util.List;
import java.util.Map;

public interface DoctorMapper {

    public List<DoctorInfo> findAll(Map<String, String> map);

}
