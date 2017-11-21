package com.lming.chcservice.dao;

import com.lming.chcservice.entity.DoctorLevel;
import com.lming.chcservice.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, String> {
}
