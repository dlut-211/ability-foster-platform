package edu.dlut.ssdut.abilityfosterplatform.model;

public class FulltextSystemStopwords {
    private String stopword;

    private Integer languageId;

    public String getStopword() {
        return stopword;
    }

    public void setStopword(String stopword) {
        this.stopword = stopword == null ? null : stopword.trim();
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }
}