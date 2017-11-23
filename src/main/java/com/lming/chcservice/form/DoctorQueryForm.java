package com.lming.chcservice.form;

import lombok.Data;

/**
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@Data
public class DoctorQueryForm extends PageForm {

    /**
     * 科室id
     */
    private String subjectId;
    /**
     * 级别id
     */
    private Integer levelId;
    /**
     * 医院id
     */
    private String hospitalId;
    /**
     * 医师姓名
     */
    private String doctorName;
    /**
     * 医师id
     */
    private String doctorId;

    public DoctorQueryForm() {
    }
    public DoctorQueryForm(Integer pageNum, Integer pageSize) {
        super(pageNum, pageSize);
    }

}
