package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsHosts {
    private String type;

    private String name;

    private Integer enqueuedTasksCount;

    private Integer activeTasksCount;

    private Integer completedIosCount;

    private Long completedIosInBytes;

    private Integer activeIosCount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getEnqueuedTasksCount() {
        return enqueuedTasksCount;
    }

    public void setEnqueuedTasksCount(Integer enqueuedTasksCount) {
        this.enqueuedTasksCount = enqueuedTasksCount;
    }

    public Integer getActiveTasksCount() {
        return activeTasksCount;
    }

    public void setActiveTasksCount(Integer activeTasksCount) {
        this.activeTasksCount = activeTasksCount;
    }

    public Integer getCompletedIosCount() {
        return completedIosCount;
    }

    public void setCompletedIosCount(Integer completedIosCount) {
        this.completedIosCount = completedIosCount;
    }

    public Long getCompletedIosInBytes() {
        return completedIosInBytes;
    }

    public void setCompletedIosInBytes(Long completedIosInBytes) {
        this.completedIosInBytes = completedIosInBytes;
    }

    public Integer getActiveIosCount() {
        return activeIosCount;
    }

    public void setActiveIosCount(Integer activeIosCount) {
        this.activeIosCount = activeIosCount;
    }
}