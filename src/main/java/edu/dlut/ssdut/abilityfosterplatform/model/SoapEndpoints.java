package edu.dlut.ssdut.abilityfosterplatform.model;

public class SoapEndpoints {
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

    private Boolean isSqlLanguageEnabled;

    private String wsdlGeneratorProcedure;

    private String defaultDatabase;

    private String defaultNamespace;

    private Byte defaultResultSchema;

    private String defaultResultSchemaDesc;

    private Boolean isXmlCharsetEnforced;

    private Boolean isSessionEnabled;

    private Integer sessionTimeout;

    private String loginType;

    private Integer headerLimit;

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

    public Boolean getIsSqlLanguageEnabled() {
        return isSqlLanguageEnabled;
    }

    public void setIsSqlLanguageEnabled(Boolean isSqlLanguageEnabled) {
        this.isSqlLanguageEnabled = isSqlLanguageEnabled;
    }

    public String getWsdlGeneratorProcedure() {
        return wsdlGeneratorProcedure;
    }

    public void setWsdlGeneratorProcedure(String wsdlGeneratorProcedure) {
        this.wsdlGeneratorProcedure = wsdlGeneratorProcedure == null ? null : wsdlGeneratorProcedure.trim();
    }

    public String getDefaultDatabase() {
        return defaultDatabase;
    }

    public void setDefaultDatabase(String defaultDatabase) {
        this.defaultDatabase = defaultDatabase == null ? null : defaultDatabase.trim();
    }

    public String getDefaultNamespace() {
        return defaultNamespace;
    }

    public void setDefaultNamespace(String defaultNamespace) {
        this.defaultNamespace = defaultNamespace == null ? null : defaultNamespace.trim();
    }

    public Byte getDefaultResultSchema() {
        return defaultResultSchema;
    }

    public void setDefaultResultSchema(Byte defaultResultSchema) {
        this.defaultResultSchema = defaultResultSchema;
    }

    public String getDefaultResultSchemaDesc() {
        return defaultResultSchemaDesc;
    }

    public void setDefaultResultSchemaDesc(String defaultResultSchemaDesc) {
        this.defaultResultSchemaDesc = defaultResultSchemaDesc == null ? null : defaultResultSchemaDesc.trim();
    }

    public Boolean getIsXmlCharsetEnforced() {
        return isXmlCharsetEnforced;
    }

    public void setIsXmlCharsetEnforced(Boolean isXmlCharsetEnforced) {
        this.isXmlCharsetEnforced = isXmlCharsetEnforced;
    }

    public Boolean getIsSessionEnabled() {
        return isSessionEnabled;
    }

    public void setIsSessionEnabled(Boolean isSessionEnabled) {
        this.isSessionEnabled = isSessionEnabled;
    }

    public Integer getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }

    public Integer getHeaderLimit() {
        return headerLimit;
    }

    public void setHeaderLimit(Integer headerLimit) {
        this.headerLimit = headerLimit;
    }
}