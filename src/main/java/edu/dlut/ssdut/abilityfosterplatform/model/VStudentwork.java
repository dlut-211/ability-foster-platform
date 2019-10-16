package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class VStudentwork {
    private Integer id;

    private Integer classroomstudentid;

    private Integer score;

    private String workmessage;

    private Integer classroomworkid;

    private String studentnumber;

    private String studentname;

    private Date submittime;

    private Integer usetime;

    private Integer submitcount;

    private Integer issubmit;

    private String workpath;

    private byte[] versionnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassroomstudentid() {
        return classroomstudentid;
    }

    public void setClassroomstudentid(Integer classroomstudentid) {
        this.classroomstudentid = classroomstudentid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getWorkmessage() {
        return workmessage;
    }

    public void setWorkmessage(String workmessage) {
        this.workmessage = workmessage == null ? null : workmessage.trim();
    }

    public Integer getClassroomworkid() {
        return classroomworkid;
    }

    public void setClassroomworkid(Integer classroomworkid) {
        this.classroomworkid = classroomworkid;
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber == null ? null : studentnumber.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public Date getSubmittime() {
        return submittime;
    }

    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
    }

    public Integer getUsetime() {
        return usetime;
    }

    public void setUsetime(Integer usetime) {
        this.usetime = usetime;
    }

    public Integer getSubmitcount() {
        return submitcount;
    }

    public void setSubmitcount(Integer submitcount) {
        this.submitcount = submitcount;
    }

    public Integer getIssubmit() {
        return issubmit;
    }

    public void setIssubmit(Integer issubmit) {
        this.issubmit = issubmit;
    }

    public String getWorkpath() {
        return workpath;
    }

    public void setWorkpath(String workpath) {
        this.workpath = workpath == null ? null : workpath.trim();
    }

    public byte[] getVersionnumber() {
        return versionnumber;
    }

    public void setVersionnumber(byte[] versionnumber) {
        this.versionnumber = versionnumber;
    }
}