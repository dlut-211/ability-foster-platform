package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmXeObjects {
    private String name;

    private String objectType;

    private String packageGuid;

    private String description;

    private Integer capabilities;

    private String capabilitiesDesc;

    private String typeName;

    private String typePackageGuid;

    private Integer typeSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

    public String getPackageGuid() {
        return packageGuid;
    }

    public void setPackageGuid(String packageGuid) {
        this.packageGuid = packageGuid == null ? null : packageGuid.trim();
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

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypePackageGuid() {
        return typePackageGuid;
    }

    public void setTypePackageGuid(String typePackageGuid) {
        this.typePackageGuid = typePackageGuid == null ? null : typePackageGuid.trim();
    }

    public Integer getTypeSize() {
        return typeSize;
    }

    public void setTypeSize(Integer typeSize) {
        this.typeSize = typeSize;
    }
}