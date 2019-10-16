package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmXePackages {
    private String name;

    private String guid;

    private String description;

    private Integer capabilities;

    private String capabilitiesDesc;

    private String moduleGuid;

    private byte[] moduleAddress;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Integer capabilities) {
        this.capabilities = capabilities;
    }

    public String getCapabilitiesDesc() {
        return capabilitiesDesc;
    }

    public void setCapabilitiesDesc(String capabilitiesDesc) {
        this.capabilitiesDesc = capabilitiesDesc == null ? null : capabilitiesDesc.trim();
    }

    public String getModuleGuid() {
        return moduleGuid;
    }

    public void setModuleGuid(String moduleGuid) {
        this.moduleGuid = moduleGuid == null ? null : moduleGuid.trim();
    }

    public byte[] getModuleAddress() {
        return moduleAddress;
    }

    public void setModuleAddress(byte[] moduleAddress) {
        this.moduleAddress = moduleAddress;
    }
}