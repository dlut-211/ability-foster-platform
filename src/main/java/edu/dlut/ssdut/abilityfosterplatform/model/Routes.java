package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Routes {
    private String name;

    private Integer routeId;

    private Integer principalId;

    private String remoteServiceName;

    private String brokerInstance;

    private Date lifetime;

    private String address;

    private String mirrorAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public String getRemoteServiceName() {
        return remoteServiceName;
    }

    public void setRemoteServiceName(String remoteServiceName) {
        this.remoteServiceName = remoteServiceName == null ? null : remoteServiceName.trim();
    }

    public String getBrokerInstance() {
        return brokerInstance;
    }

    public void setBrokerInstance(String brokerInstance) {
        this.brokerInstance = brokerInstance == null ? null : brokerInstance.trim();
    }

    public Date getLifetime() {
        return lifetime;
    }

    public void setLifetime(Date lifetime) {
        this.lifetime = lifetime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMirrorAddress() {
        return mirrorAddress;
    }

    public void setMirrorAddress(String mirrorAddress) {
        this.mirrorAddress = mirrorAddress == null ? null : mirrorAddress.trim();
    }
}