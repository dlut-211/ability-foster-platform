package edu.dlut.ssdut.abilityfosterplatform.model;

public class ResourceGovernorWorkloadGroups {
    private Integer groupId;

    private String name;

    private String importance;

    private Integer requestMaxMemoryGrantPercent;

    private Integer requestMaxCpuTimeSec;

    private Integer requestMemoryGrantTimeoutSec;

    private Integer maxDop;

    private Integer groupMaxRequests;

    private Integer poolId;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance == null ? null : importance.trim();
    }

    public Integer getRequestMaxMemoryGrantPercent() {
        return requestMaxMemoryGrantPercent;
    }

    public void setRequestMaxMemoryGrantPercent(Integer requestMaxMemoryGrantPercent) {
        this.requestMaxMemoryGrantPercent = requestMaxMemoryGrantPercent;
    }

    public Integer getRequestMaxCpuTimeSec() {
        return requestMaxCpuTimeSec;
    }

    public void setRequestMaxCpuTimeSec(Integer requestMaxCpuTimeSec) {
        this.requestMaxCpuTimeSec = requestMaxCpuTimeSec;
    }

    public Integer getRequestMemoryGrantTimeoutSec() {
        return requestMemoryGrantTimeoutSec;
    }

    public void setRequestMemoryGrantTimeoutSec(Integer requestMemoryGrantTimeoutSec) {
        this.requestMemoryGrantTimeoutSec = requestMemoryGrantTimeoutSec;
    }

    public Integer getMaxDop() {
        return maxDop;
    }

    public void setMaxDop(Integer maxDop) {
        this.maxDop = maxDop;
    }

    public Integer getGroupMaxRequests() {
        return groupMaxRequests;
    }

    public void setGroupMaxRequests(Integer groupMaxRequests) {
        this.groupMaxRequests = groupMaxRequests;
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }
}