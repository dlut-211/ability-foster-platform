package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysdbfrag {
    private Integer dbid;

    private Integer fragid;

    private String name;

    private Integer brickid;

    private Integer pruid;

    private Integer status;

    public Integer getDbid() {
        return dbid;
    }

    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    public Integer getFragid() {
        return fragid;
    }

    public void setFragid(Integer fragid) {
        this.fragid = fragid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBrickid() {
        return brickid;
    }

    public void setBrickid(Integer brickid) {
        this.brickid = brickid;
    }

    public Integer getPruid() {
        return pruid;
    }

    public void setPruid(Integer pruid) {
        this.pruid = pruid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}