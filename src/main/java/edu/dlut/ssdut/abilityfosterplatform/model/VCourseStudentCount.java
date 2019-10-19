package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VCourseStudentCount {

    private Integer id;

    private String code;

    private String name;

    private String description;

    private String createdByName;

    private BigDecimal yesCount;

    private BigDecimal noCount;

}