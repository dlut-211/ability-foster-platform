package edu.dlut.ssdut.abilityfosterplatform.model;

public class TcpEndpoints {
    private String name;

    private Integer endpointId;

    private Integer principalId;

    private Byte protocol;

    private String protocolDesc;

    private Byte type;

    private String typeDesc;

    private Byte state;

    private String stateDesc;

    private Boolean isAdminEndpoint;

    private Integer port;

    private Boolean isDynamicPort;

    private String ipAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(Integer endpointId) {
        this.endpointId = endpointId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public Byte getProtocol() {
        return protocol;
    }

    public void setProtocol(Byte protocol) {
        this.protocol = protocol;
    }

    public String getProtocolDesc() {
        return protocolDesc;
    }

    public void setProtocolDesc(String protocolDesc) {
        this.protocolDesc = protocolDesc == null ? null : protocolDesc.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc == null ? null : stateDesc.trim();
    }

    public Boolean getIsAdminEndpoint() {
        return isAdminEndpoint;
    }

    public void setIsAdminEndpoint(Boolean isAdminEndpoint) {
        this.isAdminEndpoint = isAdminEndpoint;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Boolean getIsDynamicPort() {
        return isDynamicPort;
    }

    public void setIsDynamicPort(Boolean isDynamicPort) {
        this.isDynamicPort = isDynamicPort;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }
}