package edu.dlut.ssdut.abilityfosterplatform.model;

public class ServerEventSessionFields {
    private Integer eventSessionId;

    private Integer objectId;

    private String name;

    private Object value;

    public Integer getEventSessionId() {
        return eventSessionId;
    }

    public void setEventSessionId(Integer eventSessionId) {
        this.eventSessionId = eventSessionId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}