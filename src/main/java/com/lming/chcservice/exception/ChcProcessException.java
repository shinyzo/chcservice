package com.lming.chcservice.exception;

import com.lming.chcservice.enums.ResultEnum;
import lombok.Getter;

/**
 * 处理过程中的异常
 */
@Getter
public class ChcProcessException extends RuntimeException{

    private String code;

    public ChcProcessException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public ChcProcessException(String code,String msg) {
        super(msg);
        this.code = code;
    }
}
