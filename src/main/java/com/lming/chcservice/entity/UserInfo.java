package com.lming.chcservice.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 用户信息模型层
 */
@Entity
@Data
@DynamicUpdate
public class UserInfo {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 用户名
     */
    private String loginName;
    /**
     * 密码
     */
    private String loginPass;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 出生年月日
     */
    private Date birthday;
    /**
     * 手机号码唯一
     */
    private String mobileNo;
    /**
     * openid唯一,微信登录验证
     */
    private String openid;
    /**
     * 用户类型
     */
    private String usertype;
    /**
     * 角色id
     */
    private Integer roleId;
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

}
