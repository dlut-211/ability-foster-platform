package edu.dlut.ssdut.abilityfosterplatform.model;

public class SqlExpressionDependencies {
    private Integer referencingId;

    private Integer referencingMinorId;

    private Byte referencingClass;

    private String referencingClassDesc;

    private Boolean isSchemaBoundReference;

    private Byte referencedClass;

    private String referencedClassDesc;

    private String referencedServerName;

    private String referencedDatabaseName;

    private String referencedSchemaName;

    private String referencedEntityName;

    private Integer referencedId;

    private Integer referencedMinorId;

    private Boolean isCallerDependent;

    private Boolean isAmbiguous;

    public Integer getReferencingId() {
        return referencingId;
    }

    public void setReferencingId(Integer referencingId) {
        this.referencingId = referencingId;
    }

    public Integer getReferencingMinorId() {
        return referencingMinorId;
    }

    public void setReferencingMinorId(Integer referencingMinorId) {
        this.referencingMinorId = referencingMinorId;
    }

    public Byte getReferencingClass() {
        return referencingClass;
    }

    public void setReferencingClass(Byte referencingClass) {
        this.referencingClass = referencingClass;
    }

    public String getReferencingClassDesc() {
        return referencingClassDesc;
    }

    public void setReferencingClassDesc(String referencingClassDesc) {
        this.referencingClassDesc = referencingClassDesc == null ? null : referencingClassDesc.trim();
    }

    public Boolean getIsSchemaBoundReference() {
        return isSchemaBoundReference;
    }

    public void setIsSchemaBoundReference(Boolean isSchemaBoundReference) {
        this.isSchemaBoundReference = isSchemaBoundReference;
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
}