package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class TransmissionQueue {
    private String conversationHandle;

    private String toServiceName;

    private String toBrokerInstance;

    private String fromServiceName;

    private String serviceContractName;

    private Date enqueueTime;

    private Long messageSequenceNumber;

    private String messageTypeName;

    private Boolean isConversationError;

    private Boolean isEndOfDialog;

    private String transmissionStatus;

    private Byte priority;

    private byte[] messageBody;

    public String getConversationHandle() {
        return conversationHandle;
    }

    public void setConversationHandle(String conversationHandle) {
        this.conversationHandle = conversationHandle == null ? null : conversationHandle.trim();
    }

    public String getToServiceName() {
        return toServiceName;
    }

    public void setToServiceName(String toServiceName) {
        this.toServiceName = toServiceName == null ? null : toServiceName.trim();
    }

    public String getToBrokerInstance() {
        return toBrokerInstance;
    }

    public void setToBrokerInstance(String toBrokerInstance) {
        this.toBrokerInstance = toBrokerInstance == null ? null : toBrokerInstance.trim();
    }

    public String getFromServiceName() {
        return fromServiceName;
    }

    public void setFromServiceName(String fromServiceName) {
        this.fromServiceName = fromServiceName == null ? null : fromServiceName.trim();
    }

    public String getServiceContractName() {
        return serviceContractName;
    }

    public void setServiceContractName(String serviceContractName) {
        this.serviceContractName = serviceContractName == null ? null : serviceContractName.trim();
    }

    public Date getEnqueueTime() {
        return enqueueTime;
    }

    public void setEnqueueTime(Date enqueueTime) {
        this.enqueueTime = enqueueTime;
    }

    public Long getMessageSequenceNumber() {
        return messageSequenceNumber;
    }

    public void setMessageSequenceNumber(Long messageSequenceNumber) {
        this.messageSequenceNumber = messageSequenceNumber;
    }

    public String getMessageTypeName() {
        return messageTypeName;
    }

    public void setMessageTypeName(String messageTypeName) {
        this.messageTypeName = messageTypeName == null ? null : messageTypeName.trim();
    }

    public Boolean getIsConversationError() {
        return isConversationError;
    }

    public void setIsConversationError(Boolean isConversationError) {
        this.isConversationError = isConversationError;
    }

    public Boolean getIsEndOfDialog() {
        return isEndOfDialog;
    }

    public void setIsEndOfDialog(Boolean isEndOfDialog) {
        this.isEndOfDialog = isEndOfDialog;
    }

    public String getTransmissionStatus() {
        return transmissionStatus;
    }

    public void setTransmissionStatus(String transmissionStatus) {
        this.transmissionStatus = transmissionStatus == null ? null : transmissionStatus.trim();
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public byte[] getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(byte[] messageBody) {
        this.messageBody = messageBody;
    }
}