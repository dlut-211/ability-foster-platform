package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsIndexKeywords {
    private String displayTerm;

    private Integer columnId;

    private Long documentCount;

    private byte[] keyword;

    public String getDisplayTerm() {
        return displayTerm;
    }

    public void setDisplayTerm(String displayTerm) {
        this.displayTerm = displayTerm == null ? null : displayTerm.trim();
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Long getDocumentCount() {
        return documentCount;
    }

    public void setDocumentCount(Long documentCount) {
        this.documentCount = documentCount;
    }

    public byte[] getKeyword() {
        return keyword;
    }

    public void setKeyword(byte[] keyword) {
        this.keyword = keyword;
    }
}