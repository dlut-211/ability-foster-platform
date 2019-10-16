package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmSqlReferencedEntities {
    private Integer referencingMinorId;

    private String referencedServerName;

    private String referencedDatabaseName;

    private String referencedSchemaName;

    private String referencedEntityName;

    private String referencedMinorName;

    private Integer referencedId;

    private Integer referencedMinorId;

    private Byte referencedClass;

    private String referencedClassDesc;

    private Boolean isCallerDependent;

    private Boolean isAmbiguous;

    private Boolean isSelected;

    private Boolean isUpdated;

    private Boolean isSelectAll;

    private Boolean isAllColumnsFound;

    public Integer getReferencingMinorId() {
        return referencingMinorId;
    }

    public void setReferencingMinorId(Integer referencingMinorId) {
        this.referencingMinorId = referencingMinorId;
    }

    public String getReferencedServerName() {
        return referencedServerName;
    }

    public void setReferencedServerName(String referencedServerName) {
        this.referencedServerName = referencedServerName == null ? null : referencedServerName.trim();
    }

    public String getReferencedDatabaseName() {
        return referencedDatabaseName;
    }

    public void setReferencedDatabaseName(String referencedDatabaseName) {
        this.referencedDatabaseName = referencedDatabaseName == null ? null : referencedDatabaseName.trim();
    }

    public String getReferencedSchemaName() {
        return referencedSchemaName;
    }

    public void setReferencedSchemaName(String referencedSchemaName) {
        this.referencedSchemaName = referencedSchemaName == null ? null : referencedSchemaName.trim();
    }

    public String getReferencedEntityName() {
        return referencedEntityName;
    }

    public void setReferencedEntityName(String referencedEntityName) {
        this.referencedEntityName = referencedEntityName == null ? null : referencedEntityName.trim();
    }

    public String getReferencedMinorName() {
        return referencedMinorName;
    }

    public void setReferencedMinorName(String referencedMinorName) {
        this.referencedMinorName = referencedMinorName == null ? null : referencedMinorName.trim();
    }

    public Integer getReferencedId() {
        return referencedId;
    }

    public void setReferencedId(Integer referencedId) {
        this.referencedId = referencedId;
    }

    public Integer getReferencedMinorId() {
        return referencedMinorId;
    }

    public void setReferencedMinorId(Integer referencedMinorId) {
        this.referencedMinorId = referencedMinorId;
    }

    public Byte getReferencedClass() {
        return referencedClass;
    }

    public void setReferencedClass(Byte referencedClass) {
        this.referencedClass = referencedClass;
    }

    public String getReferencedClassDesc() {
        return referencedClassDesc;
    }

    public void setReferencedClassDesc(String referencedClassDesc) {
        this.referencedClassDesc = referencedClassDesc == null ? null : referencedClassDesc.trim();
    }

    public Boolean getIsCallerDependent() {
        return isCallerDependent;
    }

    public void setIsCallerDependent(Boolean isCallerDependent) {
        this.isCallerDependent = isCallerDependent;
    }

    public Boolean getIsAmbiguous() {
        return isAmbiguous;
    }

    public void setIsAmbiguous(Boolean isAmbiguous) {
        this.isAmbiguous = isAmbiguous;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public Boolean getIsUpdated() {
        return isUpdated;
    }

    public void setIsUpdated(Boolean isUpdated) {
        this.isUpdated = isUpdated;
    }

    public Boolean getIsSelectAll() {
        return isSelectAll;
    }

    public void setIsSelectAll(Boolean isSelectAll) {
        this.isSelectAll = isSelectAll;
    }

    public Boolean getIsAllColumnsFound() {
        return isAllColumnsFound;
    }

    public void setIsAllColumnsFound(Boolean isAllColumnsFound) {
        this.isAllColumnsFound = isAllColumnsFound;
    }
}