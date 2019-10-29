package edu.dlut.ssdut.abilityfosterplatform.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "v_student_work")
public class VStudentWork {

    @Id
    private Integer id;

    private Integer classroomStudentId;

    private Integer score;

    private String workMessage;

    private Integer classroomWorkId;

    private String studentNumber;

    private String studentName;

    private Date submitTime;

    private Long useTime;

    private Integer submitCount;

    private Integer isSubmit;

    @JsonIgnore
    private String workPath;

}