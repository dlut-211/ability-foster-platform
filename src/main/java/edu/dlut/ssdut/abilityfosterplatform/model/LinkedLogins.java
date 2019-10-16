package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class LinkedLogins {
    private Integer serverId;

    private Integer localPrincipalId;

    private Boolean usesSelfCredential;

    private String remoteName;

    private Date modifyDate;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public Integer getLocalPrincipalId() {
        return localPrincipalId;
    }

    public void setLocalPrincipalId(Integer localPrincipalId) {
        this.localPrincipalId = localPrincipalId;
    }

    public Boolean getUsesSelfCredential() {
        return usesSelfCredential;
    }

    public void setUsesSelfCredential(Boolean usesSelfCredential) {
        this.usesSelfCredential = usesSelfCredential;
    }

    public String getRemoteName() {
        return remoteName;
    }

    public void setRemoteName(String remoteName) {
        this.remoteName = remoteName == null ? null : remoteName.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}