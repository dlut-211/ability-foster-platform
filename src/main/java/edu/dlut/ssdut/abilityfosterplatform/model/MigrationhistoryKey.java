package edu.dlut.ssdut.abilityfosterplatform.model;

public class MigrationhistoryKey {
    private String migrationid;

    private String contextkey;

    public String getMigrationid() {
        return migrationid;
    }

    public void setMigrationid(String migrationid) {
        this.migrationid = migrationid == null ? null : migrationid.trim();
    }

    public String getContextkey() {
        return contextkey;
    }

    public void setContextkey(String contextkey) {
        this.contextkey = contextkey == null ? null : contextkey.trim();
    }
}