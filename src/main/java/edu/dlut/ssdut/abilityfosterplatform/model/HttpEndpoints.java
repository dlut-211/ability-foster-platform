package edu.dlut.ssdut.abilityfosterplatform.model;

public class HttpEndpoints {
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

    private String site;

    private String urlPath;

    private Boolean isClearPortEnabled;

    private Integer clearPort;

    private Boolean isSslPortEnabled;

    private Integer sslPort;

    private Boolean isAnonymousEnabled;

    private Boolean isBasicAuthEnabled;

    private Boolean isDigestAuthEnabled;

    private Boolean isKerberosAuthEnabled;

    private Boolean isNtlmAuthEnabled;

    private Boolean isIntegratedAuthEnabled;

    private String authorizationRealm;

    private String defaultLogonDomain;

    private Boolean isCompressionEnabled;

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

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath == null ? null : urlPath.trim();
    }

    public Boolean getIsClearPortEnabled() {
        return isClearPortEnabled;
    }

    public void setIsClearPortEnabled(Boolean isClearPortEnabled) {
        this.isClearPortEnabled = isClearPortEnabled;
    }

    public Integer getClearPort() {
        return clearPort;
    }

    public void setClearPort(Integer clearPort) {
        this.clearPort = clearPort;
    }

    public Boolean getIsSslPortEnabled() {
        return isSslPortEnabled;
    }

    public void setIsSslPortEnabled(Boolean isSslPortEnabled) {
        this.isSslPortEnabled = isSslPortEnabled;
    }

    public Integer getSslPort() {
        return sslPort;
    }

    public void setSslPort(Integer sslPort) {
        this.sslPort = sslPort;
    }

    public Boolean getIsAnonymousEnabled() {
        return isAnonymousEnabled;
    }

    public void setIsAnonymousEnabled(Boolean isAnonymousEnabled) {
        this.isAnonymousEnabled = isAnonymousEnabled;
    }

    public Boolean getIsBasicAuthEnabled() {
        return isBasicAuthEnabled;
    }

    public void setIsBasicAuthEnabled(Boolean isBasicAuthEnabled) {
        this.isBasicAuthEnabled = isBasicAuthEnabled;
    }

    public Boolean getIsDigestAuthEnabled() {
        return isDigestAuthEnabled;
    }

    public void setIsDigestAuthEnabled(Boolean isDigestAuthEnabled) {
        this.isDigestAuthEnabled = isDigestAuthEnabled;
    }

    public Boolean getIsKerberosAuthEnabled() {
        return isKerberosAuthEnabled;
    }

    public void setIsKerberosAuthEnabled(Boolean isKerberosAuthEnabled) {
        this.isKerberosAuthEnabled = isKerberosAuthEnabled;
    }

    public Boolean getIsNtlmAuthEnabled() {
        return isNtlmAuthEnabled;
    }

    public void setIsNtlmAuthEnabled(Boolean isNtlmAuthEnabled) {
        this.isNtlmAuthEnabled = isNtlmAuthEnabled;
    }

    public Boolean getIsIntegratedAuthEnabled() {
        return isIntegratedAuthEnabled;
    }

    public void setIsIntegratedAuthEnabled(Boolean isIntegratedAuthEnabled) {
        this.isIntegratedAuthEnabled = isIntegratedAuthEnabled;
    }

    public String getAuthorizationRealm() {
        return authorizationRealm;
    }

    public void setAuthorizationRealm(String authorizationRealm) {
        this.authorizationRealm = authorizationRealm == null ? null : authorizationRealm.trim();
    }

    public String getDefaultLogonDomain() {
        return defaultLogonDomain;
    }

    public void setDefaultLogonDomain(String defaultLogonDomain) {
        this.defaultLogonDomain = defaultLogonDomain == null ? null : defaultLogonDomain.trim();
    }

    public Boolean getIsCompressionEnabled() {
        return isCompressionEnabled;
    }

    public void setIsCompressionEnabled(Boolean isCompressionEnabled) {
        this.isCompressionEnabled = isCompressionEnabled;
    }
}