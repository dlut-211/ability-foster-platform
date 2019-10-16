package edu.dlut.ssdut.abilityfosterplatform.model;

public class VStudentclassroompassability {
    private Integer studentid;

    private Integer classroomid;

    private String classroomname;

    private Integer abilityid;

    private String abilityname;

    private Integer ispass;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    public String getClassroomname() {
        return classroomname;
    }

    public void setClassroomname(String classroomname) {
        this.classroomname = classroomname == null ? null : classroomname.trim();
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

    public Integer getIspass() {
        return ispass;
    }

    public void setIspass(Integer ispass) {
        this.ispass = ispass;
    }
}