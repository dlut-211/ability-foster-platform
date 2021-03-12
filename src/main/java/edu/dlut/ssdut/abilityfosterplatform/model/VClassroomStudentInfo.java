package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Data
@Entity
public class VClassroomStudentInfo {
    @Id
    private Integer id;

    private Integer studentId;

    private String code;

    private String name;

    private Integer termType;

    private Date beginDate;

    private Date endDate;

    private Integer status;

    private Integer classroomId;

}