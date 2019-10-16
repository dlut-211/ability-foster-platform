package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsIndexKeywordsByProperty {
    private String displayTerm;

    private Integer columnId;

    private Long documentId;

    private Integer propertyId;

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

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public byte[] getKeyword() {
        return keyword;
    }

    public void setKeyword(byte[] keyword) {
        this.keyword = keyword;
    }
}