package edu.dlut.ssdut.abilityfosterplatform.model;

public class Migrationhistory extends MigrationhistoryKey {
    private String productversion;

    private byte[] model;

    public String getProductversion() {
        return productversion;
    }

    public void setProductversion(String productversion) {
        this.productversion = productversion == null ? null : productversion.trim();
    }

    public byte[] getModel() {
        return model;
    }

    public void setModel(byte[] model) {
        this.model = model;
    }
}