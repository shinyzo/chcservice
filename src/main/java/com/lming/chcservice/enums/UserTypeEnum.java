package com.lming.chcservice.enums;

import lombok.Getter;

/**
 * 用户类型枚举
 */
@Getter
public enum UserTypeEnum {

    USER_DOCTOR("1","医生"),
    USER_PATIENT("2","病人"),
    USER_HOSPITAL("3","社区医院"),
    USER_CORP("4","供货商"),
    ;
    private String code;

    private String msg;

    UserTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
