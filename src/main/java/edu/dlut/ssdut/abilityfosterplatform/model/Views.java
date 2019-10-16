package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Views {
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

    private Boolean isReplicated;

    private Boolean hasReplicationFilter;

    private Boolean hasOpaqueMetadata;

    private Boolean hasUncheckedAssemblyData;

    private Boolean withCheckOption;

    private Boolean isDateCorrelationView;

    private Boolean isTrackedByCdc;

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

    public Boolean getIsReplicated() {
        return isReplicated;
    }

    public void setIsReplicated(Boolean isReplicated) {
        this.isReplicated = isReplicated;
    }

    public Boolean getHasReplicationFilter() {
        return hasReplicationFilter;
    }

    public void setHasReplicationFilter(Boolean hasReplicationFilter) {
        this.hasReplicationFilter = hasReplicationFilter;
    }

    public Boolean getHasOpaqueMetadata() {
        return hasOpaqueMetadata;
    }

    public void setHasOpaqueMetadata(Boolean hasOpaqueMetadata) {
        this.hasOpaqueMetadata = hasOpaqueMetadata;
    }

    public Boolean getHasUncheckedAssemblyData() {
        return hasUncheckedAssemblyData;
    }

    public void setHasUncheckedAssemblyData(Boolean hasUncheckedAssemblyData) {
        this.hasUncheckedAssemblyData = hasUncheckedAssemblyData;
    }

    public Boolean getWithCheckOption() {
        return withCheckOption;
    }

    public void setWithCheckOption(Boolean withCheckOption) {
        this.withCheckOption = withCheckOption;
    }

    public Boolean getIsDateCorrelationView() {
        return isDateCorrelationView;
    }

    public void setIsDateCorrelationView(Boolean isDateCorrelationView) {
        this.isDateCorrelationView = isDateCorrelationView;
    }

    public Boolean getIsTrackedByCdc() {
        return isTrackedByCdc;
    }

    public void setIsTrackedByCdc(Boolean isTrackedByCdc) {
        this.isTrackedByCdc = isTrackedByCdc;
    }
}