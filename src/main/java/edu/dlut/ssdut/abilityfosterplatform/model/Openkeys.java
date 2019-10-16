package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Openkeys {
    private Integer databaseId;

    private String databaseName;

    private Integer keyId;

    private String keyName;

    private String keyGuid;

    private Date openedDate;

    private Short status;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    public String getKeyGuid() {
        return keyGuid;
    }

    public void setKeyGuid(String keyGuid) {
        this.keyGuid = keyGuid == null ? null : keyGuid.trim();
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}