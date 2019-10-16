package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmOsChildInstances {
    private String owningPrincipalName;

    private String owningPrincipalSid;

    private String instanceName;

    private String instancePipeName;

    private Integer osProcessId;

    private Date osProcessCreationDate;

    private String heartBeat;

    private byte[] owningPrincipalSidBinary;

    public String getOwningPrincipalName() {
        return owningPrincipalName;
    }

    public void setOwningPrincipalName(String owningPrincipalName) {
        this.owningPrincipalName = owningPrincipalName == null ? null : owningPrincipalName.trim();
    }

    public String getOwningPrincipalSid() {
        return owningPrincipalSid;
    }

    public void setOwningPrincipalSid(String owningPrincipalSid) {
        this.owningPrincipalSid = owningPrincipalSid == null ? null : owningPrincipalSid.trim();
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName == null ? null : instanceName.trim();
    }

    public String getInstancePipeName() {
        return instancePipeName;
    }

    public void setInstancePipeName(String instancePipeName) {
        this.instancePipeName = instancePipeName == null ? null : instancePipeName.trim();
    }

    public Integer getOsProcessId() {
        return osProcessId;
    }

    public void setOsProcessId(Integer osProcessId) {
        this.osProcessId = osProcessId;
    }

    public Date getOsProcessCreationDate() {
        return osProcessCreationDate;
    }

    public void setOsProcessCreationDate(Date osProcessCreationDate) {
        this.osProcessCreationDate = osProcessCreationDate;
    }

    public String getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(String heartBeat) {
        this.heartBeat = heartBeat == null ? null : heartBeat.trim();
    }

    public byte[] getOwningPrincipalSidBinary() {
        return owningPrincipalSidBinary;
    }

    public void setOwningPrincipalSidBinary(byte[] owningPrincipalSidBinary) {
        this.owningPrincipalSidBinary = owningPrincipalSidBinary;
    }
}