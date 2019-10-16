package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class ServiceQueues {
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

    private Short maxReaders;

    private String activationProcedure;

    private Integer executeAsPrincipalId;

    private Boolean isActivationEnabled;

    private Boolean isReceiveEnabled;

    private Boolean isEnqueueEnabled;

    private Boolean isRetentionEnabled;

    private Boolean isPoisonMessageHandlingEnabled;

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

    public Short getMaxReaders() {
        return maxReaders;
    }

    public void setMaxReaders(Short maxReaders) {
        this.maxReaders = maxReaders;
    }

    public String getActivationProcedure() {
        return activationProcedure;
    }

    public void setActivationProcedure(String activationProcedure) {
        this.activationProcedure = activationProcedure == null ? null : activationProcedure.trim();
    }

    public Integer getExecuteAsPrincipalId() {
        return executeAsPrincipalId;
    }

    public void setExecuteAsPrincipalId(Integer executeAsPrincipalId) {
        this.executeAsPrincipalId = executeAsPrincipalId;
    }

    public Boolean getIsActivationEnabled() {
        return isActivationEnabled;
    }

    public void setIsActivationEnabled(Boolean isActivationEnabled) {
        this.isActivationEnabled = isActivationEnabled;
    }

    public Boolean getIsReceiveEnabled() {
        return isReceiveEnabled;
    }

    public void setIsReceiveEnabled(Boolean isReceiveEnabled) {
        this.isReceiveEnabled = isReceiveEnabled;
    }

    public Boolean getIsEnqueueEnabled() {
        return isEnqueueEnabled;
    }

    public void setIsEnqueueEnabled(Boolean isEnqueueEnabled) {
        this.isEnqueueEnabled = isEnqueueEnabled;
    }

    public Boolean getIsRetentionEnabled() {
        return isRetentionEnabled;
    }

    public void setIsRetentionEnabled(Boolean isRetentionEnabled) {
        this.isRetentionEnabled = isRetentionEnabled;
    }

    public Boolean getIsPoisonMessageHandlingEnabled() {
        return isPoisonMessageHandlingEnabled;
    }

    public void setIsPoisonMessageHandlingEnabled(Boolean isPoisonMessageHandlingEnabled) {
        this.isPoisonMessageHandlingEnabled = isPoisonMessageHandlingEnabled;
    }
}