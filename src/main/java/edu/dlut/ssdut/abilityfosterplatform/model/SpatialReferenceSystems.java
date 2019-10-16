package edu.dlut.ssdut.abilityfosterplatform.model;

public class SpatialReferenceSystems {
    private Integer spatialReferenceId;

    private String authorityName;

    private Integer authorizedSpatialReferenceId;

    private String wellKnownText;

    private String unitOfMeasure;

    private Double unitConversionFactor;

    public Integer getSpatialReferenceId() {
        return spatialReferenceId;
    }

    public void setSpatialReferenceId(Integer spatialReferenceId) {
        this.spatialReferenceId = spatialReferenceId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    public Integer getAuthorizedSpatialReferenceId() {
        return authorizedSpatialReferenceId;
    }

    public void setAuthorizedSpatialReferenceId(Integer authorizedSpatialReferenceId) {
        this.authorizedSpatialReferenceId = authorizedSpatialReferenceId;
    }

    public String getWellKnownText() {
        return wellKnownText;
    }

    public void setWellKnownText(String wellKnownText) {
        this.wellKnownText = wellKnownText == null ? null : wellKnownText.trim();
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure == null ? null : unitOfMeasure.trim();
    }

    public Double getUnitConversionFactor() {
        return unitConversionFactor;
    }

    public void setUnitConversionFactor(Double unitConversionFactor) {
        this.unitConversionFactor = unitConversionFactor;
    }
}