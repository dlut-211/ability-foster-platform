package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFilestreamFileIoRequests {
    private Short currentSpid;

    private String requestType;

    private String requestState;

    private Integer requestId;

    private Integer irpId;

    private Integer handleId;

    public Short getCurrentSpid() {
        return currentSpid;
    }

    public void setCurrentSpid(Short currentSpid) {
        this.currentSpid = currentSpid;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType == null ? null : requestType.trim();
    }

    public String getRequestState() {
        return requestState;
    }

    public void setRequestState(String requestState) {
        this.requestState = requestState == null ? null : requestState.trim();
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getIrpId() {
        return irpId;
    }

    public void setIrpId(Integer irpId) {
        this.irpId = irpId;
    }

    public Integer getHandleId() {
        return handleId;
    }

    public void setHandleId(Integer handleId) {
        this.handleId = handleId;
    }
}