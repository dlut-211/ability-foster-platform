package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysftproperties {
    private Integer propertyListId;

    private Integer propertyId;

    private String propertyName;

    private String guidIdentifier;

    private Integer intIdentifier;

    private String stringDescription;

    public Integer getPropertyListId() {
        return propertyListId;
    }

    public void setPropertyListId(Integer propertyListId) {
        this.propertyListId = propertyListId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName == null ? null : propertyName.trim();
    }

    public String getGuidIdentifier() {
        return guidIdentifier;
    }

    public void setGuidIdentifier(String guidIdentifier) {
        this.guidIdentifier = guidIdentifier == null ? null : guidIdentifier.trim();
    }

    public Integer getIntIdentifier() {
        return intIdentifier;
    }

    public void setIntIdentifier(Integer intIdentifier) {
        this.intIdentifier = intIdentifier;
    }

    public String getStringDescription() {
        return stringDescription;
    }

    public void setStringDescription(String stringDescription) {
        this.stringDescription = stringDescription == null ? null : stringDescription.trim();
    }
}