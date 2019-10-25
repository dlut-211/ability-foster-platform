package edu.dlut.ssdut.abilityfosterplatform.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class VAvgKnowledgeScore {

    private Integer courseId;

    private Integer classroomId;

    private Integer knowledgeId;

    private String knowledgeName;

    private Integer workKnowledgeId;

    private BigDecimal avgScore;

}