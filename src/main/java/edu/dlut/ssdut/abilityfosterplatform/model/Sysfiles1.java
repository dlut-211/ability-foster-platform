package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysfiles1 {
    private Integer status;

    private Short fileid;

    private String name;

    private String filename;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Short getFileid() {
        return fileid;
    }

    public void setFileid(Short fileid) {
        this.fileid = fileid;
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