package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmDatabaseEncryptionKeys {
    private Integer databaseId;

    private Integer encryptionState;

    private Date createDate;

    private Date regenerateDate;

    private Date modifyDate;

    private Date setDate;

    private Date openedDate;

    private String keyAlgorithm;

    private Integer keyLength;

    private String encryptorType;

    private Float percentComplete;

    private byte[] encryptorThumbprint;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getEncryptionState() {
        return encryptionState;
    }

    public void setEncryptionState(Integer encryptionState) {
        this.encryptionState = encryptionState;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getRegenerateDate() {
        return regenerateDate;
    }

    public void setRegenerateDate(Date regenerateDate) {
        this.regenerateDate = regenerateDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm == null ? null : keyAlgorithm.trim();
    }

    public Integer getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
    }

    public String getEncryptorType() {
        return encryptorType;
    }

    public void setEncryptorType(String encryptorType) {
        this.encryptorType = encryptorType == null ? null : encryptorType.trim();
    }

    public Float getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(Float percentComplete) {
        this.percentComplete = percentComplete;
    }

    public byte[] getEncryptorThumbprint() {
        return encryptorThumbprint;
    }

    public void setEncryptorThumbprint(byte[] encryptorThumbprint) {
        this.encryptorThumbprint = encryptorThumbprint;
    }
}