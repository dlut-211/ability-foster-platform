package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysftstops {
    private Integer stoplistid;

    private String stopword;

    private Integer lcid;

    private Byte status;

    public Integer getStoplistid() {
        return stoplistid;
    }

    public void setStoplistid(Integer stoplistid) {
        this.stoplistid = stoplistid;
    }

    public String getStopword() {
        return stopword;
    }

    public void setStopword(String stopword) {
        this.stopword = stopword == null ? null : stopword.trim();
    }

    public Integer getLcid() {
        return lcid;
    }

    public void setLcid(Integer lcid) {
        this.lcid = lcid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}