package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsFdhosts {
    private Integer fdhostId;

    private String fdhostName;

    private Integer fdhostProcessId;

    private String fdhostType;

    private Integer maxThread;

    private Integer batchCount;

    public Integer getFdhostId() {
        return fdhostId;
    }

    public void setFdhostId(Integer fdhostId) {
        this.fdhostId = fdhostId;
    }

    public String getFdhostName() {
        return fdhostName;
    }

    public void setFdhostName(String fdhostName) {
        this.fdhostName = fdhostName == null ? null : fdhostName.trim();
    }

    public Integer getFdhostProcessId() {
        return fdhostProcessId;
    }

    public void setFdhostProcessId(Integer fdhostProcessId) {
        this.fdhostProcessId = fdhostProcessId;
    }

    public String getFdhostType() {
        return fdhostType;
    }

    public void setFdhostType(String fdhostType) {
        this.fdhostType = fdhostType == null ? null : fdhostType.trim();
    }

    public Integer getMaxThread() {
        return maxThread;
    }

    public void setMaxThread(Integer maxThread) {
        this.maxThread = maxThread;
    }

    public Integer getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(Integer batchCount) {
        this.batchCount = batchCount;
    }
}