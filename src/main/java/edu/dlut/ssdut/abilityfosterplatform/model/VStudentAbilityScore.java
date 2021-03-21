package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class VStudentAbilityScore {
    private Integer classroomid;

    private Integer studentid;

    private Integer knowledgeid;

    private BigDecimal score;

    private Integer abilityid;

    private BigDecimal abilityscore;

    public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getKnowledgeid() {
        return knowledgeid;
    }

    public void setKnowledgeid(Integer knowledgeid) {
        this.knowledgeid = knowledgeid;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Integer getAbilityid() {
        return abilityid;
    }

    public void setAbilityid(Integer abilityid) {
        this.abilityid = abilityid;
    }

    public BigDecimal getAbilityscore() {
        return abilityscore;
    }

    public void setAbilityscore(BigDecimal abilityscore) {
        this.abilityscore = abilityscore;
    }
}