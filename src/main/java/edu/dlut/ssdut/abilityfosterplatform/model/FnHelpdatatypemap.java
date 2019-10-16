package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnHelpdatatypemap {
    private Integer mappingId;

    private String sourceDbms;

    private String sourceVersion;

    private String sourceType;

    private Long sourceLengthMin;

    private Long sourceLengthMax;

    private Long sourcePrecisionMin;

    private Long sourcePrecisionMax;

    private Integer sourceScaleMin;

    private Integer sourceScaleMax;

    private Boolean sourceNullable;

    private Integer sourceCreateparams;

    private String destinationDbms;

    private String destinationVersion;

    private String destinationType;

    private Long destinationLength;

    private Long destinationPrecision;

    private Integer destinationScale;

    private Boolean destinationNullable;

    private Integer destinationCreateparams;

    private Boolean dataloss;

    private Boolean isDefault;

    public Integer getMappingId() {
        return mappingId;
    }

    public void setMappingId(Integer mappingId) {
        this.mappingId = mappingId;
    }

    public String getSourceDbms() {
        return sourceDbms;
    }

    public void setSourceDbms(String sourceDbms) {
        this.sourceDbms = sourceDbms == null ? null : sourceDbms.trim();
    }

    public String getSourceVersion() {
        return sourceVersion;
    }

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion == null ? null : sourceVersion.trim();
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    public Long getSourceLengthMin() {
        return sourceLengthMin;
    }

    public void setSourceLengthMin(Long sourceLengthMin) {
        this.sourceLengthMin = sourceLengthMin;
    }

    public Long getSourceLengthMax() {
        return sourceLengthMax;
    }

    public void setSourceLengthMax(Long sourceLengthMax) {
        this.sourceLengthMax = sourceLengthMax;
    }

    public Long getSourcePrecisionMin() {
        return sourcePrecisionMin;
    }

    public void setSourcePrecisionMin(Long sourcePrecisionMin) {
        this.sourcePrecisionMin = sourcePrecisionMin;
    }

    public Long getSourcePrecisionMax() {
        return sourcePrecisionMax;
    }

    public void setSourcePrecisionMax(Long sourcePrecisionMax) {
        this.sourcePrecisionMax = sourcePrecisionMax;
    }

    public Integer getSourceScaleMin() {
        return sourceScaleMin;
    }

    public void setSourceScaleMin(Integer sourceScaleMin) {
        this.sourceScaleMin = sourceScaleMin;
    }

    public Integer getSourceScaleMax() {
        return sourceScaleMax;
    }

    public void setSourceScaleMax(Integer sourceScaleMax) {
        this.sourceScaleMax = sourceScaleMax;
    }

    public Boolean getSourceNullable() {
        return sourceNullable;
    }

    public void setSourceNullable(Boolean sourceNullable) {
        this.sourceNullable = sourceNullable;
    }

    public Integer getSourceCreateparams() {
        return sourceCreateparams;
    }

    public void setSourceCreateparams(Integer sourceCreateparams) {
        this.sourceCreateparams = sourceCreateparams;
    }

    public String getDestinationDbms() {
        return destinationDbms;
    }

    public void setDestinationDbms(String destinationDbms) {
        this.destinationDbms = destinationDbms == null ? null : destinationDbms.trim();
    }

    public String getDestinationVersion() {
        return destinationVersion;
    }

    public void setDestinationVersion(String destinationVersion) {
        this.destinationVersion = destinationVersion == null ? null : destinationVersion.trim();
    }

    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType == null ? null : destinationType.trim();
    }

    public Long getDestinationLength() {
        return destinationLength;
    }

    public void setDestinationLength(Long destinationLength) {
        this.destinationLength = destinationLength;
    }

    public Long getDestinationPrecision() {
        return destinationPrecision;
    }

    public void setDestinationPrecision(Long destinationPrecision) {
        this.destinationPrecision = destinationPrecision;
    }

    public Integer getDestinationScale() {
        return destinationScale;
    }

    public void setDestinationScale(Integer destinationScale) {
        this.destinationScale = destinationScale;
    }

    public Boolean getDestinationNullable() {
        return destinationNullable;
    }

    public void setDestinationNullable(Boolean destinationNullable) {
        this.destinationNullable = destinationNullable;
    }

    public Integer getDestinationCreateparams() {
        return destinationCreateparams;
    }

    public void setDestinationCreateparams(Integer destinationCreateparams) {
        this.destinationCreateparams = destinationCreateparams;
    }

    public Boolean getDataloss() {
        return dataloss;
    }

    public void setDataloss(Boolean dataloss) {
        this.dataloss = dataloss;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
}