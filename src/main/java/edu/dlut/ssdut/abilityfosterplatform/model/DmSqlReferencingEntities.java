package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmSqlReferencingEntities {
    private String referencingSchemaName;

    private String referencingEntityName;

    private Integer referencingId;

    private Byte referencingClass;

    private String referencingClassDesc;

    private Boolean isCallerDependent;

    public String getReferencingSchemaName() {
        return referencingSchemaName;
    }

    public void setReferencingSchemaName(String referencingSchemaName) {
        this.referencingSchemaName = referencingSchemaName == null ? null : referencingSchemaName.trim();
    }

    public String getReferencingEntityName() {
        return referencingEntityName;
    }

    public void setReferencingEntityName(String referencingEntityName) {
        this.referencingEntityName = referencingEntityName == null ? null : referencingEntityName.trim();
    }

    public Integer getReferencingId() {
        return referencingId;
    }

    public void setReferencingId(Integer referencingId) {
        this.referencingId = referencingId;
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

    public Boolean getIsCallerDependent() {
        return isCallerDependent;
    }

    public void setIsCallerDependent(Boolean isCallerDependent) {
        this.isCallerDependent = isCallerDependent;
    }
}