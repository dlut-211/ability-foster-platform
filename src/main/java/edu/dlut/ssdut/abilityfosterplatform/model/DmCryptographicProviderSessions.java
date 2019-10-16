package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmCryptographicProviderSessions {
    private Integer providerId;

    private String identity;

    private Short spid;

    private byte[] sessionHandle;

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public Short getSpid() {
        return spid;
    }

    public void setSpid(Short spid) {
        this.spid = spid;
    }

    public byte[] getSessionHandle() {
        return sessionHandle;
    }

    public void setSessionHandle(byte[] sessionHandle) {
        this.sessionHandle = sessionHandle;
    }
}