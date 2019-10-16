package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscursortables {
    private Integer cursorHandle;

    private String tableOwner;

    private String tableName;

    private Short optimizerHint;

    private Short lockType;

    private String serverName;

    private Integer objectid;

    private Integer dbid;

    private String dbname;

    public Integer getCursorHandle() {
        return cursorHandle;
    }

    public void setCursorHandle(Integer cursorHandle) {
        this.cursorHandle = cursorHandle;
    }

    public String getTableOwner() {
        return tableOwner;
    }

    public void setTableOwner(String tableOwner) {
        this.tableOwner = tableOwner == null ? null : tableOwner.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public Short getOptimizerHint() {
        return optimizerHint;
    }

    public void setOptimizerHint(Short optimizerHint) {
        this.optimizerHint = optimizerHint;
    }

    public Short getLockType() {
        return lockType;
    }

    public void setLockType(Short lockType) {
        this.lockType = lockType;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public Integer getDbid() {
        return dbid;
    }

    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname == null ? null : dbname.trim();
    }
}