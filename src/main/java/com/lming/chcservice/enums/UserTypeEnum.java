package com.lming.chcservice.enums;

import lombok.Getter;

/**
 * 用户类型枚举
 */
@Getter
public enum UserTypeEnum {


    USER_PATIENT("1","个人"),
    USER_DOCTOR("2","医生"),
    USER_HOSPITAL("3","社区医院"),
    USER_CORP("4","药商"),
    ;
    private String code;

    private String msg;

    UserTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
