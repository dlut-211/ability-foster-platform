package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VKnowledgeScore {

    private Integer courseId;

    private Integer classroomId;

    private Integer knowledgeId;

    private Integer workKnowledgeId;

    private String knowledgeName;

    private Integer studentId;

    private Integer score;

    private BigDecimal avgScore;

}