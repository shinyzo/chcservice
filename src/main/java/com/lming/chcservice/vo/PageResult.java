package com.lming.chcservice.vo;

import lombok.Data;

import java.util.List;
@Data
public class PageResult {

    private Long total;

    private List<?> rows;
}
