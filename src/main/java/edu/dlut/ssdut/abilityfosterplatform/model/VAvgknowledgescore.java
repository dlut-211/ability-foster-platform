package edu.dlut.ssdut.abilityfosterplatform.model;

public class VAvgknowledgescore {
    private Integer courseid;

    private Integer classroomid;

    private Integer knowledgeid;

    private String knowledgename;

    private Integer workknowledgeid;

    private Integer avgscore;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    public Integer getKnowledgeid() {
        return knowledgeid;
    }

    public void setKnowledgeid(Integer knowledgeid) {
        this.knowledgeid = knowledgeid;
    }

    public String getKnowledgename() {
        return knowledgename;
    }

    public void setKnowledgename(String knowledgename) {
        this.knowledgename = knowledgename == null ? null : knowledgename.trim();
    }

    public Integer getWorkknowledgeid() {
        return workknowledgeid;
    }

    public void setWorkknowledgeid(Integer workknowledgeid) {
        this.workknowledgeid = workknowledgeid;
    }

    public Integer getAvgscore() {
        return avgscore;
    }

    public void setAvgscore(Integer avgscore) {
        this.avgscore = avgscore;
    }
}