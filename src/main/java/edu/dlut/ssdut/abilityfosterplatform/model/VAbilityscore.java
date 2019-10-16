package edu.dlut.ssdut.abilityfosterplatform.model;

public class VAbilityscore {
    private Integer courseid;

    private Integer classroomid;

    private Integer abilityid;

    private String abilityname;

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

    public Integer getAbilityid() {
        return abilityid;
    }

    public void setAbilityid(Integer abilityid) {
        this.abilityid = abilityid;
    }

    public String getAbilityname() {
        return abilityname;
    }

    public void setAbilityname(String abilityname) {
        this.abilityname = abilityname == null ? null : abilityname.trim();
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