package edu.dlut.ssdut.abilityfosterplatform.model;

import org.springframework.data.annotation.Id;

public class ClassroomTestRelation {
    @Id
    private Integer id;

    private Integer classroomId;

    private Integer knowledgeTestId;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getKnowledgeTestId() {
        return knowledgeTestId;
    }

    public void setKnowledgeTestId(Integer knowledgeTestId) {
        this.knowledgeTestId = knowledgeTestId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}