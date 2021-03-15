package edu.dlut.ssdut.abilityfosterplatform.model;

public class StudentKnowledgeTestRelation {
    private Long id;

    private Integer studentId;

    private Long knowledgeTestId;

    private Integer isCorrect;

    private Integer classroomId;

    private String ans;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Long getKnowledgeTestId() {
        return knowledgeTestId;
    }

    public void setKnowledgeTestId(Long knowledgeTestId) {
        this.knowledgeTestId = knowledgeTestId;
    }

    public Integer getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Integer isCorrect) {
        this.isCorrect = isCorrect;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans == null ? null : ans.trim();
    }
}