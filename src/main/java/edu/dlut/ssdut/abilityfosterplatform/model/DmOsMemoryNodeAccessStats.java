package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsMemoryNodeAccessStats {
    private Integer localNode;

    private Integer remoteNode;

    private String pageClass;

    private Long readCount;

    private Long writeCount;

    public Integer getLocalNode() {
        return localNode;
    }

    public void setLocalNode(Integer localNode) {
        this.localNode = localNode;
    }

    public Integer getRemoteNode() {
        return remoteNode;
    }

    public void setRemoteNode(Integer remoteNode) {
        this.remoteNode = remoteNode;
    }

    public String getPageClass() {
        return pageClass;
    }

    public void setPageClass(String pageClass) {
        this.pageClass = pageClass == null ? null : pageClass.trim();
    }

    public Long getReadCount() {
        return readCount;
    }

    public void setReadCount(Long readCount) {
        this.readCount = readCount;
    }

    public Long getWriteCount() {
        return writeCount;
    }

    public void setWriteCount(Long writeCount) {
        this.writeCount = writeCount;
    }
}