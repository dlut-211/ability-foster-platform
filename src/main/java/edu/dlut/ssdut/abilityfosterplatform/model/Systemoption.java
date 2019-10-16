package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Systemoption {
    private Integer id;

    private String optioncode;

    private String optionvalue;

    private String optiontype;

    private String optiontypename;

    private Integer showorder;

    private Integer createdby;

    private Date createdon;

    private Integer modifiedby;

    private Date modifiedon;

    private byte[] versionnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOptioncode() {
        return optioncode;
    }

    public void setOptioncode(String optioncode) {
        this.optioncode = optioncode == null ? null : optioncode.trim();
    }

    public String getOptionvalue() {
        return optionvalue;
    }

    public void setOptionvalue(String optionvalue) {
        this.optionvalue = optionvalue == null ? null : optionvalue.trim();
    }

    public String getOptiontype() {
        return optiontype;
    }

    public void setOptiontype(String optiontype) {
        this.optiontype = optiontype == null ? null : optiontype.trim();
    }

    public String getOptiontypename() {
        return optiontypename;
    }

    public void setOptiontypename(String optiontypename) {
        this.optiontypename = optiontypename == null ? null : optiontypename.trim();
    }

    public Integer getShoworder() {
        return showorder;
    }

    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
    }

    public Integer getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public Integer getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Integer modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Date getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(Date modifiedon) {
        this.modifiedon = modifiedon;
    }

    public byte[] getVersionnumber() {
        return versionnumber;
    }

    public void setVersionnumber(byte[] versionnumber) {
        this.versionnumber = versionnumber;
    }
}