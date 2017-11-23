package com.lming.chcservice.form;

import lombok.Data;

@Data
public class ProductQueryForm {

    private String productName;

    private String categoryId;

    private String status;

    private String productCode;

    private String productNo;
}
