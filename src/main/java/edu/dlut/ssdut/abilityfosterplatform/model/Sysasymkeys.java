package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Sysasymkeys {
    private Integer id;

    private String name;

    private Integer bitlength;

    private String algorithm;

    private Date modified;

    private String encrtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBitlength() {
        return bitlength;
    }

    public void setBitlength(Integer bitlength) {
        this.bitlength = bitlength;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm == null ? null : algorithm.trim();
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getEncrtype() {
        return encrtype;
    }

    public void setEncrtype(String encrtype) {
        this.encrtype = encrtype == null ? null : encrtype.trim();
    }
}