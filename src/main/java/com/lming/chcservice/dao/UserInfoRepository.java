package com.lming.chcservice.dao;

import com.lming.chcservice.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer>{

    UserInfo findByLoginNameAndLoginPass(String loginName, String loginPass);

    UserInfo findByOpenid(String openid);

}
