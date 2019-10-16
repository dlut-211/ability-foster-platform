package edu.dlut.ssdut.abilityfosterplatform.model;

public class DatabaseMirroringEndpoints {
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

    private Byte role;

    private String roleDesc;

    private Boolean isEncryptionEnabled;

    private Byte connectionAuth;

    private String connectionAuthDesc;

    private Integer certificateId;

    private Byte encryptionAlgorithm;

    private String encryptionAlgorithmDesc;

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

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public Boolean getIsEncryptionEnabled() {
        return isEncryptionEnabled;
    }

    public void setIsEncryptionEnabled(Boolean isEncryptionEnabled) {
        this.isEncryptionEnabled = isEncryptionEnabled;
    }

    public Byte getConnectionAuth() {
        return connectionAuth;
    }

    public void setConnectionAuth(Byte connectionAuth) {
        this.connectionAuth = connectionAuth;
    }

    public String getConnectionAuthDesc() {
        return connectionAuthDesc;
    }

    public void setConnectionAuthDesc(String connectionAuthDesc) {
        this.connectionAuthDesc = connectionAuthDesc == null ? null : connectionAuthDesc.trim();
    }

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public Byte getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(Byte encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public String getEncryptionAlgorithmDesc() {
        return encryptionAlgorithmDesc;
    }

    public void setEncryptionAlgorithmDesc(String encryptionAlgorithmDesc) {
        this.encryptionAlgorithmDesc = encryptionAlgorithmDesc == null ? null : encryptionAlgorithmDesc.trim();
    }
}