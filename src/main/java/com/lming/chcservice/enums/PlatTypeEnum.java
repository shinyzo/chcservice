package com.lming.chcservice.enums;

/**
 * 平台类型枚举
 */
public enum PlatTypeEnum {

    P("个人版"),
    D("医生版"),;
    private String desc;

    PlatTypeEnum(String desc) {

        this.desc = desc;
    }

    public static PlatTypeEnum getPlatTypeEnum(String type) {
        for (PlatTypeEnum s : PlatTypeEnum.values()) {
            if (s.toString().equals(type)) {
                return s;
            }
        }
        return null;
    }


}