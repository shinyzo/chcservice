package com.lming.chcservice.dao;

import com.lming.chcservice.model.MobileNav;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MobileNavRepository extends JpaRepository<MobileNav,String>{

    /**
     * 通过NavId集合查找导航
     * @param navIdList
     * @return
     */
    public List<MobileNav> findByNavIdIn(List<String> navIdList);

}
