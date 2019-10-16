package edu.dlut.ssdut.abilityfosterplatform.model;

public class XmlSchemaComponentPlacements {
    private Integer xmlComponentId;

    private Integer placementId;

    private Integer placedXmlComponentId;

    private Boolean isDefaultFixed;

    private Integer minOccurences;

    private Integer maxOccurences;

    private String defaultValue;

    public Integer getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(Integer xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public Integer getPlacementId() {
        return placementId;
    }

    public void setPlacementId(Integer placementId) {
        this.placementId = placementId;
    }

    public Integer getPlacedXmlComponentId() {
        return placedXmlComponentId;
    }

    public void setPlacedXmlComponentId(Integer placedXmlComponentId) {
        this.placedXmlComponentId = placedXmlComponentId;
    }

    public Boolean getIsDefaultFixed() {
        return isDefaultFixed;
    }

    public void setIsDefaultFixed(Boolean isDefaultFixed) {
        this.isDefaultFixed = isDefaultFixed;
    }

    public Integer getMinOccurences() {
        return minOccurences;
    }

    public void setMinOccurences(Integer minOccurences) {
        this.minOccurences = minOccurences;
    }

    public Integer getMaxOccurences() {
        return maxOccurences;
    }

    public void setMaxOccurences(Integer maxOccurences) {
        this.maxOccurences = maxOccurences;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }
}