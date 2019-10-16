package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmExecSessionsWithBLOBs extends DmExecSessions {
    private byte[] securityId;

    private byte[] contextInfo;

    private byte[] originalSecurityId;

    public byte[] getSecurityId() {
        return securityId;
    }

    public void setSecurityId(byte[] securityId) {
        this.securityId = securityId;
    }

    public byte[] getContextInfo() {
        return contextInfo;
    }

    public void setContextInfo(byte[] contextInfo) {
        this.contextInfo = contextInfo;
    }

    public byte[] getOriginalSecurityId() {
        return originalSecurityId;
    }

    public void setOriginalSecurityId(byte[] originalSecurityId) {
        this.originalSecurityId = originalSecurityId;
    }
}