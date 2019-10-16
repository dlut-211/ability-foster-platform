package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsClusterNodes {
    private String nodename;

    private Integer status;

    private String statusDescription;

    private Boolean isCurrentOwner;

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription == null ? null : statusDescription.trim();
    }

    public Boolean getIsCurrentOwner() {
        return isCurrentOwner;
    }

    public void setIsCurrentOwner(Boolean isCurrentOwner) {
        this.isCurrentOwner = isCurrentOwner;
    }
}