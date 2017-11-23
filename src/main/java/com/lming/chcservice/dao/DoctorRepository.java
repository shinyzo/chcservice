package com.lming.chcservice.dao;

import com.lming.chcservice.entity.DoctorInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorInfo, Integer> {

    DoctorInfo findByDoctorId(Integer doctorId);
}
