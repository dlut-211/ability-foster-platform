package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class ServerPrincipals {
    private String name;

    private Integer principalId;

    private String type;

    private String typeDesc;

    private Boolean isDisabled;

    private Date createDate;

    private Date modifyDate;

    private String defaultDatabaseName;

    private String defaultLanguageName;

    private Integer credentialId;

    private Integer owningPrincipalId;

    private Boolean isFixedRole;

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

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
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

    public String getDefaultDatabaseName() {
        return defaultDatabaseName;
    }

    public void setDefaultDatabaseName(String defaultDatabaseName) {
        this.defaultDatabaseName = defaultDatabaseName == null ? null : defaultDatabaseName.trim();
    }

    public String getDefaultLanguageName() {
        return defaultLanguageName;
    }

    public void setDefaultLanguageName(String defaultLanguageName) {
        this.defaultLanguageName = defaultLanguageName == null ? null : defaultLanguageName.trim();
    }

    public Integer getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Integer credentialId) {
        this.credentialId = credentialId;
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

    public byte[] getSid() {
        return sid;
    }

    public void setSid(byte[] sid) {
        this.sid = sid;
    }
}