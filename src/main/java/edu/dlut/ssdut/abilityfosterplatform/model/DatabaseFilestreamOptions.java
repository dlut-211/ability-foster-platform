package edu.dlut.ssdut.abilityfosterplatform.model;

public class DatabaseFilestreamOptions {
    private Integer databaseId;

    private Byte nonTransactedAccess;

    private String nonTransactedAccessDesc;

    private String directoryName;

    public Integer getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public Byte getNonTransactedAccess() {
        return nonTransactedAccess;
    }

    public void setNonTransactedAccess(Byte nonTransactedAccess) {
        this.nonTransactedAccess = nonTransactedAccess;
    }

    public String getNonTransactedAccessDesc() {
        return nonTransactedAccessDesc;
    }

    public void setNonTransactedAccessDesc(String nonTransactedAccessDesc) {
        this.nonTransactedAccessDesc = nonTransactedAccessDesc == null ? null : nonTransactedAccessDesc.trim();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName == null ? null : directoryName.trim();
    }
}