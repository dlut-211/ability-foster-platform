package edu.dlut.ssdut.abilityfosterplatform.model;

public class VCourseworkrate {
    private Integer courseid;

    private String workrate;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getWorkrate() {
        return workrate;
    }

    public void setWorkrate(String workrate) {
        this.workrate = workrate == null ? null : workrate.trim();
    }
}