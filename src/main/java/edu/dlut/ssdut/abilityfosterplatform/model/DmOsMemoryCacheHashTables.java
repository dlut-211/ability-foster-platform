package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryCacheHashTables {
    private String name;

    private String type;

    private Integer tableLevel;

    private Integer bucketsCount;

    private Integer bucketsInUseCount;

    private Integer bucketsMinLength;

    private Integer bucketsMaxLength;

    private Integer bucketsAvgLength;

    private Integer bucketsMaxLengthEver;

    private Long hitsCount;

    private Long missesCount;

    private Integer bucketsAvgScanHitLength;

    private Integer bucketsAvgScanMissLength;

    private byte[] cacheAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getTableLevel() {
        return tableLevel;
    }

    public void setTableLevel(Integer tableLevel) {
        this.tableLevel = tableLevel;
    }

    public Integer getBucketsCount() {
        return bucketsCount;
    }

    public void setBucketsCount(Integer bucketsCount) {
        this.bucketsCount = bucketsCount;
    }

    public Integer getBucketsInUseCount() {
        return bucketsInUseCount;
    }

    public void setBucketsInUseCount(Integer bucketsInUseCount) {
        this.bucketsInUseCount = bucketsInUseCount;
    }

    public Integer getBucketsMinLength() {
        return bucketsMinLength;
    }

    public void setBucketsMinLength(Integer bucketsMinLength) {
        this.bucketsMinLength = bucketsMinLength;
    }

    public Integer getBucketsMaxLength() {
        return bucketsMaxLength;
    }

    public void setBucketsMaxLength(Integer bucketsMaxLength) {
        this.bucketsMaxLength = bucketsMaxLength;
    }

    public Integer getBucketsAvgLength() {
        return bucketsAvgLength;
    }

    public void setBucketsAvgLength(Integer bucketsAvgLength) {
        this.bucketsAvgLength = bucketsAvgLength;
    }

    public Integer getBucketsMaxLengthEver() {
        return bucketsMaxLengthEver;
    }

    public void setBucketsMaxLengthEver(Integer bucketsMaxLengthEver) {
        this.bucketsMaxLengthEver = bucketsMaxLengthEver;
    }

    public Long getHitsCount() {
        return hitsCount;
    }

    public void setHitsCount(Long hitsCount) {
        this.hitsCount = hitsCount;
    }

    public Long getMissesCount() {
        return missesCount;
    }

    public void setMissesCount(Long missesCount) {
        this.missesCount = missesCount;
    }

    public Integer getBucketsAvgScanHitLength() {
        return bucketsAvgScanHitLength;
    }

    public void setBucketsAvgScanHitLength(Integer bucketsAvgScanHitLength) {
        this.bucketsAvgScanHitLength = bucketsAvgScanHitLength;
    }

    public Integer getBucketsAvgScanMissLength() {
        return bucketsAvgScanMissLength;
    }

    public void setBucketsAvgScanMissLength(Integer bucketsAvgScanMissLength) {
        this.bucketsAvgScanMissLength = bucketsAvgScanMissLength;
    }

    public byte[] getCacheAddress() {
        return cacheAddress;
    }

    public void setCacheAddress(byte[] cacheAddress) {
        this.cacheAddress = cacheAddress;
    }
}