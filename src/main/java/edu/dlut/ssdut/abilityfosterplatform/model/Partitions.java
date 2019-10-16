package edu.dlut.ssdut.abilityfosterplatform.model;

public class Partitions {
    private Long partitionId;

    private Integer objectId;

    private Integer indexId;

    private Integer partitionNumber;

    private Long hobtId;

    private Long rows;

    private Short filestreamFilegroupId;

    private Byte dataCompression;

    private String dataCompressionDesc;

    public Long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Long partitionId) {
        this.partitionId = partitionId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public Integer getPartitionNumber() {
        return partitionNumber;
    }

    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    public Long getHobtId() {
        return hobtId;
    }

    public void setHobtId(Long hobtId) {
        this.hobtId = hobtId;
    }

    public Long getRows() {
        return rows;
    }

    public void setRows(Long rows) {
        this.rows = rows;
    }

    public Short getFilestreamFilegroupId() {
        return filestreamFilegroupId;
    }

    public void setFilestreamFilegroupId(Short filestreamFilegroupId) {
        this.filestreamFilegroupId = filestreamFilegroupId;
    }

    public Byte getDataCompression() {
        return dataCompression;
    }

    public void setDataCompression(Byte dataCompression) {
        this.dataCompression = dataCompression;
    }

    public String getDataCompressionDesc() {
        return dataCompressionDesc;
    }

    public void setDataCompressionDesc(String dataCompressionDesc) {
        this.dataCompressionDesc = dataCompressionDesc == null ? null : dataCompressionDesc.trim();
    }
}