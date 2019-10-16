package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmHadrInstanceNodeMap {
    private String agResourceId;

    private String instanceName;

    private String nodeName;

    public String getAgResourceId() {
        return agResourceId;
    }

    public void setAgResourceId(String agResourceId) {
        this.agResourceId = agResourceId == null ? null : agResourceId.trim();
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName == null ? null : instanceName.trim();
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }
}