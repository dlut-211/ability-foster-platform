package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysphfg {
    private Integer dbfragid;

    private Integer phfgid;

    private Integer fgid;

    private String type;

    private String fgguid;

    private Integer lgfgid;

    private Integer status;

    private String name;

    public Integer getDbfragid() {
        return dbfragid;
    }

    public void setDbfragid(Integer dbfragid) {
        this.dbfragid = dbfragid;
    }

    public Integer getPhfgid() {
        return phfgid;
    }

    public void setPhfgid(Integer phfgid) {
        this.phfgid = phfgid;
    }

    public Integer getFgid() {
        return fgid;
    }

    public void setFgid(Integer fgid) {
        this.fgid = fgid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getFgguid() {
        return fgguid;
    }

    public void setFgguid(String fgguid) {
        this.fgguid = fgguid == null ? null : fgguid.trim();
    }

    public Integer getLgfgid() {
        return lgfgid;
    }

    public void setLgfgid(Integer lgfgid) {
        this.lgfgid = lgfgid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}