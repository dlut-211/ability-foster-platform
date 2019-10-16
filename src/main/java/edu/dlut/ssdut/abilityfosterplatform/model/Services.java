package edu.dlut.ssdut.abilityfosterplatform.model;

public class Services {
    private String name;

    private Integer serviceId;

    private Integer principalId;

    private Integer serviceQueueId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public Integer getServiceQueueId() {
        return serviceQueueId;
    }

    public void setServiceQueueId(Integer serviceQueueId) {
        this.serviceQueueId = serviceQueueId;
    }
}