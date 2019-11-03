package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class VKnowledgeTestPaperScore {
    private Integer classroomStudentId;

    private Integer testPaperDetailId;

    private Double score;

    private Integer detailNumber;

    private Double scoreSum;

    private Integer testPaperId;

    private Integer knowledgeId;

    private Double weight;

    private String name;

    public Integer getClassroomStudentId() {
        return classroomStudentId;
    }

    public void setClassroomStudentId(Integer classroomStudentId) {
        this.classroomStudentId = classroomStudentId;
    }

    public Integer getTestPaperDetailId() {
        return testPaperDetailId;
    }

    public void setTestPaperDetailId(Integer testPaperDetailId) {
        this.testPaperDetailId = testPaperDetailId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getDetailNumber() {
        return detailNumber;
    }

    public void setDetailNumber(Integer detailNumber) {
        this.detailNumber = detailNumber;
    }

    public Double getScoreSum() {
        return scoreSum;
    }

    public void setScoreSum(Double scoreSum) {
        this.scoreSum = scoreSum;
    }

    public Integer getTestPaperId() {
        return testPaperId;
    }

    public void setTestPaperId(Integer testPaperId) {
        this.testPaperId = testPaperId;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}