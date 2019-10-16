package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;

public class AvailabilityDatabasesCluster {
    private String groupId;

    private String groupDatabaseId;

    private String databaseName;

    private BigDecimal truncationLsn;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getGroupDatabaseId() {
        return groupDatabaseId;
    }

    public void setGroupDatabaseId(String groupDatabaseId) {
        this.groupDatabaseId = groupDatabaseId == null ? null : groupDatabaseId.trim();
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    public BigDecimal getTruncationLsn() {
        return truncationLsn;
    }

    public void setTruncationLsn(BigDecimal truncationLsn) {
        this.truncationLsn = truncationLsn;
    }
}