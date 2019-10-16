package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syslanguages {
    private Short langid;

    private String dateformat;

    private Byte datefirst;

    private Integer upgrade;

    private String name;

    private String alias;

    private String months;

    private String shortmonths;

    private String days;

    private Integer lcid;

    private Short msglangid;

    public Short getLangid() {
        return langid;
    }

    public void setLangid(Short langid) {
        this.langid = langid;
    }

    public String getDateformat() {
        return dateformat;
    }

    public void setDateformat(String dateformat) {
        this.dateformat = dateformat == null ? null : dateformat.trim();
    }

    public Byte getDatefirst() {
        return datefirst;
    }

    public void setDatefirst(Byte datefirst) {
        this.datefirst = datefirst;
    }

    public Integer getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(Integer upgrade) {
        this.upgrade = upgrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months == null ? null : months.trim();
    }

    public String getShortmonths() {
        return shortmonths;
    }

    public void setShortmonths(String shortmonths) {
        this.shortmonths = shortmonths == null ? null : shortmonths.trim();
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days == null ? null : days.trim();
    }

    public Integer getLcid() {
        return lcid;
    }

    public void setLcid(Integer lcid) {
        this.lcid = lcid;
    }

    public Short getMsglangid() {
        return msglangid;
    }

    public void setMsglangid(Short msglangid) {
        this.msglangid = msglangid;
    }
}