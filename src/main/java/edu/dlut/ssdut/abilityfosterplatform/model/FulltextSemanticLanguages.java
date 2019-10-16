package edu.dlut.ssdut.abilityfosterplatform.model;

public class FulltextSemanticLanguages {
    private Integer lcid;

    private String name;

    public Integer getLcid() {
        return lcid;
    }

    public void setLcid(Integer lcid) {
        this.lcid = lcid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}