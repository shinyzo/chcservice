package com.lming.chcservice.dao;

import com.lming.chcservice.model.UserNav;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserNavRepository extends JpaRepository<UserNav,String> {

    public List<UserNav> findByUsertype(String usertype);


}
