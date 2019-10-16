package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class SqlLogins {
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

    private Boolean isPolicyChecked;

    private Boolean isExpirationChecked;

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

    public Boolean getIsPolicyChecked() {
        return isPolicyChecked;
    }

    public void setIsPolicyChecked(Boolean isPolicyChecked) {
        this.isPolicyChecked = isPolicyChecked;
    }

    public Boolean getIsExpirationChecked() {
        return isExpirationChecked;
    }

    public void setIsExpirationChecked(Boolean isExpirationChecked) {
        this.isExpirationChecked = isExpirationChecked;
    }
}