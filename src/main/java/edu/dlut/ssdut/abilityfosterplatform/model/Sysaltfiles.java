package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysaltfiles {
    private Short fileid;

    private Short groupid;

    private Integer size;

    private Integer maxsize;

    private Integer growth;

    private Integer status;

    private Integer perf;

    private Short dbid;

    private String name;

    private String filename;

    public Short getFileid() {
        return fileid;
    }

    public void setFileid(Short fileid) {
        this.fileid = fileid;
    }

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPerf() {
        return perf;
    }

    public void setPerf(Integer perf) {
        this.perf = perf;
    }

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }
}