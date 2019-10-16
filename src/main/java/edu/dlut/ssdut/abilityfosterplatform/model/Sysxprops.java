package edu.dlut.ssdut.abilityfosterplatform.model;

public class Sysxprops {
    private Byte class;

    private Integer id;

    private Integer subid;

    private String name;

    private Object value;

    public Byte getClass() {
        return class;
    }

    public void setClass(Byte class) {
        this.class = class;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubid() {
        return subid;
    }

    public void setSubid(Integer subid) {
        this.subid = subid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}