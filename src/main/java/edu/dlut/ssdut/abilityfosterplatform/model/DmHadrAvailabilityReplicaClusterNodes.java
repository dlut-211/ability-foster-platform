package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmHadrAvailabilityReplicaClusterNodes {
    private String groupName;

    private String replicaServerName;

    private String nodeName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getReplicaServerName() {
        return replicaServerName;
    }

    public void setReplicaServerName(String replicaServerName) {
        this.replicaServerName = replicaServerName == null ? null : replicaServerName.trim();
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }
}