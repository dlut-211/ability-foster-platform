package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysprufiles {
    private Integer dbfragid;

    private Integer fileid;

    private Integer grpid;

    private Integer status;

    private Byte filetype;

    private Byte filestate;

    private Integer size;

    private Integer maxsize;

    private Integer growth;

    private String lname;

    private String pname;

    private String fileguid;

    private Integer internalstatus;

    private String diffbaseguid;

    private Date diffbasetime;

    private String forkguid;

    private Long forkvc;

    private String redostartforkguid;

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

    public Integer getGrpid() {
        return grpid;
    }

    public void setGrpid(Integer grpid) {
        this.grpid = grpid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Byte getFiletype() {
        return filetype;
    }

    public void setFiletype(Byte filetype) {
        this.filetype = filetype;
    }

    public Byte getFilestate() {
        return filestate;
    }

    public void setFilestate(Byte filestate) {
        this.filestate = filestate;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getMaxsize() {
        return maxsize;
    }

    public void setMaxsize(Integer maxsize) {
        this.maxsize = maxsize;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getFileguid() {
        return fileguid;
    }

    public void setFileguid(String fileguid) {
        this.fileguid = fileguid == null ? null : fileguid.trim();
    }

    public Integer getInternalstatus() {
        return internalstatus;
    }

    public void setInternalstatus(Integer internalstatus) {
        this.internalstatus = internalstatus;
    }

    public String getDiffbaseguid() {
        return diffbaseguid;
    }

    public void setDiffbaseguid(String diffbaseguid) {
        this.diffbaseguid = diffbaseguid == null ? null : diffbaseguid.trim();
    }

    public Date getDiffbasetime() {
        return diffbasetime;
    }

    public void setDiffbasetime(Date diffbasetime) {
        this.diffbasetime = diffbasetime;
    }

    public String getForkguid() {
        return forkguid;
    }

    public void setForkguid(String forkguid) {
        this.forkguid = forkguid == null ? null : forkguid.trim();
    }

    public Long getForkvc() {
        return forkvc;
    }

    public void setForkvc(Long forkvc) {
        this.forkvc = forkvc;
    }

    public String getRedostartforkguid() {
        return redostartforkguid;
    }

    public void setRedostartforkguid(String redostartforkguid) {
        this.redostartforkguid = redostartforkguid == null ? null : redostartforkguid.trim();
    }
}