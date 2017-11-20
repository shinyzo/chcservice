package com.lming.chcservice.dao;

import com.lming.chcservice.model.PlatNav;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlatNavRepository extends JpaRepository<PlatNav,Integer> {

    public List<PlatNav> findByPlatType(String platType);


}
