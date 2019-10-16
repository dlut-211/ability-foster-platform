package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnSqlagentSubsystems {
    private Integer subsystemId;

    private String subsystem;

    private Integer descriptionId;

    private String subsystemDll;

    private String agentExe;

    private String startEntryPoint;

    private String eventEntryPoint;

    private String stopEntryPoint;

    private Integer maxWorkerThreads;

    public Integer getSubsystemId() {
        return subsystemId;
    }

    public void setSubsystemId(Integer subsystemId) {
        this.subsystemId = subsystemId;
    }

    public String getSubsystem() {
        return subsystem;
    }

    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem == null ? null : subsystem.trim();
    }

    public Integer getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(Integer descriptionId) {
        this.descriptionId = descriptionId;
    }

    public String getSubsystemDll() {
        return subsystemDll;
    }

    public void setSubsystemDll(String subsystemDll) {
        this.subsystemDll = subsystemDll == null ? null : subsystemDll.trim();
    }

    public String getAgentExe() {
        return agentExe;
    }

    public void setAgentExe(String agentExe) {
        this.agentExe = agentExe == null ? null : agentExe.trim();
    }

    public String getStartEntryPoint() {
        return startEntryPoint;
    }

    public void setStartEntryPoint(String startEntryPoint) {
        this.startEntryPoint = startEntryPoint == null ? null : startEntryPoint.trim();
    }

    public String getEventEntryPoint() {
        return eventEntryPoint;
    }

    public void setEventEntryPoint(String eventEntryPoint) {
        this.eventEntryPoint = eventEntryPoint == null ? null : eventEntryPoint.trim();
    }

    public String getStopEntryPoint() {
        return stopEntryPoint;
    }

    public void setStopEntryPoint(String stopEntryPoint) {
        this.stopEntryPoint = stopEntryPoint == null ? null : stopEntryPoint.trim();
    }

    public Integer getMaxWorkerThreads() {
        return maxWorkerThreads;
    }

    public void setMaxWorkerThreads(Integer maxWorkerThreads) {
        this.maxWorkerThreads = maxWorkerThreads;
    }
}