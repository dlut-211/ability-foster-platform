package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnGetAuditFileWithBLOBs extends FnGetAuditFile {
    private byte[] permissionBitmask;

    private byte[] serverPrincipalSid;

    private byte[] targetServerPrincipalSid;

    private byte[] sequenceGroupId;

    public byte[] getPermissionBitmask() {
        return permissionBitmask;
    }

    public void setPermissionBitmask(byte[] permissionBitmask) {
        this.permissionBitmask = permissionBitmask;
    }

    public byte[] getServerPrincipalSid() {
        return serverPrincipalSid;
    }

    public void setServerPrincipalSid(byte[] serverPrincipalSid) {
        this.serverPrincipalSid = serverPrincipalSid;
    }

    public byte[] getTargetServerPrincipalSid() {
        return targetServerPrincipalSid;
    }

    public void setTargetServerPrincipalSid(byte[] targetServerPrincipalSid) {
        this.targetServerPrincipalSid = targetServerPrincipalSid;
    }

    public byte[] getSequenceGroupId() {
        return sequenceGroupId;
    }

    public void setSequenceGroupId(byte[] sequenceGroupId) {
        this.sequenceGroupId = sequenceGroupId;
    }
}