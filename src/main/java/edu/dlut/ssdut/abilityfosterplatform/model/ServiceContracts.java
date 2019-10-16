package edu.dlut.ssdut.abilityfosterplatform.model;

public class ServiceContracts {
    private String name;

    private Integer serviceContractId;

    private Integer principalId;

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

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }
}