package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysfilegroups {
    private Short groupid;

    private Short allocpolicy;

    private Integer status;

    private String groupname;

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Short getAllocpolicy() {
        return allocpolicy;
    }

    public void setAllocpolicy(Short allocpolicy) {
        this.allocpolicy = allocpolicy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }
}