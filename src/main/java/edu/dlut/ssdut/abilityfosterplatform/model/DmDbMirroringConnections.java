package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmDbMirroringConnections {
    private String connectionId;

    private String transportStreamId;

    private Short state;

    private String stateDesc;

    private Date connectTime;

    private Date loginTime;

    private String authenticationMethod;

    private String principalName;

    private String remoteUserName;

    private Date lastActivityTime;

    private Boolean isAccept;

    private Short loginState;

    private String loginStateDesc;

    private Integer peerCertificateId;

    private Short encryptionAlgorithm;

    private String encryptionAlgorithmDesc;

    private Short receivesPosted;

    private Boolean isReceiveFlowControlled;

    private Short sendsPosted;

    private Boolean isSendFlowControlled;

    private Long totalBytesSent;

    private Long totalBytesReceived;

    private Long totalFragmentsSent;

    private Long totalFragmentsReceived;

    private Long totalSends;

    private Long totalReceives;

    private String peerArbitrationId;

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId == null ? null : connectionId.trim();
    }

    public String getTransportStreamId() {
        return transportStreamId;
    }

    public void setTransportStreamId(String transportStreamId) {
        this.transportStreamId = transportStreamId == null ? null : transportStreamId.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }

    public Date getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(Date connectTime) {
        this.connectTime = connectTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    public void setAuthenticationMethod(String authenticationMethod) {
        this.authenticationMethod = authenticationMethod == null ? null : authenticationMethod.trim();
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName == null ? null : principalName.trim();
    }

    public String getRemoteUserName() {
        return remoteUserName;
    }

    public void setRemoteUserName(String remoteUserName) {
        this.remoteUserName = remoteUserName == null ? null : remoteUserName.trim();
    }

    public Date getLastActivityTime() {
        return lastActivityTime;
    }

    public void setLastActivityTime(Date lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
    }

    public Boolean getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }

    public Short getLoginState() {
        return loginState;
    }

    public void setLoginState(Short loginState) {
        this.loginState = loginState;
    }

    public String getLoginStateDesc() {
        return loginStateDesc;
    }

    public void setLoginStateDesc(String loginStateDesc) {
        this.loginStateDesc = loginStateDesc == null ? null : loginStateDesc.trim();
    }

    public Integer getPeerCertificateId() {
        return peerCertificateId;
    }

    public void setPeerCertificateId(Integer peerCertificateId) {
        this.peerCertificateId = peerCertificateId;
    }

    public Short getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(Short encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public String getEncryptionAlgorithmDesc() {
        return encryptionAlgorithmDesc;
    }

    public void setEncryptionAlgorithmDesc(String encryptionAlgorithmDesc) {
        this.encryptionAlgorithmDesc = encryptionAlgorithmDesc == null ? null : encryptionAlgorithmDesc.trim();
    }

    public Short getReceivesPosted() {
        return receivesPosted;
    }

    public void setReceivesPosted(Short receivesPosted) {
        this.receivesPosted = receivesPosted;
    }

    public Boolean getIsReceiveFlowControlled() {
        return isReceiveFlowControlled;
    }

    public void setIsReceiveFlowControlled(Boolean isReceiveFlowControlled) {
        this.isReceiveFlowControlled = isReceiveFlowControlled;
    }

    public Short getSendsPosted() {
        return sendsPosted;
    }

    public void setSendsPosted(Short sendsPosted) {
        this.sendsPosted = sendsPosted;
    }

    public Boolean getIsSendFlowControlled() {
        return isSendFlowControlled;
    }

    public void setIsSendFlowControlled(Boolean isSendFlowControlled) {
        this.isSendFlowControlled = isSendFlowControlled;
    }

    public Long getTotalBytesSent() {
        return totalBytesSent;
    }

    public void setTotalBytesSent(Long totalBytesSent) {
        this.totalBytesSent = totalBytesSent;
    }

    public Long getTotalBytesReceived() {
        return totalBytesReceived;
    }

    public void setTotalBytesReceived(Long totalBytesReceived) {
        this.totalBytesReceived = totalBytesReceived;
    }

    public Long getTotalFragmentsSent() {
        return totalFragmentsSent;
    }

    public void setTotalFragmentsSent(Long totalFragmentsSent) {
        this.totalFragmentsSent = totalFragmentsSent;
    }

    public Long getTotalFragmentsReceived() {
        return totalFragmentsReceived;
    }

    public void setTotalFragmentsReceived(Long totalFragmentsReceived) {
        this.totalFragmentsReceived = totalFragmentsReceived;
    }

    public Long getTotalSends() {
        return totalSends;
    }

    public void setTotalSends(Long totalSends) {
        this.totalSends = totalSends;
    }

    public Long getTotalReceives() {
        return totalReceives;
    }

    public void setTotalReceives(Long totalReceives) {
        this.totalReceives = totalReceives;
    }

    public String getPeerArbitrationId() {
        return peerArbitrationId;
    }

    public void setPeerArbitrationId(String peerArbitrationId) {
        this.peerArbitrationId = peerArbitrationId == null ? null : peerArbitrationId.trim();
    }
}