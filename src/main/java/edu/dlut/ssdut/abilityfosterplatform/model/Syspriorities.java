package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syspriorities {
    private Integer priorityId;

    private String name;

    private Integer serviceContractId;

    private Integer localServiceId;

    private String remoteServiceName;

    private Byte priority;

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(Integer serviceContractId) {
        this.serviceContractId = serviceContractId;
    }

    public Integer getLocalServiceId() {
        return localServiceId;
    }

    public void setLocalServiceId(Integer localServiceId) {
        this.localServiceId = localServiceId;
    }

    public String getRemoteServiceName() {
        return remoteServiceName;
    }

    public void setRemoteServiceName(String remoteServiceName) {
        this.remoteServiceName = remoteServiceName == null ? null : remoteServiceName.trim();
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }
}