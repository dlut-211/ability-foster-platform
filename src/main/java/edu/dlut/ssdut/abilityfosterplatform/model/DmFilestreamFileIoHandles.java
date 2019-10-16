package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFilestreamFileIoHandles {
    private Integer creationRequestId;

    private Integer creationIrpId;

    private Integer handleId;

    private String accessType;

    private String logicalPath;

    private String physicalPath;

    public Integer getCreationRequestId() {
        return creationRequestId;
    }

    public void setCreationRequestId(Integer creationRequestId) {
        this.creationRequestId = creationRequestId;
    }

    public Integer getCreationIrpId() {
        return creationIrpId;
    }

    public void setCreationIrpId(Integer creationIrpId) {
        this.creationIrpId = creationIrpId;
    }

    public Integer getHandleId() {
        return handleId;
    }

    public void setHandleId(Integer handleId) {
        this.handleId = handleId;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType == null ? null : accessType.trim();
    }

    public String getLogicalPath() {
        return logicalPath;
    }

    public void setLogicalPath(String logicalPath) {
        this.logicalPath = logicalPath == null ? null : logicalPath.trim();
    }

    public String getPhysicalPath() {
        return physicalPath;
    }

    public void setPhysicalPath(String physicalPath) {
        this.physicalPath = physicalPath == null ? null : physicalPath.trim();
    }
}