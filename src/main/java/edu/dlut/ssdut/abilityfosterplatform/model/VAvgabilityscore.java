package edu.dlut.ssdut.abilityfosterplatform.model;

public class VAvgabilityscore {
    private Integer subjectid;

    private Integer courseid;

    private Integer classroomid;

    private Integer abilityid;

    private String abilityname;

    private Integer avgscore;

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

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

    public Integer getAvgscore() {
        return avgscore;
    }

    public void setAvgscore(Integer avgscore) {
        this.avgscore = avgscore;
    }
}