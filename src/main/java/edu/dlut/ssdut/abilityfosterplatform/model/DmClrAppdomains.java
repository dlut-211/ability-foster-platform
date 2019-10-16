package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmClrAppdomains {
    private Integer appdomainId;

    private String appdomainName;

    private Date creationTime;

    private Integer dbId;

    private Integer userId;

    private String state;

    private Integer strongRefcount;

    private Integer weakRefcount;

    private Integer cost;

    private Integer value;

    private Integer compatibilityLevel;

    private Long totalProcessorTimeMs;

    private Long totalAllocatedMemoryKb;

    private Long survivedMemoryKb;

    private byte[] appdomainAddress;

    public Integer getAppdomainId() {
        return appdomainId;
    }

    public void setAppdomainId(Integer appdomainId) {
        this.appdomainId = appdomainId;
    }

    public String getAppdomainName() {
        return appdomainName;
    }

    public void setAppdomainName(String appdomainName) {
        this.appdomainName = appdomainName == null ? null : appdomainName.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getDbId() {
        return dbId;
    }

    public void setDbId(Integer dbId) {
        this.dbId = dbId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getStrongRefcount() {
        return strongRefcount;
    }

    public void setStrongRefcount(Integer strongRefcount) {
        this.strongRefcount = strongRefcount;
    }

    public Integer getWeakRefcount() {
        return weakRefcount;
    }

    public void setWeakRefcount(Integer weakRefcount) {
        this.weakRefcount = weakRefcount;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getCompatibilityLevel() {
        return compatibilityLevel;
    }

    public void setCompatibilityLevel(Integer compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

    public Long getTotalProcessorTimeMs() {
        return totalProcessorTimeMs;
    }

    public void setTotalProcessorTimeMs(Long totalProcessorTimeMs) {
        this.totalProcessorTimeMs = totalProcessorTimeMs;
    }

    public Long getTotalAllocatedMemoryKb() {
        return totalAllocatedMemoryKb;
    }

    public void setTotalAllocatedMemoryKb(Long totalAllocatedMemoryKb) {
        this.totalAllocatedMemoryKb = totalAllocatedMemoryKb;
    }

    public Long getSurvivedMemoryKb() {
        return survivedMemoryKb;
    }

    public void setSurvivedMemoryKb(Long survivedMemoryKb) {
        this.survivedMemoryKb = survivedMemoryKb;
    }

    public byte[] getAppdomainAddress() {
        return appdomainAddress;
    }

    public void setAppdomainAddress(byte[] appdomainAddress) {
        this.appdomainAddress = appdomainAddress;
    }
}