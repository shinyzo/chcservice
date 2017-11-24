package com.lming.chcservice.service;

import com.lming.chcservice.entity.CommunityHspl;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
public interface CommunityHsplService {

    List<CommunityHspl> findAll();
    List<CommunityHspl> findByHsplName(String hsplName);

}
