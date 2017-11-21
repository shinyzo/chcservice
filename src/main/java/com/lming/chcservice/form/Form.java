package com.lming.chcservice.form;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


@Data
public class Form {
    /**
     * 版本号
     */
    @NotEmpty(message = "版本号不允许为空")
    private String version;
    /**
     * app类型
     * H5,
     * Android
     * IOS
     */
    @NotEmpty(message = "APP类型不能为空")
    private String appType;
    /**
     * 字符编码
     * UTF-8
     */
    @NotEmpty(message = "字符编码不能为空")
    private String charset;
    /**
     * 来源类型
     * 个人版
     * 医生版
     */
    @NotEmpty(message = "平台类型不能为空")
    private String platType;

    /**
     * 随机数
     */
    @Length(min = 12, max = 32, message = "随机数应在12至32位之间")
    private String randomKey;

    /**
     * 前端加密数据
     */
    @NotEmpty(message = "签名不能为空")
    private String signData;


}
