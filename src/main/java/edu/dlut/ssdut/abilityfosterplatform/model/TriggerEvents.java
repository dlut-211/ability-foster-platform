package edu.dlut.ssdut.abilityfosterplatform.model;

public class TriggerEvents {
    private Integer objectId;

    private Integer type;

    private String typeDesc;

    private Boolean isFirst;

    private Boolean isLast;

    private Integer eventGroupType;

    private String eventGroupTypeDesc;

    private Boolean isTriggerEvent;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    public Boolean getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(Boolean isFirst) {
        this.isFirst = isFirst;
    }

    public Boolean getIsLast() {
        return isLast;
    }

    public void setIsLast(Boolean isLast) {
        this.isLast = isLast;
    }

    public Integer getEventGroupType() {
        return eventGroupType;
    }

    public void setEventGroupType(Integer eventGroupType) {
        this.eventGroupType = eventGroupType;
    }

    public String getEventGroupTypeDesc() {
        return eventGroupTypeDesc;
    }

    public void setEventGroupTypeDesc(String eventGroupTypeDesc) {
        this.eventGroupTypeDesc = eventGroupTypeDesc == null ? null : eventGroupTypeDesc.trim();
    }

    public Boolean getIsTriggerEvent() {
        return isTriggerEvent;
    }

    public void setIsTriggerEvent(Boolean isTriggerEvent) {
        this.isTriggerEvent = isTriggerEvent;
    }
}