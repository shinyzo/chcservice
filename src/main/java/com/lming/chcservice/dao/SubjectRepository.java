package com.lming.chcservice.dao;

import com.lming.chcservice.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, String> {
}
