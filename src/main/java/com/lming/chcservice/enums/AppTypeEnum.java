package com.lming.chcservice.enums;

/**
 * App类型
 */
public enum  AppTypeEnum {

    H5("H5版本"),

    Android("安卓版本"),

    IOS("IOS版本"),
            ;

    private String desc;

    AppTypeEnum(String desc) {

        this.desc = desc;
    }

    public static AppTypeEnum getPlatTypeEnum(String type) {
        for (AppTypeEnum appTypeEnum : AppTypeEnum.values()) {
            if (appTypeEnum.toString().equals(type)) {
                return appTypeEnum;
            }
        }
        return null;
    }

}
