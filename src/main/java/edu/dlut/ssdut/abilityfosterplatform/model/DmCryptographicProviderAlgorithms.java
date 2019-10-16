package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmCryptographicProviderAlgorithms {
    private Integer algorithmId;

    private String algorithmTag;

    private String keyType;

    private Integer keyLength;

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
}