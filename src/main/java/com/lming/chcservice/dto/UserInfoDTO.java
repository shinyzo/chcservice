package com.lming.chcservice.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
public class UserInfoDTO {

    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String loginName;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 出生年月日
     */
    private Date birthday;
    /**
     * 手机号码唯一
     */
    private String mobileNo;
    /**
     * 用户类型
     */
    private String usertype;
    /**
     * 用户状态
     */
    private String userStatus;
    /**
     * 登录次数
     */
    private Integer loginCount;
    /**
     * 上次登录ip
     */
    private String lastLoginIp;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 前后台保证用户的口令令牌
     */
    private String token;
}
