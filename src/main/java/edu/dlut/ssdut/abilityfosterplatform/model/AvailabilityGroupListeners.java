package edu.dlut.ssdut.abilityfosterplatform.model;

public class AvailabilityGroupListeners {
    private String groupId;

    private String listenerId;

    private String dnsName;

    private Integer port;

    private Boolean isConformant;

    private String ipConfigurationStringFromCluster;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId == null ? null : listenerId.trim();
    }

    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName == null ? null : dnsName.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Boolean getIsConformant() {
        return isConformant;
    }

    public void setIsConformant(Boolean isConformant) {
        this.isConformant = isConformant;
    }

    public String getIpConfigurationStringFromCluster() {
        return ipConfigurationStringFromCluster;
    }

    public void setIpConfigurationStringFromCluster(String ipConfigurationStringFromCluster) {
        this.ipConfigurationStringFromCluster = ipConfigurationStringFromCluster == null ? null : ipConfigurationStringFromCluster.trim();
    }
}