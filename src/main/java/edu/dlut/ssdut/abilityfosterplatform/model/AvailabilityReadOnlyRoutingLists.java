package edu.dlut.ssdut.abilityfosterplatform.model;

public class AvailabilityReadOnlyRoutingLists {
    private String replicaId;

    private Integer routingPriority;

    private String readOnlyReplicaId;

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId == null ? null : replicaId.trim();
    }

    public Integer getRoutingPriority() {
        return routingPriority;
    }

    public void setRoutingPriority(Integer routingPriority) {
        this.routingPriority = routingPriority;
    }

    public String getReadOnlyReplicaId() {
        return readOnlyReplicaId;
    }

    public void setReadOnlyReplicaId(String readOnlyReplicaId) {
        this.readOnlyReplicaId = readOnlyReplicaId == null ? null : readOnlyReplicaId.trim();
    }
}