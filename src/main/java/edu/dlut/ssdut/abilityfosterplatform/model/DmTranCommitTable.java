package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmTranCommitTable {
    private Long commitTs;

    private Long xdesId;

    private Long commitLbn;

    private Long commitCsn;

    private Date commitTime;

    public Long getCommitTs() {
        return commitTs;
    }

    public void setCommitTs(Long commitTs) {
        this.commitTs = commitTs;
    }

    public Long getXdesId() {
        return xdesId;
    }

    public void setXdesId(Long xdesId) {
        this.xdesId = xdesId;
    }

    public Long getCommitLbn() {
        return commitLbn;
    }

    public void setCommitLbn(Long commitLbn) {
        this.commitLbn = commitLbn;
    }

    public Long getCommitCsn() {
        return commitCsn;
    }

    public void setCommitCsn(Long commitCsn) {
        this.commitCsn = commitCsn;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }
}