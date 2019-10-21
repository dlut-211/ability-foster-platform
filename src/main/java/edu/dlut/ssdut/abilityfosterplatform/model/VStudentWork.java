package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Entity
@Table(name = "v_classroom_student_info")
public class VStudentWork {

    @Column(name = "studentId")
    private Integer studentId;

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "termType")
    private Integer termType;

    @Column(name = "beginDate")
    private Date beginDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "status")
    private Integer status;

}
