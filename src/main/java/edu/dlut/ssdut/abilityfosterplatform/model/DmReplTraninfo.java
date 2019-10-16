package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmReplTraninfo {
    private Byte fp2pPubExists;

    private Integer dbVer;

    private String beginLsn;

    private String commitLsn;

    private Short dbid;

    private Integer rows;

    private String xdesid;

    private String server;

    private Integer serverLenInBytes;

    private String database;

    private Integer dbLenInBytes;

    private String originator;

    private Integer originatorLenInBytes;

    private String origDb;

    private Integer origDbLenInBytes;

    private Integer cmdsInTran;

    private Byte isBoundedupdateSingleton;

    private String beginUpdateLsn;

    private String deleteLsn;

    private String lastEndLsn;

    private Byte fcomplete;

    private Byte fcompensated;

    private Byte fprocessingtext;

    private Integer maxCmdsInTran;

    private Date beginTime;

    private Date commitTime;

    private Integer sessionId;

    private String sessionPhase;

    private Byte isKnownCdcTran;

    private Integer errorCount;

    public Byte getFp2pPubExists() {
        return fp2pPubExists;
    }

    public void setFp2pPubExists(Byte fp2pPubExists) {
        this.fp2pPubExists = fp2pPubExists;
    }

    public Integer getDbVer() {
        return dbVer;
    }

    public void setDbVer(Integer dbVer) {
        this.dbVer = dbVer;
    }

    public String getBeginLsn() {
        return beginLsn;
    }

    public void setBeginLsn(String beginLsn) {
        this.beginLsn = beginLsn == null ? null : beginLsn.trim();
    }

    public String getCommitLsn() {
        return commitLsn;
    }

    public void setCommitLsn(String commitLsn) {
        this.commitLsn = commitLsn == null ? null : commitLsn.trim();
    }

    public Short getDbid() {
        return dbid;
    }

    public void setDbid(Short dbid) {
        this.dbid = dbid;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getXdesid() {
        return xdesid;
    }

    public void setXdesid(String xdesid) {
        this.xdesid = xdesid == null ? null : xdesid.trim();
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server == null ? null : server.trim();
    }

    public Integer getServerLenInBytes() {
        return serverLenInBytes;
    }

    public void setServerLenInBytes(Integer serverLenInBytes) {
        this.serverLenInBytes = serverLenInBytes;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database == null ? null : database.trim();
    }

    public Integer getDbLenInBytes() {
        return dbLenInBytes;
    }

    public void setDbLenInBytes(Integer dbLenInBytes) {
        this.dbLenInBytes = dbLenInBytes;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator == null ? null : originator.trim();
    }

    public Integer getOriginatorLenInBytes() {
        return originatorLenInBytes;
    }

    public void setOriginatorLenInBytes(Integer originatorLenInBytes) {
        this.originatorLenInBytes = originatorLenInBytes;
    }

    public String getOrigDb() {
        return origDb;
    }

    public void setOrigDb(String origDb) {
        this.origDb = origDb == null ? null : origDb.trim();
    }

    public Integer getOrigDbLenInBytes() {
        return origDbLenInBytes;
    }

    public void setOrigDbLenInBytes(Integer origDbLenInBytes) {
        this.origDbLenInBytes = origDbLenInBytes;
    }

    public Integer getCmdsInTran() {
        return cmdsInTran;
    }

    public void setCmdsInTran(Integer cmdsInTran) {
        this.cmdsInTran = cmdsInTran;
    }

    public Byte getIsBoundedupdateSingleton() {
        return isBoundedupdateSingleton;
    }

    public void setIsBoundedupdateSingleton(Byte isBoundedupdateSingleton) {
        this.isBoundedupdateSingleton = isBoundedupdateSingleton;
    }

    public String getBeginUpdateLsn() {
        return beginUpdateLsn;
    }

    public void setBeginUpdateLsn(String beginUpdateLsn) {
        this.beginUpdateLsn = beginUpdateLsn == null ? null : beginUpdateLsn.trim();
    }

    public String getDeleteLsn() {
        return deleteLsn;
    }

    public void setDeleteLsn(String deleteLsn) {
        this.deleteLsn = deleteLsn == null ? null : deleteLsn.trim();
    }

    public String getLastEndLsn() {
        return lastEndLsn;
    }

    public void setLastEndLsn(String lastEndLsn) {
        this.lastEndLsn = lastEndLsn == null ? null : lastEndLsn.trim();
    }

    public Byte getFcomplete() {
        return fcomplete;
    }

    public void setFcomplete(Byte fcomplete) {
        this.fcomplete = fcomplete;
    }

    public Byte getFcompensated() {
        return fcompensated;
    }

    public void setFcompensated(Byte fcompensated) {
        this.fcompensated = fcompensated;
    }

    public Byte getFprocessingtext() {
        return fprocessingtext;
    }

    public void setFprocessingtext(Byte fprocessingtext) {
        this.fprocessingtext = fprocessingtext;
    }

    public Integer getMaxCmdsInTran() {
        return maxCmdsInTran;
    }

    public void setMaxCmdsInTran(Integer maxCmdsInTran) {
        this.maxCmdsInTran = maxCmdsInTran;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionPhase() {
        return sessionPhase;
    }

    public void setSessionPhase(String sessionPhase) {
        this.sessionPhase = sessionPhase == null ? null : sessionPhase.trim();
    }

    public Byte getIsKnownCdcTran() {
        return isKnownCdcTran;
    }

    public void setIsKnownCdcTran(Byte isKnownCdcTran) {
        this.isKnownCdcTran = isKnownCdcTran;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }
}