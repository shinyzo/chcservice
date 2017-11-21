package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.SubjectRepository;
import com.lming.chcservice.entity.Subject;
import com.lming.chcservice.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService{
    @Autowired
    private SubjectRepository repository;

    @Override
    public List<Subject> findAll() {
        return repository.findAll();
    }
}
