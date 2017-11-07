package com.lming.chcservice.dao;

import com.lming.chcservice.model.RoleNav;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserNavRepository extends JpaRepository<RoleNav,Integer> {

    public List<RoleNav> findByRoleId(Integer roleId);


}
