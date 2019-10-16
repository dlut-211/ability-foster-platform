package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class SymmetricKeys {
    private String name;

    private Integer principalId;

    private Integer symmetricKeyId;

    private Integer keyLength;

    private String keyAlgorithm;

    private String algorithmDesc;

    private Date createDate;

    private Date modifyDate;

    private String keyGuid;

    private Object keyThumbprint;

    private String providerType;

    private String cryptographicProviderGuid;

    private Object cryptographicProviderAlgid;

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

    public Integer getSymmetricKeyId() {
        return symmetricKeyId;
    }

    public void setSymmetricKeyId(Integer symmetricKeyId) {
        this.symmetricKeyId = symmetricKeyId;
    }

    public Integer getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
    }

    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm == null ? null : keyAlgorithm.trim();
    }

    public String getAlgorithmDesc() {
        return algorithmDesc;
    }

    public void setAlgorithmDesc(String algorithmDesc) {
        this.algorithmDesc = algorithmDesc == null ? null : algorithmDesc.trim();
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

    public String getKeyGuid() {
        return keyGuid;
    }

    public void setKeyGuid(String keyGuid) {
        this.keyGuid = keyGuid == null ? null : keyGuid.trim();
    }

    public Object getKeyThumbprint() {
        return keyThumbprint;
    }

    public void setKeyThumbprint(Object keyThumbprint) {
        this.keyThumbprint = keyThumbprint;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType == null ? null : providerType.trim();
    }

    public String getCryptographicProviderGuid() {
        return cryptographicProviderGuid;
    }

    public void setCryptographicProviderGuid(String cryptographicProviderGuid) {
        this.cryptographicProviderGuid = cryptographicProviderGuid == null ? null : cryptographicProviderGuid.trim();
    }

    public Object getCryptographicProviderAlgid() {
        return cryptographicProviderAlgid;
    }

    public void setCryptographicProviderAlgid(Object cryptographicProviderAlgid) {
        this.cryptographicProviderAlgid = cryptographicProviderAlgid;
    }
}