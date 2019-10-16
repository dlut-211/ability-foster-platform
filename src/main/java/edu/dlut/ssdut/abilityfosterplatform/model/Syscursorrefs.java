package edu.dlut.ssdut.abilityfosterplatform.model;

public class Syscursorrefs {
    private String referenceName;

    private Byte cursorScope;

    private Integer cursorHandl;

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName == null ? null : referenceName.trim();
    }

    public Byte getCursorScope() {
        return cursorScope;
    }

    public void setCursorScope(Byte cursorScope) {
        this.cursorScope = cursorScope;
    }

    public Integer getCursorHandl() {
        return cursorHandl;
    }

    public void setCursorHandl(Integer cursorHandl) {
        this.cursorHandl = cursorHandl;
    }
}