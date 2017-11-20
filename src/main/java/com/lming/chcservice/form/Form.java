package com.lming.chcservice.form;

import lombok.Data;

import javax.validation.Valid;

@Data
public class Form {
    /**
     * 版本号
     */
    private String version;
    /**
     * app类型
     * H5,
     * Android
     * IOS
     */
    private String appType;
    /**
     * 字符编码
     * UTF-8
     */
    private String charset;
    /**
     * 来源类型
     * 个人版
     * 医生版
     */
    private String platType;

    /**
     * 随机数
     */
    private String randomKey;

    /**
     * 前端加密数据
     */
    private String signData;


}
