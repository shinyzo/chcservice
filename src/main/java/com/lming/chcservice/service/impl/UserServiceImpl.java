package com.lming.chcservice.service.impl;

import com.lming.chcservice.dao.UserInfoRepository;
import com.lming.chcservice.model.UserInfo;
import com.lming.chcservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepository repository;

    @Override
    public UserInfo findOne(String loginName, String loginPass) {
        return repository.findByLoginNameAndLoginPass(loginName,loginPass);
    }

    @Override
    public UserInfo findOne(String openid) {

        return repository.findByOpenid(openid);
    }
}
