package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class DmXeSessions {
    private String name;

    private Integer pendingBuffers;

    private Integer totalRegularBuffers;

    private Long regularBufferSize;

    private Integer totalLargeBuffers;

    private Long largeBufferSize;

    private Long totalBufferSize;

    private Integer bufferPolicyFlags;

    private String bufferPolicyDesc;

    private Integer flags;

    private String flagDesc;

    private Integer droppedEventCount;

    private Integer droppedBufferCount;

    private Integer blockedEventFireTime;

    private Date createTime;

    private Integer largestEventDroppedSize;

    private String sessionSource;

    private byte[] address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPendingBuffers() {
        return pendingBuffers;
    }

    public void setPendingBuffers(Integer pendingBuffers) {
        this.pendingBuffers = pendingBuffers;
    }

    public Integer getTotalRegularBuffers() {
        return totalRegularBuffers;
    }

    public void setTotalRegularBuffers(Integer totalRegularBuffers) {
        this.totalRegularBuffers = totalRegularBuffers;
    }

    public Long getRegularBufferSize() {
        return regularBufferSize;
    }

    public void setRegularBufferSize(Long regularBufferSize) {
        this.regularBufferSize = regularBufferSize;
    }

    public Integer getTotalLargeBuffers() {
        return totalLargeBuffers;
    }

    public void setTotalLargeBuffers(Integer totalLargeBuffers) {
        this.totalLargeBuffers = totalLargeBuffers;
    }

    public Long getLargeBufferSize() {
        return largeBufferSize;
    }

    public void setLargeBufferSize(Long largeBufferSize) {
        this.largeBufferSize = largeBufferSize;
    }

    public Long getTotalBufferSize() {
        return totalBufferSize;
    }

    public void setTotalBufferSize(Long totalBufferSize) {
        this.totalBufferSize = totalBufferSize;
    }

    public Integer getBufferPolicyFlags() {
        return bufferPolicyFlags;
    }

    public void setBufferPolicyFlags(Integer bufferPolicyFlags) {
        this.bufferPolicyFlags = bufferPolicyFlags;
    }

    public String getBufferPolicyDesc() {
        return bufferPolicyDesc;
    }

    public void setBufferPolicyDesc(String bufferPolicyDesc) {
        this.bufferPolicyDesc = bufferPolicyDesc == null ? null : bufferPolicyDesc.trim();
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public String getFlagDesc() {
        return flagDesc;
    }

    public void setFlagDesc(String flagDesc) {
        this.flagDesc = flagDesc == null ? null : flagDesc.trim();
    }

    public Integer getDroppedEventCount() {
        return droppedEventCount;
    }

    public void setDroppedEventCount(Integer droppedEventCount) {
        this.droppedEventCount = droppedEventCount;
    }

    public Integer getDroppedBufferCount() {
        return droppedBufferCount;
    }

    public void setDroppedBufferCount(Integer droppedBufferCount) {
        this.droppedBufferCount = droppedBufferCount;
    }

    public Integer getBlockedEventFireTime() {
        return blockedEventFireTime;
    }

    public void setBlockedEventFireTime(Integer blockedEventFireTime) {
        this.blockedEventFireTime = blockedEventFireTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLargestEventDroppedSize() {
        return largestEventDroppedSize;
    }

    public void setLargestEventDroppedSize(Integer largestEventDroppedSize) {
        this.largestEventDroppedSize = largestEventDroppedSize;
    }

    public String getSessionSource() {
        return sessionSource;
    }

    public void setSessionSource(String sessionSource) {
        this.sessionSource = sessionSource == null ? null : sessionSource.trim();
    }

    public byte[] getAddress() {
        return address;
    }

    public void setAddress(byte[] address) {
        this.address = address;
    }
}