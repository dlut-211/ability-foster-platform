package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysdevices {
    private String name;

    private Integer size;

    private Integer low;

    private Integer high;

    private Short status;

    private Short cntrltype;

    private String phyname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getCntrltype() {
        return cntrltype;
    }

    public void setCntrltype(Short cntrltype) {
        this.cntrltype = cntrltype;
    }

    public String getPhyname() {
        return phyname;
    }

    public void setPhyname(String phyname) {
        this.phyname = phyname == null ? null : phyname.trim();
    }
}