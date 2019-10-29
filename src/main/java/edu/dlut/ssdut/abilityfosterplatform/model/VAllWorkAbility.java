package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class VAllWorkAbility {

    private Integer classroomId;

    private String classroomName;

    private BigDecimal dailyPerformanceWeight;

    private BigDecimal testPerformanceWeight;

    private Integer studentId;

    private String studentNumber;

    private String studentName;

    private Integer score;

    private String workMessage;

    private Integer classroomWorkId;

    private Date layoutTime;

    private Integer classroomWorkStatus;

    private String workName;

    private String workDescription;

    private Long count1;

    private BigDecimal workScore;

    private BigDecimal workScoreSum;

    private Integer workId;

    private Integer courseId;

    private Integer subjectId;

    private Integer knowledgeId;

    private Integer abilityId;

    private String name;

    private String abilityName;

}