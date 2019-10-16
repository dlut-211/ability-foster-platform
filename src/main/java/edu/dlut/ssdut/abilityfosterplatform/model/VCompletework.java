package edu.dlut.ssdut.abilityfosterplatform.model;

public class VCompletework {
    private Integer courseid;

    private Integer classroomid;

    private Integer chapterid;

    private String chaptername;

    private Integer studentid;

    private Integer completecount;

    private Integer studentworkid;

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

    public Integer getCompletecount() {
        return completecount;
    }

    public void setCompletecount(Integer completecount) {
        this.completecount = completecount;
    }

    public Integer getStudentworkid() {
        return studentworkid;
    }

    public void setStudentworkid(Integer studentworkid) {
        this.studentworkid = studentworkid;
    }
}