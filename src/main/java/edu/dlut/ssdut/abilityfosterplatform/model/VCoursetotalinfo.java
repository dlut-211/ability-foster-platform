package edu.dlut.ssdut.abilityfosterplatform.model;

public class VCoursetotalinfo {
    private Integer id;

    private String code;

    private String name;

    private String describe;

    private String createdbyname;

    private Integer yescount;

    private Integer nocount;

    private String workrate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getCreatedbyname() {
        return createdbyname;
    }

    public void setCreatedbyname(String createdbyname) {
        this.createdbyname = createdbyname == null ? null : createdbyname.trim();
    }

    public Integer getYescount() {
        return yescount;
    }

    public void setYescount(Integer yescount) {
        this.yescount = yescount;
    }

    public Integer getNocount() {
        return nocount;
    }

    public void setNocount(Integer nocount) {
        this.nocount = nocount;
    }

    public String getWorkrate() {
        return workrate;
    }

    public void setWorkrate(String workrate) {
        this.workrate = workrate == null ? null : workrate.trim();
    }
}