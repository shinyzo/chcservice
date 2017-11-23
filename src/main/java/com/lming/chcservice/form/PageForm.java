package com.lming.chcservice.form;

import lombok.Data;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@Data
public class PageForm{
    /**
     * 页码
     */
    private Integer pageNum;
    /**
     * 每页显示条数
     */
    private Integer pageSize;

    public PageForm(){

    };

    public PageForm(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }
}
