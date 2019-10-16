package edu.dlut.ssdut.abilityfosterplatform.model;

public class FnTraceGettableWithBLOBs extends FnTraceGettable {
    private byte[] binarydata;

    private byte[] loginsid;

    private byte[] targetloginsid;

    private byte[] sqlhandle;

    private byte[] planhandle;

    public byte[] getBinarydata() {
        return binarydata;
    }

    public void setBinarydata(byte[] binarydata) {
        this.binarydata = binarydata;
    }

    public byte[] getLoginsid() {
        return loginsid;
    }

    public void setLoginsid(byte[] loginsid) {
        this.loginsid = loginsid;
    }

    public byte[] getTargetloginsid() {
        return targetloginsid;
    }

    public void setTargetloginsid(byte[] targetloginsid) {
        this.targetloginsid = targetloginsid;
    }

    public byte[] getSqlhandle() {
        return sqlhandle;
    }

    public void setSqlhandle(byte[] sqlhandle) {
        this.sqlhandle = sqlhandle;
    }

    public byte[] getPlanhandle() {
        return planhandle;
    }

    public void setPlanhandle(byte[] planhandle) {
        this.planhandle = planhandle;
    }
}