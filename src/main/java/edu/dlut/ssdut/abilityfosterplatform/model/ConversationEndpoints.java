package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class ConversationEndpoints {
    private String conversationHandle;

    private String conversationId;

    private Boolean isInitiator;

    private Integer serviceContractId;

    private String conversationGroupId;

    private Integer serviceId;

    private Date lifetime;

    private String state;

    private String stateDesc;

    private String farService;

    private String farBrokerInstance;

    private Integer principalId;

    private Integer farPrincipalId;

    private String outboundSessionKeyIdentifier;

    private String inboundSessionKeyIdentifier;

    private Date securityTimestamp;

    private Date dialogTimer;

    private Long sendSequence;

    private Long endDialogSequence;

    private Long receiveSequence;

    private Integer receiveSequenceFrag;

    private Long systemSequence;

    private Long firstOutOfOrderSequence;

    private Long lastOutOfOrderSequence;

    private Integer lastOutOfOrderFrag;

    private Boolean isSystem;

    private Byte priority;

    private byte[] lastSendTranId;

    public String getConversationHandle() {
        return conversationHandle;
    }

    public void setConversationHandle(String conversationHandle) {
        this.conversationHandle = conversationHandle == null ? null : conversationHandle.trim();
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId == null ? null : conversationId.trim();
    }

    public Boolean getIsInitiator() {
        return isInitiator;
    }

    public void setIsInitiator(Boolean isInitiator) {
        this.isInitiator = isInitiator;
    }

    public Integer getServiceContractId() {
        return serviceContractId;
    }

    public void setServiceContractId(Integer serviceContractId) {
        this.serviceContractId = serviceContractId;
    }

    public String getConversationGroupId() {
        return conversationGroupId;
    }

    public void setConversationGroupId(String conversationGroupId) {
        this.conversationGroupId = conversationGroupId == null ? null : conversationGroupId.trim();
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Date getLifetime() {
        return lifetime;
    }

    public void setLifetime(Date lifetime) {
        this.lifetime = lifetime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }

    public String getFarService() {
        return farService;
    }

    public void setFarService(String farService) {
        this.farService = farService == null ? null : farService.trim();
    }

    public String getFarBrokerInstance() {
        return farBrokerInstance;
    }

    public void setFarBrokerInstance(String farBrokerInstance) {
        this.farBrokerInstance = farBrokerInstance == null ? null : farBrokerInstance.trim();
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public Integer getFarPrincipalId() {
        return farPrincipalId;
    }

    public void setFarPrincipalId(Integer farPrincipalId) {
        this.farPrincipalId = farPrincipalId;
    }

    public String getOutboundSessionKeyIdentifier() {
        return outboundSessionKeyIdentifier;
    }

    public void setOutboundSessionKeyIdentifier(String outboundSessionKeyIdentifier) {
        this.outboundSessionKeyIdentifier = outboundSessionKeyIdentifier == null ? null : outboundSessionKeyIdentifier.trim();
    }

    public String getInboundSessionKeyIdentifier() {
        return inboundSessionKeyIdentifier;
    }

    public void setInboundSessionKeyIdentifier(String inboundSessionKeyIdentifier) {
        this.inboundSessionKeyIdentifier = inboundSessionKeyIdentifier == null ? null : inboundSessionKeyIdentifier.trim();
    }

    public Date getSecurityTimestamp() {
        return securityTimestamp;
    }

    public void setSecurityTimestamp(Date securityTimestamp) {
        this.securityTimestamp = securityTimestamp;
    }

    public Date getDialogTimer() {
        return dialogTimer;
    }

    public void setDialogTimer(Date dialogTimer) {
        this.dialogTimer = dialogTimer;
    }

    public Long getSendSequence() {
        return sendSequence;
    }

    public void setSendSequence(Long sendSequence) {
        this.sendSequence = sendSequence;
    }

    public Long getEndDialogSequence() {
        return endDialogSequence;
    }

    public void setEndDialogSequence(Long endDialogSequence) {
        this.endDialogSequence = endDialogSequence;
    }

    public Long getReceiveSequence() {
        return receiveSequence;
    }

    public void setReceiveSequence(Long receiveSequence) {
        this.receiveSequence = receiveSequence;
    }

    public Integer getReceiveSequenceFrag() {
        return receiveSequenceFrag;
    }

    public void setReceiveSequenceFrag(Integer receiveSequenceFrag) {
        this.receiveSequenceFrag = receiveSequenceFrag;
    }

    public Long getSystemSequence() {
        return systemSequence;
    }

    public void setSystemSequence(Long systemSequence) {
        this.systemSequence = systemSequence;
    }

    public Long getFirstOutOfOrderSequence() {
        return firstOutOfOrderSequence;
    }

    public void setFirstOutOfOrderSequence(Long firstOutOfOrderSequence) {
        this.firstOutOfOrderSequence = firstOutOfOrderSequence;
    }

    public Long getLastOutOfOrderSequence() {
        return lastOutOfOrderSequence;
    }

    public void setLastOutOfOrderSequence(Long lastOutOfOrderSequence) {
        this.lastOutOfOrderSequence = lastOutOfOrderSequence;
    }

    public Integer getLastOutOfOrderFrag() {
        return lastOutOfOrderFrag;
    }

    public void setLastOutOfOrderFrag(Integer lastOutOfOrderFrag) {
        this.lastOutOfOrderFrag = lastOutOfOrderFrag;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public byte[] getLastSendTranId() {
        return lastSendTranId;
    }

    public void setLastSendTranId(byte[] lastSendTranId) {
        this.lastSendTranId = lastSendTranId;
    }
}