package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class VStudentworkbychapter {
    private Integer courseid;

    private Integer classroomid;

    private String classroomname;

    private Integer chapterid;

    private String chaptername;

    private Integer studentid;

    private String description;

    private String workname;

    private Integer score;

    private Date createdontime;

    private Integer studentworkid;

    private Date layouttime;

    private Integer issubmit;

    private Boolean isscore;

    private Date endtime;

    private byte[] studentworkverionnum;

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

    public String getClassroomname() {
        return classroomname;
    }

    public void setClassroomname(String classroomname) {
        this.classroomname = classroomname == null ? null : classroomname.trim();
    }

    public Integer getChapterid() {
        return chapterid;
    }

    public void setChapterid(Integer chapterid) {
        this.chapterid = chapterid;
    }

    public String getChaptername() {
        return chaptername;
    }

    public void setChaptername(String chaptername) {
        this.chaptername = chaptername == null ? null : chaptername.trim();
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname == null ? null : workname.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getCreatedontime() {
        return createdontime;
    }

    public void setCreatedontime(Date createdontime) {
        this.createdontime = createdontime;
    }

    public Integer getStudentworkid() {
        return studentworkid;
    }

    public void setStudentworkid(Integer studentworkid) {
        this.studentworkid = studentworkid;
    }

    public Date getLayouttime() {
        return layouttime;
    }

    public void setLayouttime(Date layouttime) {
        this.layouttime = layouttime;
    }

    public Integer getIssubmit() {
        return issubmit;
    }

    public void setIssubmit(Integer issubmit) {
        this.issubmit = issubmit;
    }

    public Boolean getIsscore() {
        return isscore;
    }

    public void setIsscore(Boolean isscore) {
        this.isscore = isscore;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public byte[] getStudentworkverionnum() {
        return studentworkverionnum;
    }

    public void setStudentworkverionnum(byte[] studentworkverionnum) {
        this.studentworkverionnum = studentworkverionnum;
    }
}