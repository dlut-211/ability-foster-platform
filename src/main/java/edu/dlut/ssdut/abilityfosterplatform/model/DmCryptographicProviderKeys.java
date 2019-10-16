package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmCryptographicProviderKeys {
    private Integer keyId;

    private String keyName;

    private Integer algorithmId;

    private String algorithmTag;

    private String keyType;

    private Integer keyLength;

    private byte[] keyThumbprint;

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    public Integer getAlgorithmId() {
        return algorithmId;
    }

    public void setAlgorithmId(Integer algorithmId) {
        this.algorithmId = algorithmId;
    }

    public String getAlgorithmTag() {
        return algorithmTag;
    }

    public void setAlgorithmTag(String algorithmTag) {
        this.algorithmTag = algorithmTag == null ? null : algorithmTag.trim();
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType == null ? null : keyType.trim();
    }

    public Integer getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
    }

    public byte[] getKeyThumbprint() {
        return keyThumbprint;
    }

    public void setKeyThumbprint(byte[] keyThumbprint) {
        this.keyThumbprint = keyThumbprint;
    }
}