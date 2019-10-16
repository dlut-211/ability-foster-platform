package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysftsemanticsdb {
    private Integer databaseId;

    private Date registerDate;

    private Integer registeredBy;

    private String version;

    private String fileguid;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(Integer registeredBy) {
        this.registeredBy = registeredBy;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getFileguid() {
        return fileguid;
    }

    public void setFileguid(String fileguid) {
        this.fileguid = fileguid == null ? null : fileguid.trim();
    }
}