package edu.dlut.ssdut.abilityfosterplatform.model;

public class ServiceContractMessageUsages {
    private Integer serviceContractId;

    private Integer messageTypeId;

    private Boolean isSentByInitiator;

    private Boolean isSentByTarget;

    public Integer getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(Integer serviceContractId) {
        this.serviceContractId = serviceContractId;
    }

    public Integer getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(Integer messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public Boolean getIsSentByInitiator() {
        return isSentByInitiator;
    }

    public void setIsSentByInitiator(Boolean isSentByInitiator) {
        this.isSentByInitiator = isSentByInitiator;
    }

    public Boolean getIsSentByTarget() {
        return isSentByTarget;
    }

    public void setIsSentByTarget(Boolean isSentByTarget) {
        this.isSentByTarget = isSentByTarget;
    }
}