package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class FulltextStoplists {
    private Integer stoplistId;

    private String name;

    private Date createDate;

    private Date modifyDate;

    private Integer principalId;

    public Integer getStoplistId() {
        return stoplistId;
    }

    public void setStoplistId(Integer stoplistId) {
        this.stoplistId = stoplistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }
}