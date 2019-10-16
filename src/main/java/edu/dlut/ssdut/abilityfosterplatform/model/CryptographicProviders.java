package edu.dlut.ssdut.abilityfosterplatform.model;

public class CryptographicProviders {
    private Integer providerId;

    private String name;

    private String guid;

    private String version;

    private String dllPath;

    private Boolean isEnabled;

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getDllPath() {
        return dllPath;
    }

    public void setDllPath(String dllPath) {
        this.dllPath = dllPath == null ? null : dllPath.trim();
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }
}