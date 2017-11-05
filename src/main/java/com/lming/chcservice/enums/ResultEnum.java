package com.lming.chcservice.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    LOGIN_FAILED("100", "用户名或密码错误！"),

    OPENID_EMPTY("101", "openid为空"),
    USERTYPE_EMPTY("102", "用户权限id为空"),

    TOKEN_TIMEOUT("777","用户长时间未操作，超时退出"),
    ;

    private String code;

    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
