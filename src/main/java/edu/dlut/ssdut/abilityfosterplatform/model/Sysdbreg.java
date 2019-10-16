package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysdbreg {
    private Integer id;

    private String name;

    private Integer status;

    private Integer status2;

    private Integer category;

    private Date crdate;

    private Date modified;

    private String svcbrkrguid;

    private Integer scope;

    private Byte cmptlevel;

    private byte[] sid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus2() {
        return status2;
    }

    public void setStatus2(Integer status2) {
        this.status2 = status2;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getSvcbrkrguid() {
        return svcbrkrguid;
    }

    public void setSvcbrkrguid(String svcbrkrguid) {
        this.svcbrkrguid = svcbrkrguid == null ? null : svcbrkrguid.trim();
    }

    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public Byte getCmptlevel() {
        return cmptlevel;
    }

    public void setCmptlevel(Byte cmptlevel) {
        this.cmptlevel = cmptlevel;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }
}