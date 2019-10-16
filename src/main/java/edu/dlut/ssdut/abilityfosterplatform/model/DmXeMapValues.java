package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmXeMapValues {
    private String name;

    private String objectPackageGuid;

    private Integer mapKey;

    private String mapValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getObjectPackageGuid() {
        return objectPackageGuid;
    }

    public void setObjectPackageGuid(String objectPackageGuid) {
        this.objectPackageGuid = objectPackageGuid == null ? null : objectPackageGuid.trim();
    }

    public Integer getMapKey() {
        return mapKey;
    }

    public void setMapKey(Integer mapKey) {
        this.mapKey = mapKey;
    }

    public String getMapValue() {
        return mapValue;
    }

    public void setMapValue(String mapValue) {
        this.mapValue = mapValue == null ? null : mapValue.trim();
    }
}