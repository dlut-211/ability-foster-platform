package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmExecConnections {
    private Integer sessionId;

    private Integer mostRecentSessionId;

    private Date connectTime;

    private String netTransport;

    private String protocolType;

    private Integer protocolVersion;

    private Integer endpointId;

    private String encryptOption;

    private String authScheme;

    private Short nodeAffinity;

    private Integer numReads;

    private Integer numWrites;

    private Date lastRead;

    private Date lastWrite;

    private Integer netPacketSize;

    private String clientNetAddress;

    private Integer clientTcpPort;

    private String localNetAddress;

    private Integer localTcpPort;

    private String connectionId;

    private String parentConnectionId;

    private byte[] mostRecentSqlHandle;

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getMostRecentSessionId() {
        return mostRecentSessionId;
    }

    public void setMostRecentSessionId(Integer mostRecentSessionId) {
        this.mostRecentSessionId = mostRecentSessionId;
    }

    public Date getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(Date connectTime) {
        this.connectTime = connectTime;
    }

    public String getNetTransport() {
        return netTransport;
    }

    public void setNetTransport(String netTransport) {
        this.netTransport = netTransport == null ? null : netTransport.trim();
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType == null ? null : protocolType.trim();
    }

    public Integer getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(Integer protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public Integer getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(Integer endpointId) {
        this.endpointId = endpointId;
    }

    public String getEncryptOption() {
        return encryptOption;
    }

    public void setEncryptOption(String encryptOption) {
        this.encryptOption = encryptOption == null ? null : encryptOption.trim();
    }

    public String getAuthScheme() {
        return authScheme;
    }

    public void setAuthScheme(String authScheme) {
        this.authScheme = authScheme == null ? null : authScheme.trim();
    }

    public Short getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(Short nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    public Integer getNumReads() {
        return numReads;
    }

    public void setNumReads(Integer numReads) {
        this.numReads = numReads;
    }

    public Integer getNumWrites() {
        return numWrites;
    }

    public void setNumWrites(Integer numWrites) {
        this.numWrites = numWrites;
    }

    public Date getLastRead() {
        return lastRead;
    }

    public void setLastRead(Date lastRead) {
        this.lastRead = lastRead;
    }

    public Date getLastWrite() {
        return lastWrite;
    }

    public void setLastWrite(Date lastWrite) {
        this.lastWrite = lastWrite;
    }

    public Integer getNetPacketSize() {
        return netPacketSize;
    }

    public void setNetPacketSize(Integer netPacketSize) {
        this.netPacketSize = netPacketSize;
    }

    public String getClientNetAddress() {
        return clientNetAddress;
    }

    public void setClientNetAddress(String clientNetAddress) {
        this.clientNetAddress = clientNetAddress == null ? null : clientNetAddress.trim();
    }

    public Integer getClientTcpPort() {
        return clientTcpPort;
    }

    public void setClientTcpPort(Integer clientTcpPort) {
        this.clientTcpPort = clientTcpPort;
    }

    public String getLocalNetAddress() {
        return localNetAddress;
    }

    public void setLocalNetAddress(String localNetAddress) {
        this.localNetAddress = localNetAddress == null ? null : localNetAddress.trim();
    }

    public Integer getLocalTcpPort() {
        return localTcpPort;
    }

    public void setLocalTcpPort(Integer localTcpPort) {
        this.localTcpPort = localTcpPort;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId == null ? null : connectionId.trim();
    }

    public String getParentConnectionId() {
        return parentConnectionId;
    }

    public void setParentConnectionId(String parentConnectionId) {
        this.parentConnectionId = parentConnectionId == null ? null : parentConnectionId.trim();
    }

    public byte[] getMostRecentSqlHandle() {
        return mostRecentSqlHandle;
    }

    public void setMostRecentSqlHandle(byte[] mostRecentSqlHandle) {
        this.mostRecentSqlHandle = mostRecentSqlHandle;
    }
}