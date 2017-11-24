package com.lming.chcservice.dao;

import com.lming.chcservice.entity.CommunityHspl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author shinyZo
 * @date 2017-11-24
 * @description
 */
public interface CommunityHsplRepository extends JpaRepository<CommunityHspl,Integer> {

    public List<CommunityHspl> findByHsplNameLike(String hsplName);
}
