package edu.dlut.ssdut.abilityfosterplatform.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="V_studentclassroomabilityresult")
public class VStudentclassroomabilityresult {

    @Id
    @Column(name = "studentid")
    private Integer studentid;
    @Column(name = "classroomid")
    private Integer classroomid;
    @Column(name = "classroomname")
    private String classroomname;
    @Column(name = "notpass")
    private String notpass;
    @Column(name = "ispass")
    private String ispass;

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

    public String getNotpass() {
        return notpass;
    }

    public void setNotpass(String notpass) {
        this.notpass = notpass == null ? null : notpass.trim();
    }

    public String getIspass() {
        return ispass;
    }

    public void setIspass(String ispass) {
        this.ispass = ispass == null ? null : ispass.trim();
    }
}
