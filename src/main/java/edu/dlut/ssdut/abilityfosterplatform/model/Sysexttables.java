package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysexttables {
    private Integer objectId;

    private Integer dataSourceId;

    private Integer fileFormatId;

    private String location;

    private String rejectType;

    private Double rejectValue;

    private Double rejectSampleValue;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public Integer getFileFormatId() {
        return fileFormatId;
    }

    public void setFileFormatId(Integer fileFormatId) {
        this.fileFormatId = fileFormatId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getRejectType() {
        return rejectType;
    }

    public void setRejectType(String rejectType) {
        this.rejectType = rejectType == null ? null : rejectType.trim();
    }

    public Double getRejectValue() {
        return rejectValue;
    }

    public void setRejectValue(Double rejectValue) {
        this.rejectValue = rejectValue;
    }

    public Double getRejectSampleValue() {
        return rejectSampleValue;
    }

    public void setRejectSampleValue(Double rejectSampleValue) {
        this.rejectSampleValue = rejectSampleValue;
    }
}