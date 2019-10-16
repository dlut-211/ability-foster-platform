package edu.dlut.ssdut.abilityfosterplatform.model;

public class VStudenttestpaper {
    private String studentnumber;

    private String studentname;

    private Integer testpaperid;

    private Integer detailtype;

    private Integer detailnumber;

    private Integer detailscore;

    private Integer score;

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

    public Integer getTestpaperid() {
        return testpaperid;
    }

    public void setTestpaperid(Integer testpaperid) {
        this.testpaperid = testpaperid;
    }

    public Integer getDetailtype() {
        return detailtype;
    }

    public void setDetailtype(Integer detailtype) {
        this.detailtype = detailtype;
    }

    public Integer getDetailnumber() {
        return detailnumber;
    }

    public void setDetailnumber(Integer detailnumber) {
        this.detailnumber = detailnumber;
    }

    public Integer getDetailscore() {
        return detailscore;
    }

    public void setDetailscore(Integer detailscore) {
        this.detailscore = detailscore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}