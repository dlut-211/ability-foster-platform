package edu.dlut.ssdut.abilityfosterplatform.model;

public class AsymmetricKeys {
    private String name;

    private Integer principalId;

    private Integer asymmetricKeyId;

    private String pvtKeyEncryptionType;

    private String pvtKeyEncryptionTypeDesc;

    private String algorithm;

    private String algorithmDesc;

    private Integer keyLength;

    private String stringSid;

    private String attestedBy;

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

    public Integer getAsymmetricKeyId() {
        return asymmetricKeyId;
    }

    public void setAsymmetricKeyId(Integer asymmetricKeyId) {
        this.asymmetricKeyId = asymmetricKeyId;
    }

    public String getPvtKeyEncryptionType() {
        return pvtKeyEncryptionType;
    }

    public void setPvtKeyEncryptionType(String pvtKeyEncryptionType) {
        this.pvtKeyEncryptionType = pvtKeyEncryptionType == null ? null : pvtKeyEncryptionType.trim();
    }

    public String getPvtKeyEncryptionTypeDesc() {
        return pvtKeyEncryptionTypeDesc;
    }

    public void setPvtKeyEncryptionTypeDesc(String pvtKeyEncryptionTypeDesc) {
        this.pvtKeyEncryptionTypeDesc = pvtKeyEncryptionTypeDesc == null ? null : pvtKeyEncryptionTypeDesc.trim();
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm == null ? null : algorithm.trim();
    }

    public String getAlgorithmDesc() {
        return algorithmDesc;
    }

    public void setAlgorithmDesc(String algorithmDesc) {
        this.algorithmDesc = algorithmDesc == null ? null : algorithmDesc.trim();
    }

    public Integer getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(Integer keyLength) {
        this.keyLength = keyLength;
    }

    public String getStringSid() {
        return stringSid;
    }

    public void setStringSid(String stringSid) {
        this.stringSid = stringSid == null ? null : stringSid.trim();
    }

    public String getAttestedBy() {
        return attestedBy;
    }

    public void setAttestedBy(String attestedBy) {
        this.attestedBy = attestedBy == null ? null : attestedBy.trim();
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