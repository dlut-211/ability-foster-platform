package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmExecXmlHandles {
    private Integer sessionId;

    private Integer documentId;

    private Integer namespaceDocumentId;

    private Integer statementStartOffset;

    private Integer statementEndOffset;

    private Date creationTime;

    private Long originalDocumentSizeBytes;

    private Long originalNamespaceDocumentSizeBytes;

    private Long numOpenxmlCalls;

    private Long dormantDurationMs;

    private Long rowCount;

    private byte[] sqlHandle;

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Integer getNamespaceDocumentId() {
        return namespaceDocumentId;
    }

    public void setNamespaceDocumentId(Integer namespaceDocumentId) {
        this.namespaceDocumentId = namespaceDocumentId;
    }

    public Integer getStatementStartOffset() {
        return statementStartOffset;
    }

    public void setStatementStartOffset(Integer statementStartOffset) {
        this.statementStartOffset = statementStartOffset;
    }

    public Integer getStatementEndOffset() {
        return statementEndOffset;
    }

    public void setStatementEndOffset(Integer statementEndOffset) {
        this.statementEndOffset = statementEndOffset;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Long getOriginalDocumentSizeBytes() {
        return originalDocumentSizeBytes;
    }

    public void setOriginalDocumentSizeBytes(Long originalDocumentSizeBytes) {
        this.originalDocumentSizeBytes = originalDocumentSizeBytes;
    }

    public Long getOriginalNamespaceDocumentSizeBytes() {
        return originalNamespaceDocumentSizeBytes;
    }

    public void setOriginalNamespaceDocumentSizeBytes(Long originalNamespaceDocumentSizeBytes) {
        this.originalNamespaceDocumentSizeBytes = originalNamespaceDocumentSizeBytes;
    }

    public Long getNumOpenxmlCalls() {
        return numOpenxmlCalls;
    }

    public void setNumOpenxmlCalls(Long numOpenxmlCalls) {
        this.numOpenxmlCalls = numOpenxmlCalls;
    }

    public Long getDormantDurationMs() {
        return dormantDurationMs;
    }

    public void setDormantDurationMs(Long dormantDurationMs) {
        this.dormantDurationMs = dormantDurationMs;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }

    public byte[] getSqlHandle() {
        return sqlHandle;
    }

    public void setSqlHandle(byte[] sqlHandle) {
        this.sqlHandle = sqlHandle;
    }
}