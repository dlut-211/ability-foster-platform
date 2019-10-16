package edu.dlut.ssdut.abilityfosterplatform.model;

public class ServerEventSessionTargets {
    private Integer eventSessionId;

    private Integer targetId;

    private String name;

    private String package;

    private String module;

    public Integer getEventSessionId() {
        return eventSessionId;
    }

    public void setEventSessionId(Integer eventSessionId) {
        this.eventSessionId = eventSessionId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPackage() {
        return package;
    }

    public void setPackage(String package) {
        this.package = package == null ? null : package.trim();
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }
}