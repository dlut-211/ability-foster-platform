package edu.dlut.ssdut.abilityfosterplatform.model;

public class ClassroomTestRelation {
    private Integer id;

    private Integer classroomId;

    private Long knowledgeTestId;

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

    public Long getKnowledgeTestId() {
        return knowledgeTestId;
    }

    public void setKnowledgeTestId(Long knowledgeTestId) {
        this.knowledgeTestId = knowledgeTestId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}