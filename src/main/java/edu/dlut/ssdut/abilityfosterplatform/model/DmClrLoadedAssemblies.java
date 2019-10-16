package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmClrLoadedAssemblies {
    private Integer assemblyId;

    private Date loadTime;

    private byte[] appdomainAddress;

    public Integer getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(Integer assemblyId) {
        this.assemblyId = assemblyId;
    }

    public Date getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Date loadTime) {
        this.loadTime = loadTime;
    }

    public byte[] getAppdomainAddress() {
        return appdomainAddress;
    }

    public void setAppdomainAddress(byte[] appdomainAddress) {
        this.appdomainAddress = appdomainAddress;
    }
}