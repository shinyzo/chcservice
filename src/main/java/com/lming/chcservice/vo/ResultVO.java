package com.lming.chcservice.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVO<T> implements Serializable {


    private static final long serialVersionUID = 5679855537586185898L;

    private String code;

    private String msg;

    private T data;

}
