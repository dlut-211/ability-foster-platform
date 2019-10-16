package edu.dlut.ssdut.abilityfosterplatform.model;

public class ResourceGovernorResourcePools {
    private Integer poolId;

    private String name;

    private Integer minCpuPercent;

    private Integer maxCpuPercent;

    private Integer minMemoryPercent;

    private Integer maxMemoryPercent;

    private Integer capCpuPercent;

    private Integer minIopsPerVolume;

    private Integer maxIopsPerVolume;

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMinCpuPercent() {
        return minCpuPercent;
    }

    public void setMinCpuPercent(Integer minCpuPercent) {
        this.minCpuPercent = minCpuPercent;
    }

    public Integer getMaxCpuPercent() {
        return maxCpuPercent;
    }

    public void setMaxCpuPercent(Integer maxCpuPercent) {
        this.maxCpuPercent = maxCpuPercent;
    }

    public Integer getMinMemoryPercent() {
        return minMemoryPercent;
    }

    public void setMinMemoryPercent(Integer minMemoryPercent) {
        this.minMemoryPercent = minMemoryPercent;
    }

    public Integer getMaxMemoryPercent() {
        return maxMemoryPercent;
    }

    public void setMaxMemoryPercent(Integer maxMemoryPercent) {
        this.maxMemoryPercent = maxMemoryPercent;
    }

    public Integer getCapCpuPercent() {
        return capCpuPercent;
    }

    public void setCapCpuPercent(Integer capCpuPercent) {
        this.capCpuPercent = capCpuPercent;
    }

    public Integer getMinIopsPerVolume() {
        return minIopsPerVolume;
    }

    public void setMinIopsPerVolume(Integer minIopsPerVolume) {
        this.minIopsPerVolume = minIopsPerVolume;
    }

    public Integer getMaxIopsPerVolume() {
        return maxIopsPerVolume;
    }

    public void setMaxIopsPerVolume(Integer maxIopsPerVolume) {
        this.maxIopsPerVolume = maxIopsPerVolume;
    }
}