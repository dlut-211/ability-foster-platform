package edu.dlut.ssdut.abilityfosterplatform.model;

public class FulltextStopwords {
    private Integer stoplistId;

    private String stopword;

    private String language;

    private Integer languageId;

    public Integer getStoplistId() {
        return stoplistId;
    }

    public void setStoplistId(Integer stoplistId) {
        this.stoplistId = stoplistId;
    }

    public String getStopword() {
        return stopword;
    }

    public void setStopword(String stopword) {
        this.stopword = stopword == null ? null : stopword.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }
}