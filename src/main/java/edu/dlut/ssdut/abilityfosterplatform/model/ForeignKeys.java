package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class ForeignKeys {
    private String name;

    private Integer objectId;

    private Integer principalId;

    private Integer schemaId;

    private Integer parentObjectId;

    private String type;

    private String typeDesc;

    private Date createDate;

    private Date modifyDate;

    private Boolean isMsShipped;

    private Boolean isPublished;

    private Boolean isSchemaPublished;

    private Integer referencedObjectId;

    private Integer keyIndexId;

    private Boolean isDisabled;

    private Boolean isNotForReplication;

    private Boolean isNotTrusted;

    private Byte deleteReferentialAction;

    private String deleteReferentialActionDesc;

    private Byte updateReferentialAction;

    private String updateReferentialActionDesc;

    private Boolean isSystemNamed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public Integer getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(Integer schemaId) {
        this.schemaId = schemaId;
    }

    public Integer getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(Integer parentObjectId) {
        this.parentObjectId = parentObjectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Boolean getIsMsShipped() {
        return isMsShipped;
    }

    public void setIsMsShipped(Boolean isMsShipped) {
        this.isMsShipped = isMsShipped;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public Boolean getIsSchemaPublished() {
        return isSchemaPublished;
    }

    public void setIsSchemaPublished(Boolean isSchemaPublished) {
        this.isSchemaPublished = isSchemaPublished;
    }

    public Integer getReferencedObjectId() {
        return referencedObjectId;
    }

    public void setReferencedObjectId(Integer referencedObjectId) {
        this.referencedObjectId = referencedObjectId;
    }

    public Integer getKeyIndexId() {
        return keyIndexId;
    }

    public void setKeyIndexId(Integer keyIndexId) {
        this.keyIndexId = keyIndexId;
    }

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Boolean getIsNotForReplication() {
        return isNotForReplication;
    }

    public void setIsNotForReplication(Boolean isNotForReplication) {
        this.isNotForReplication = isNotForReplication;
    }

    public Boolean getIsNotTrusted() {
        return isNotTrusted;
    }

    public void setIsNotTrusted(Boolean isNotTrusted) {
        this.isNotTrusted = isNotTrusted;
    }

    public Byte getDeleteReferentialAction() {
        return deleteReferentialAction;
    }

    public void setDeleteReferentialAction(Byte deleteReferentialAction) {
        this.deleteReferentialAction = deleteReferentialAction;
    }

    public String getDeleteReferentialActionDesc() {
        return deleteReferentialActionDesc;
    }

    public void setDeleteReferentialActionDesc(String deleteReferentialActionDesc) {
        this.deleteReferentialActionDesc = deleteReferentialActionDesc == null ? null : deleteReferentialActionDesc.trim();
    }

    public Byte getUpdateReferentialAction() {
        return updateReferentialAction;
    }

    public void setUpdateReferentialAction(Byte updateReferentialAction) {
        this.updateReferentialAction = updateReferentialAction;
    }

    public String getUpdateReferentialActionDesc() {
        return updateReferentialActionDesc;
    }

    public void setUpdateReferentialActionDesc(String updateReferentialActionDesc) {
        this.updateReferentialActionDesc = updateReferentialActionDesc == null ? null : updateReferentialActionDesc.trim();
    }

    public Boolean getIsSystemNamed() {
        return isSystemNamed;
    }

    public void setIsSystemNamed(Boolean isSystemNamed) {
        this.isSystemNamed = isSystemNamed;
    }
}