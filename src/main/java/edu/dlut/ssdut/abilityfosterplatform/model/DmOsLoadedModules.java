package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsLoadedModules {
    private String fileVersion;

    private String productVersion;

    private Boolean debug;

    private Boolean patched;

    private Boolean prerelease;

    private Boolean privateBuild;

    private Boolean specialBuild;

    private Integer language;

    private String company;

    private String description;

    private String name;

    private byte[] baseAddress;

    public String getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion == null ? null : fileVersion.trim();
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion == null ? null : productVersion.trim();
    }

    public Boolean getDebug() {
        return debug;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    public Boolean getPatched() {
        return patched;
    }

    public void setPatched(Boolean patched) {
        this.patched = patched;
    }

    public Boolean getPrerelease() {
        return prerelease;
    }

    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    public Boolean getPrivateBuild() {
        return privateBuild;
    }

    public void setPrivateBuild(Boolean privateBuild) {
        this.privateBuild = privateBuild;
    }

    public Boolean getSpecialBuild() {
        return specialBuild;
    }

    public void setSpecialBuild(Boolean specialBuild) {
        this.specialBuild = specialBuild;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public byte[] getBaseAddress() {
        return baseAddress;
    }

    public void setBaseAddress(byte[] baseAddress) {
        this.baseAddress = baseAddress;
    }
}