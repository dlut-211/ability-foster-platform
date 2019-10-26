package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
@Data
public class PStudentTestPaperDTO {
    @Id
    private Integer id;
    private String  studentNumber;
    private String studentName;
    private Integer testPaperId;
    private Integer detailType;
    private Integer detailNumber;
    private Integer score;
}
