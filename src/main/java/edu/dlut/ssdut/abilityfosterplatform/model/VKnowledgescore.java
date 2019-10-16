package edu.dlut.ssdut.abilityfosterplatform.model;

public class VKnowledgescore {
    private Integer courseid;

    private Integer classroomid;

    private Integer knowledgeid;

    private Integer workknowledgeid;

    private String knowledgename;

    private Integer studentid;

    private Integer score;

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

    public Integer getWorkknowledgeid() {
        return workknowledgeid;
    }

    public void setWorkknowledgeid(Integer workknowledgeid) {
        this.workknowledgeid = workknowledgeid;
    }

    public String getKnowledgename() {
        return knowledgename;
    }

    public void setKnowledgename(String knowledgename) {
        this.knowledgename = knowledgename == null ? null : knowledgename.trim();
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAvgscore() {
        return avgscore;
    }

    public void setAvgscore(Integer avgscore) {
        this.avgscore = avgscore;
    }
}