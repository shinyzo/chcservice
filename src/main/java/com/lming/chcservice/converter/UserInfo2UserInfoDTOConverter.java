package com.lming.chcservice.converter;

import com.lming.chcservice.dto.UserInfoDTO;
import com.lming.chcservice.entity.UserInfo;
import org.springframework.beans.BeanUtils;

public class UserInfo2UserInfoDTOConverter {

    public static UserInfoDTO convert(UserInfo userInfo){
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        BeanUtils.copyProperties(userInfo,userInfoDTO);
        return userInfoDTO;
    }
}
