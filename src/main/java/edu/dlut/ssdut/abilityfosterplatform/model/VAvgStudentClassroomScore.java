package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "v_avg_student_classroom_score")
public class VAvgStudentClassroomScore {

    @Id
    private Long id;
    // Empty Id
    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "classroom_id")
    private Integer classroomId;

    @Column(name = "classroom_name")
    private String classroomName;

    @Column(name = "avg_score")
    private BigDecimal avgScore;

    @Column(name = "rank")
    private Integer rank;

}