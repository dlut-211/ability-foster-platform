package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysconvgroup {
    private String id;

    private Integer serviceId;

    private Integer status;

    private Integer refcount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRefcount() {
        return refcount;
    }

    public void setRefcount(Integer refcount) {
        this.refcount = refcount;
    }
}