package com.lming.chcservice.service;

import com.lming.chcservice.model.UserInfo;

public interface UserService {

    UserInfo findOne(String loginName, String loginPass);

    UserInfo findOne(String openid);
}
