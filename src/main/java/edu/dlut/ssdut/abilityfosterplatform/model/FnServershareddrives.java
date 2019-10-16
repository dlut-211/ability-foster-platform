package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnServershareddrives {
    private String drivename;

    public String getDrivename() {
        return drivename;
    }

    public void setDrivename(String drivename) {
        this.drivename = drivename == null ? null : drivename.trim();
    }
}