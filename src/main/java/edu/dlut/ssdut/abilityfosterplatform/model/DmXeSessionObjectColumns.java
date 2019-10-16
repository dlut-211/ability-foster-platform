package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmXeSessionObjectColumns {
    private String columnName;

    private Integer columnId;

    private String columnValue;

    private String objectType;

    private String objectName;

    private String objectPackageGuid;

    private byte[] eventSessionAddress;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public String getColumnValue() {
        return columnValue;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue == null ? null : columnValue.trim();
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    public String getObjectPackageGuid() {
        return objectPackageGuid;
    }

    public void setObjectPackageGuid(String objectPackageGuid) {
        this.objectPackageGuid = objectPackageGuid == null ? null : objectPackageGuid.trim();
    }

    public byte[] getEventSessionAddress() {
        return eventSessionAddress;
    }

    public void setEventSessionAddress(byte[] eventSessionAddress) {
        this.eventSessionAddress = eventSessionAddress;
    }
}