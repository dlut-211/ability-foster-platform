package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class EventNotifications {
    private String name;

    private Integer objectId;

    private Byte parentClass;

    private String parentClassDesc;

    private Integer parentId;

    private Date createDate;

    private Date modifyDate;

    private String serviceName;

    private String brokerInstance;

    private Integer principalId;

    private byte[] creatorSid;

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

    public Byte getParentClass() {
        return parentClass;
    }

    public void setParentClass(Byte parentClass) {
        this.parentClass = parentClass;
    }

    public String getParentClassDesc() {
        return parentClassDesc;
    }

    public void setParentClassDesc(String parentClassDesc) {
        this.parentClassDesc = parentClassDesc == null ? null : parentClassDesc.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getBrokerInstance() {
        return brokerInstance;
    }

    public void setBrokerInstance(String brokerInstance) {
        this.brokerInstance = brokerInstance == null ? null : brokerInstance.trim();
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public byte[] getCreatorSid() {
        return creatorSid;
    }

    public void setCreatorSid(byte[] creatorSid) {
        this.creatorSid = creatorSid;
    }
}