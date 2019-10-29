package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class VStudentTestPaper {

    @Id
    private  Integer id;

    private String studentNumber;

    private String studentName;

    private Integer testPaperId;

    private Integer detailType;

    private Integer detailNumber;

    private Integer detailScore;

    private Integer score;

}