package edu.dlut.ssdut.abilityfosterplatform.model;

public class ServerEventSessionEvents {
    private Integer eventSessionId;

    private Integer eventId;

    private String name;

    private String package;

    private String module;

    private String predicate;

    private String predicateXml;

    public Integer getEventSessionId() {
        return eventSessionId;
    }

    public void setEventSessionId(Integer eventSessionId) {
        this.eventSessionId = eventSessionId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
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

    public String getPredicate() {
        return predicate;
    }

    public void setPredicate(String predicate) {
        this.predicate = predicate == null ? null : predicate.trim();
    }

    public String getPredicateXml() {
        return predicateXml;
    }

    public void setPredicateXml(String predicateXml) {
        this.predicateXml = predicateXml == null ? null : predicateXml.trim();
    }
}