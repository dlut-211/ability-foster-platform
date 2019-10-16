package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmHadrAvailabilityReplicaClusterStates {
    private String replicaId;

    private String replicaServerName;

    private String groupId;

    private Byte joinState;

    private String joinStateDesc;

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId == null ? null : replicaId.trim();
    }

    public String getReplicaServerName() {
        return replicaServerName;
    }

    public void setReplicaServerName(String replicaServerName) {
        this.replicaServerName = replicaServerName == null ? null : replicaServerName.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public Byte getJoinState() {
        return joinState;
    }

    public void setJoinState(Byte joinState) {
        this.joinState = joinState;
    }

    public String getJoinStateDesc() {
        return joinStateDesc;
    }

    public void setJoinStateDesc(String joinStateDesc) {
        this.joinStateDesc = joinStateDesc == null ? null : joinStateDesc.trim();
    }
}