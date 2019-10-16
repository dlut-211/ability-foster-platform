package edu.dlut.ssdut.abilityfosterplatform.model;

public class KeyEncryptions {
    private Integer keyId;

    private String cryptType;

    private String cryptTypeDesc;

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public String getCryptType() {
        return cryptType;
    }

    public void setCryptType(String cryptType) {
        this.cryptType = cryptType == null ? null : cryptType.trim();
    }

    public String getCryptTypeDesc() {
        return cryptTypeDesc;
    }

    public void setCryptTypeDesc(String cryptTypeDesc) {
        this.cryptTypeDesc = cryptTypeDesc == null ? null : cryptTypeDesc.trim();
    }
}