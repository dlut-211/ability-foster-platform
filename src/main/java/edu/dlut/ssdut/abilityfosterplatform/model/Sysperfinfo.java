package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysperfinfo {
    private String objectName;

    private String counterName;

    private String instanceName;

    private Long cntrValue;

    private Integer cntrType;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    public String getCounterName() {
        return counterName;
    }

    public void setCounterName(String counterName) {
        this.counterName = counterName == null ? null : counterName.trim();
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName == null ? null : instanceName.trim();
    }

    public Long getCntrValue() {
        return cntrValue;
    }

    public void setCntrValue(Long cntrValue) {
        this.cntrValue = cntrValue;
    }

    public Integer getCntrType() {
        return cntrType;
    }

    public void setCntrType(Integer cntrType) {
        this.cntrType = cntrType;
    }
}