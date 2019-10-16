package edu.dlut.ssdut.abilityfosterplatform.model;

public class CryptPropertiesWithBLOBs extends CryptProperties {
    private byte[] thumbprint;

    private byte[] cryptProperty;

    public byte[] getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(byte[] thumbprint) {
        this.thumbprint = thumbprint;
    }

    public byte[] getCryptProperty() {
        return cryptProperty;
    }

    public void setCryptProperty(byte[] cryptProperty) {
        this.cryptProperty = cryptProperty;
    }
}