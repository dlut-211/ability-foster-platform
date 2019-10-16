package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysdbfiles {
    private Integer dbfragid;

    private Integer fileid;

    private String fileguid;

    private String pname;

    public Integer getDbfragid() {
        return dbfragid;
    }

    public void setDbfragid(Integer dbfragid) {
        this.dbfragid = dbfragid;
    }

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public String getFileguid() {
        return fileguid;
    }

    public void setFileguid(String fileguid) {
        this.fileguid = fileguid == null ? null : fileguid.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }
}