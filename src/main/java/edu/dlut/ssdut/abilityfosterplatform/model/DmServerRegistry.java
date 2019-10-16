package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmServerRegistry {
    private String registryKey;

    private String valueName;

    private Object valueData;

    public String getRegistryKey() {
        return registryKey;
    }

    public void setRegistryKey(String registryKey) {
        this.registryKey = registryKey == null ? null : registryKey.trim();
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName == null ? null : valueName.trim();
    }

    public Object getValueData() {
        return valueData;
    }

    public void setValueData(Object valueData) {
        this.valueData = valueData;
    }
}