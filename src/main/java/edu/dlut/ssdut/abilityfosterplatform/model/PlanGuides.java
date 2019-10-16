package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class PlanGuides {
    private Integer planGuideId;

    private String name;

    private Date createDate;

    private Date modifyDate;

    private Boolean isDisabled;

    private String queryText;

    private Byte scopeType;

    private String scopeTypeDesc;

    private Integer scopeObjectId;

    private String scopeBatch;

    private String parameters;

    private String hints;

    public Integer getPlanGuideId() {
        return planGuideId;
    }

    public void setPlanGuideId(Integer planGuideId) {
        this.planGuideId = planGuideId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText == null ? null : queryText.trim();
    }

    public Byte getScopeType() {
        return scopeType;
    }

    public void setScopeType(Byte scopeType) {
        this.scopeType = scopeType;
    }

    public String getScopeTypeDesc() {
        return scopeTypeDesc;
    }

    public void setScopeTypeDesc(String scopeTypeDesc) {
        this.scopeTypeDesc = scopeTypeDesc == null ? null : scopeTypeDesc.trim();
    }

    public Integer getScopeObjectId() {
        return scopeObjectId;
    }

    public void setScopeObjectId(Integer scopeObjectId) {
        this.scopeObjectId = scopeObjectId;
    }

    public String getScopeBatch() {
        return scopeBatch;
    }

    public void setScopeBatch(String scopeBatch) {
        this.scopeBatch = scopeBatch == null ? null : scopeBatch.trim();
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters == null ? null : parameters.trim();
    }

    public String getHints() {
        return hints;
    }

    public void setHints(String hints) {
        this.hints = hints == null ? null : hints.trim();
    }
}