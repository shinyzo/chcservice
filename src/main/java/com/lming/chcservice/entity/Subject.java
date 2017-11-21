package com.lming.chcservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 医院科室
 */
@Entity
@Data
public class Subject {
    /**
     * 科室id
     */
    @Id
    private String subjectId;
    /**
     * 科室名称
     */
    private String subjectName;
}
