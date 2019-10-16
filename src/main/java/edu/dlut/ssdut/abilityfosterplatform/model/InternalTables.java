package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class InternalTables {
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

    private Byte internalType;

    private String internalTypeDesc;

    private Integer parentId;

    private Integer parentMinorId;

    private Integer lobDataSpaceId;

    private Integer filestreamDataSpaceId;

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

    public Byte getInternalType() {
        return internalType;
    }

    public void setInternalType(Byte internalType) {
        this.internalType = internalType;
    }

    public String getInternalTypeDesc() {
        return internalTypeDesc;
    }

    public void setInternalTypeDesc(String internalTypeDesc) {
        this.internalTypeDesc = internalTypeDesc == null ? null : internalTypeDesc.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getParentMinorId() {
        return parentMinorId;
    }

    public void setParentMinorId(Integer parentMinorId) {
        this.parentMinorId = parentMinorId;
    }

    public Integer getLobDataSpaceId() {
        return lobDataSpaceId;
    }

    public void setLobDataSpaceId(Integer lobDataSpaceId) {
        this.lobDataSpaceId = lobDataSpaceId;
    }

    public Integer getFilestreamDataSpaceId() {
        return filestreamDataSpaceId;
    }

    public void setFilestreamDataSpaceId(Integer filestreamDataSpaceId) {
        this.filestreamDataSpaceId = filestreamDataSpaceId;
    }
}