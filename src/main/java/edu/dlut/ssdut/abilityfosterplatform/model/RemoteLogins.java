package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class RemoteLogins {
    private Integer serverId;

    private String remoteName;

    private Integer localPrincipalId;

    private Date modifyDate;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public String getRemoteName() {
        return remoteName;
    }

    public void setRemoteName(String remoteName) {
        this.remoteName = remoteName == null ? null : remoteName.trim();
    }

    public Integer getLocalPrincipalId() {
        return localPrincipalId;
    }

    public void setLocalPrincipalId(Integer localPrincipalId) {
        this.localPrincipalId = localPrincipalId;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}