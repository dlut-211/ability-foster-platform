package edu.dlut.ssdut.abilityfosterplatform.model;

public class RegisteredSearchProperties {
    private Integer propertyListId;

    private Integer propertyId;

    private String propertyName;

    private String propertySetGuid;

    private Integer propertyIntId;

    private String propertyDescription;

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

    public String getPropertySetGuid() {
        return propertySetGuid;
    }

    public void setPropertySetGuid(String propertySetGuid) {
        this.propertySetGuid = propertySetGuid == null ? null : propertySetGuid.trim();
    }

    public Integer getPropertyIntId() {
        return propertyIntId;
    }

    public void setPropertyIntId(Integer propertyIntId) {
        this.propertyIntId = propertyIntId;
    }

    public String getPropertyDescription() {
        return propertyDescription;
    }

    public void setPropertyDescription(String propertyDescription) {
        this.propertyDescription = propertyDescription == null ? null : propertyDescription.trim();
    }
}