package com.lming.chcservice.mapper;

import com.lming.chcservice.entity.DoctorInfo;

import java.util.List;
import java.util.Map;

public interface DoctorMapper {

    List<DoctorInfo> findAll(Map<String, Object> map);

}
