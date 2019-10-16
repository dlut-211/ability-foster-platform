package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysxmlplacement {
    private Integer placingid;

    private Integer ordinal;

    private Integer placedid;

    private Integer status;

    private Integer minoccur;

    private Integer maxoccur;

    private String defval;

    public Integer getPlacingid() {
        return placingid;
    }

    public void setPlacingid(Integer placingid) {
        this.placingid = placingid;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public Integer getPlacedid() {
        return placedid;
    }

    public void setPlacedid(Integer placedid) {
        this.placedid = placedid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMinoccur() {
        return minoccur;
    }

    public void setMinoccur(Integer minoccur) {
        this.minoccur = minoccur;
    }

    public Integer getMaxoccur() {
        return maxoccur;
    }

    public void setMaxoccur(Integer maxoccur) {
        this.maxoccur = maxoccur;
    }

    public String getDefval() {
        return defval;
    }

    public void setDefval(String defval) {
        this.defval = defval == null ? null : defval.trim();
    }
}