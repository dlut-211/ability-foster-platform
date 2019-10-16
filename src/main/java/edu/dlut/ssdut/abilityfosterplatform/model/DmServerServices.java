package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmServerServices {
    private String servicename;

    private Integer startupType;

    private String startupTypeDesc;

    private Integer status;

    private String statusDesc;

    private Integer processId;

    private Object lastStartupTime;

    private String serviceAccount;

    private String filename;

    private String isClustered;

    private String clusterNodename;

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    public Integer getStartupType() {
        return startupType;
    }

    public void setStartupType(Integer startupType) {
        this.startupType = startupType;
    }

    public String getStartupTypeDesc() {
        return startupTypeDesc;
    }

    public void setStartupTypeDesc(String startupTypeDesc) {
        this.startupTypeDesc = startupTypeDesc == null ? null : startupTypeDesc.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc == null ? null : statusDesc.trim();
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public Object getLastStartupTime() {
        return lastStartupTime;
    }

    public void setLastStartupTime(Object lastStartupTime) {
        this.lastStartupTime = lastStartupTime;
    }

    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount == null ? null : serviceAccount.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getIsClustered() {
        return isClustered;
    }

    public void setIsClustered(String isClustered) {
        this.isClustered = isClustered == null ? null : isClustered.trim();
    }

    public String getClusterNodename() {
        return clusterNodename;
    }

    public void setClusterNodename(String clusterNodename) {
        this.clusterNodename = clusterNodename == null ? null : clusterNodename.trim();
    }
}