package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmFtsParser {
    private Integer groupId;

    private Integer phraseId;

    private Integer occurrence;

    private String specialTerm;

    private String displayTerm;

    private Integer expansionType;

    private String sourceTerm;

    private byte[] keyword;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getPhraseId() {
        return phraseId;
    }

    public void setPhraseId(Integer phraseId) {
        this.phraseId = phraseId;
    }

    public Integer getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(Integer occurrence) {
        this.occurrence = occurrence;
    }

    public String getSpecialTerm() {
        return specialTerm;
    }

    public void setSpecialTerm(String specialTerm) {
        this.specialTerm = specialTerm == null ? null : specialTerm.trim();
    }

    public String getDisplayTerm() {
        return displayTerm;
    }

    public void setDisplayTerm(String displayTerm) {
        this.displayTerm = displayTerm == null ? null : displayTerm.trim();
    }

    public Integer getExpansionType() {
        return expansionType;
    }

    public void setExpansionType(Integer expansionType) {
        this.expansionType = expansionType;
    }

    public String getSourceTerm() {
        return sourceTerm;
    }

    public void setSourceTerm(String sourceTerm) {
        this.sourceTerm = sourceTerm == null ? null : sourceTerm.trim();
    }

    public byte[] getKeyword() {
        return keyword;
    }

    public void setKeyword(byte[] keyword) {
        this.keyword = keyword;
    }
}