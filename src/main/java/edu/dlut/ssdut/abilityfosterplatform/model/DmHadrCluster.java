package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmHadrCluster {
    private String clusterName;

    private Byte quorumType;

    private String quorumTypeDesc;

    private Byte quorumState;

    private String quorumStateDesc;

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName == null ? null : clusterName.trim();
    }

    public Byte getQuorumType() {
        return quorumType;
    }

    public void setQuorumType(Byte quorumType) {
        this.quorumType = quorumType;
    }

    public String getQuorumTypeDesc() {
        return quorumTypeDesc;
    }

    public void setQuorumTypeDesc(String quorumTypeDesc) {
        this.quorumTypeDesc = quorumTypeDesc == null ? null : quorumTypeDesc.trim();
    }

    public Byte getQuorumState() {
        return quorumState;
    }

    public void setQuorumState(Byte quorumState) {
        this.quorumState = quorumState;
    }

    public String getQuorumStateDesc() {
        return quorumStateDesc;
    }

    public void setQuorumStateDesc(String quorumStateDesc) {
        this.quorumStateDesc = quorumStateDesc == null ? null : quorumStateDesc.trim();
    }
}