package edu.dlut.ssdut.abilityfosterplatform.model;

public class RemoteServiceBindings {
    private String name;

    private Integer remoteServiceBindingId;

    private Integer principalId;

    private String remoteServiceName;

    private Integer serviceContractId;

    private Integer remotePrincipalId;

    private Boolean isAnonymousOn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRemoteServiceBindingId() {
        return remoteServiceBindingId;
    }

    public void setRemoteServiceBindingId(Integer remoteServiceBindingId) {
        this.remoteServiceBindingId = remoteServiceBindingId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getRemoteServiceName() {
        return remoteServiceName;
    }

    public void setRemoteServiceName(String remoteServiceName) {
        this.remoteServiceName = remoteServiceName == null ? null : remoteServiceName.trim();
    }

    public Integer getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(Integer serviceContractId) {
        this.serviceContractId = serviceContractId;
    }

    public Integer getRemotePrincipalId() {
        return remotePrincipalId;
    }

    public void setRemotePrincipalId(Integer remotePrincipalId) {
        this.remotePrincipalId = remotePrincipalId;
    }

    public Boolean getIsAnonymousOn() {
        return isAnonymousOn;
    }

    public void setIsAnonymousOn(Boolean isAnonymousOn) {
        this.isAnonymousOn = isAnonymousOn;
    }
}