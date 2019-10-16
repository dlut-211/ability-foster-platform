package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmBrokerForwardedMessages {
    private String conversationId;

    private Boolean isInitiator;

    private String toServiceName;

    private String toBrokerInstance;

    private String fromServiceName;

    private String fromBrokerInstance;

    private String adjacentBrokerAddress;

    private Long messageSequenceNumber;

    private Integer messageFragmentNumber;

    private Byte hopsRemaining;

    private Integer timeToLive;

    private Integer timeConsumed;

    private String messageId;

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

    public String getFromBrokerInstance() {
        return fromBrokerInstance;
    }

    public void setFromBrokerInstance(String fromBrokerInstance) {
        this.fromBrokerInstance = fromBrokerInstance == null ? null : fromBrokerInstance.trim();
    }

    public String getAdjacentBrokerAddress() {
        return adjacentBrokerAddress;
    }

    public void setAdjacentBrokerAddress(String adjacentBrokerAddress) {
        this.adjacentBrokerAddress = adjacentBrokerAddress == null ? null : adjacentBrokerAddress.trim();
    }

    public Long getMessageSequenceNumber() {
        return messageSequenceNumber;
    }

    public void setMessageSequenceNumber(Long messageSequenceNumber) {
        this.messageSequenceNumber = messageSequenceNumber;
    }

    public Integer getMessageFragmentNumber() {
        return messageFragmentNumber;
    }

    public void setMessageFragmentNumber(Integer messageFragmentNumber) {
        this.messageFragmentNumber = messageFragmentNumber;
    }

    public Byte getHopsRemaining() {
        return hopsRemaining;
    }

    public void setHopsRemaining(Byte hopsRemaining) {
        this.hopsRemaining = hopsRemaining;
    }

    public Integer getTimeToLive() {
        return timeToLive;
    }

    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    public Integer getTimeConsumed() {
        return timeConsumed;
    }

    public void setTimeConsumed(Integer timeConsumed) {
        this.timeConsumed = timeConsumed;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }
}