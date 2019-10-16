package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmCryptographicProviderProperties {
    private Integer providerId;

    private String guid;

    private String providerVersion;

    private String sqlcryptVersion;

    private String friendlyName;

    private String authenticationType;

    private Byte symmetricKeySupport;

    private Byte symmetricKeyPersistance;

    private Byte symmetricKeyExport;

    private Byte symmetricKeyImport;

    private Byte asymmetricKeySupport;

    private Byte asymmetricKeyPersistance;

    private Byte asymmetricKeyExport;

    private Byte asymmetricKeyImport;

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getProviderVersion() {
        return providerVersion;
    }

    public void setProviderVersion(String providerVersion) {
        this.providerVersion = providerVersion == null ? null : providerVersion.trim();
    }

    public String getSqlcryptVersion() {
        return sqlcryptVersion;
    }

    public void setSqlcryptVersion(String sqlcryptVersion) {
        this.sqlcryptVersion = sqlcryptVersion == null ? null : sqlcryptVersion.trim();
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName == null ? null : friendlyName.trim();
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType == null ? null : authenticationType.trim();
    }

    public Byte getSymmetricKeySupport() {
        return symmetricKeySupport;
    }

    public void setSymmetricKeySupport(Byte symmetricKeySupport) {
        this.symmetricKeySupport = symmetricKeySupport;
    }

    public Byte getSymmetricKeyPersistance() {
        return symmetricKeyPersistance;
    }

    public void setSymmetricKeyPersistance(Byte symmetricKeyPersistance) {
        this.symmetricKeyPersistance = symmetricKeyPersistance;
    }

    public Byte getSymmetricKeyExport() {
        return symmetricKeyExport;
    }

    public void setSymmetricKeyExport(Byte symmetricKeyExport) {
        this.symmetricKeyExport = symmetricKeyExport;
    }

    public Byte getSymmetricKeyImport() {
        return symmetricKeyImport;
    }

    public void setSymmetricKeyImport(Byte symmetricKeyImport) {
        this.symmetricKeyImport = symmetricKeyImport;
    }

    public Byte getAsymmetricKeySupport() {
        return asymmetricKeySupport;
    }

    public void setAsymmetricKeySupport(Byte asymmetricKeySupport) {
        this.asymmetricKeySupport = asymmetricKeySupport;
    }

    public Byte getAsymmetricKeyPersistance() {
        return asymmetricKeyPersistance;
    }

    public void setAsymmetricKeyPersistance(Byte asymmetricKeyPersistance) {
        this.asymmetricKeyPersistance = asymmetricKeyPersistance;
    }

    public Byte getAsymmetricKeyExport() {
        return asymmetricKeyExport;
    }

    public void setAsymmetricKeyExport(Byte asymmetricKeyExport) {
        this.asymmetricKeyExport = asymmetricKeyExport;
    }

    public Byte getAsymmetricKeyImport() {
        return asymmetricKeyImport;
    }

    public void setAsymmetricKeyImport(Byte asymmetricKeyImport) {
        this.asymmetricKeyImport = asymmetricKeyImport;
    }
}