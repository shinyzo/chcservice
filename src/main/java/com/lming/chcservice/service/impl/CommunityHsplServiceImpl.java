package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.CommunityHsplRepository;
import com.lming.chcservice.entity.CommunityHspl;
import com.lming.chcservice.service.CommunityHsplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
@Service
public class CommunityHsplServiceImpl implements CommunityHsplService {

    @Autowired
    private CommunityHsplRepository repository;

    @Override
    public List<CommunityHspl> findAll() {
        return repository.findAll();
    }

    @Override
    public List<CommunityHspl> findByHsplName(String hsplName) {
        return repository.findByHsplNameLike("%"+hsplName+"%");
    }
}
