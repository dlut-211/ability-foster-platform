package edu.dlut.ssdut.abilityfosterplatform.model;

import org.springframework.data.annotation.Id;

public class StudentKnowledgeTestRelation {
    @Id
    private Long id;

    private Integer studentId;

    private Long knowledgeTestId;

    private Integer isCorrect;

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
}