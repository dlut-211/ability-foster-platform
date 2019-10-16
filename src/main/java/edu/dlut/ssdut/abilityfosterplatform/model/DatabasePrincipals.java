package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DatabasePrincipals {
    private String name;

    private Integer principalId;

    private String type;

    private String typeDesc;

    private String defaultSchemaName;

    private Date createDate;

    private Date modifyDate;

    private Integer owningPrincipalId;

    private Boolean isFixedRole;

    private Integer authenticationType;

    private String authenticationTypeDesc;

    private String defaultLanguageName;

    private Integer defaultLanguageLcid;

    private byte[] sid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    public String getDefaultSchemaName() {
        return defaultSchemaName;
    }

    public void setDefaultSchemaName(String defaultSchemaName) {
        this.defaultSchemaName = defaultSchemaName == null ? null : defaultSchemaName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getOwningPrincipalId() {
        return owningPrincipalId;
    }

    public void setOwningPrincipalId(Integer owningPrincipalId) {
        this.owningPrincipalId = owningPrincipalId;
    }

    public Boolean getIsFixedRole() {
        return isFixedRole;
    }

    public void setIsFixedRole(Boolean isFixedRole) {
        this.isFixedRole = isFixedRole;
    }

    public Integer getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(Integer authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getAuthenticationTypeDesc() {
        return authenticationTypeDesc;
    }

    public void setAuthenticationTypeDesc(String authenticationTypeDesc) {
        this.authenticationTypeDesc = authenticationTypeDesc == null ? null : authenticationTypeDesc.trim();
    }

    public String getDefaultLanguageName() {
        return defaultLanguageName;
    }

    public void setDefaultLanguageName(String defaultLanguageName) {
        this.defaultLanguageName = defaultLanguageName == null ? null : defaultLanguageName.trim();
    }

    public Integer getDefaultLanguageLcid() {
        return defaultLanguageLcid;
    }

    public void setDefaultLanguageLcid(Integer defaultLanguageLcid) {
        this.defaultLanguageLcid = defaultLanguageLcid;
    }

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }
}