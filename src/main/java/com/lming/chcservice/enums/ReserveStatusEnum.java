package com.lming.chcservice.enums;

/**
 * 预约状态
 */
public enum ReserveStatusEnum {

    IN("1", "预约中"),
    SUCC("2", "预约成功"),
    CANCEL("3", "预约拒绝"),;

    private String code;

    private String msg;

    ReserveStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
