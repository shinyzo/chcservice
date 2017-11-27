package com.lming.chcservice.converter;

import com.lming.chcservice.vo.UserInfoVO;
import com.lming.chcservice.entity.UserInfo;
import org.springframework.beans.BeanUtils;

public class UserInfo2UserInfoVOConverter {

    public static UserInfoVO convert(UserInfo userInfo){
        UserInfoVO userInfoVO = new UserInfoVO();
        BeanUtils.copyProperties(userInfo,userInfoVO);
        return userInfoVO;
    }
}
