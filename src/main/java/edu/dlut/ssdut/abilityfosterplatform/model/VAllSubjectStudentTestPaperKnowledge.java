package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class VAllSubjectStudentTestPaperKnowledge {
    private Integer subjectId;

    private String coursename;

    private Integer courseId;

    private String classroomName;

    private BigDecimal testPerformanceWeight;

    private Integer studentId;

    private String studentName;

    private String studentNumber;

    private Integer score;

    private Integer testPaperDetailId;

    private Integer detailNumber;

    private Integer detailType;

    private Integer testPaperDetailScore;

    private Integer knowledgeId;

    private BigDecimal weight;

    private BigDecimal testTitleScore;

    private BigDecimal testTitleScoreSum;

    private Integer classroomId;

    private Integer sid;

    private String knowledgeName;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName == null ? null : classroomName.trim();
    }

    public BigDecimal getTestPerformanceWeight() {
        return testPerformanceWeight;
    }

    public void setTestPerformanceWeight(BigDecimal testPerformanceWeight) {
        this.testPerformanceWeight = testPerformanceWeight;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber == null ? null : studentNumber.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTestPaperDetailId() {
        return testPaperDetailId;
    }

    public void setTestPaperDetailId(Integer testPaperDetailId) {
        this.testPaperDetailId = testPaperDetailId;
    }

    public Integer getDetailNumber() {
        return detailNumber;
    }

    public void setDetailNumber(Integer detailNumber) {
        this.detailNumber = detailNumber;
    }

    public Integer getDetailType() {
        return detailType;
    }

    public void setDetailType(Integer detailType) {
        this.detailType = detailType;
    }

    public Integer getTestPaperDetailScore() {
        return testPaperDetailScore;
    }

    public void setTestPaperDetailScore(Integer testPaperDetailScore) {
        this.testPaperDetailScore = testPaperDetailScore;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getTestTitleScore() {
        return testTitleScore;
    }

    public void setTestTitleScore(BigDecimal testTitleScore) {
        this.testTitleScore = testTitleScore;
    }

    public BigDecimal getTestTitleScoreSum() {
        return testTitleScoreSum;
    }

    public void setTestTitleScoreSum(BigDecimal testTitleScoreSum) {
        this.testTitleScoreSum = testTitleScoreSum;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName == null ? null : knowledgeName.trim();
    }
}