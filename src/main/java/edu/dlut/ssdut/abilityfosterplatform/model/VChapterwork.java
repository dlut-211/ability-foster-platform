package edu.dlut.ssdut.abilityfosterplatform.model;

public class VChapterwork {
    private Integer courseid;

    private String coursename;

    private Integer classroomid;

    private String classroomname;

    private Integer chapterid;

    private String chaptername;

    private Integer studentid;

    private Integer completecount;

    private Integer workcount;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
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

    public Integer getCompletecount() {
        return completecount;
    }

    public void setCompletecount(Integer completecount) {
        this.completecount = completecount;
    }

    public Integer getWorkcount() {
        return workcount;
    }

    public void setWorkcount(Integer workcount) {
        this.workcount = workcount;
    }
}