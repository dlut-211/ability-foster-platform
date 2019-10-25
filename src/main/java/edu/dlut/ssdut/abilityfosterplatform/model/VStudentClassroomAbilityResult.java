package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class VStudentClassroomAbilityResult {

    @Id
    private Integer id;

    private Integer studentId;

    private Integer classroomId;

    private String classroomName;

    @Column(name = "name_exp_4")
    private String nameExp4;

    @Column(name = "name_exp_5")
    private String nameExp5;

}