package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnListextendedproperty {
    private String objtype;

    private String objname;

    private String name;

    private Object value;

    public String getObjtype() {
        return objtype;
    }

    public void setObjtype(String objtype) {
        this.objtype = objtype == null ? null : objtype.trim();
    }

    public String getObjname() {
        return objname;
    }

    public void setObjname(String objname) {
        this.objname = objname == null ? null : objname.trim();
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