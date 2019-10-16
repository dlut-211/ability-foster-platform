package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmIoClusterValidPathNames {
    private String pathName;

    private String clusterOwnerNode;

    private Boolean isClusterSharedVolume;

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName == null ? null : pathName.trim();
    }

    public String getClusterOwnerNode() {
        return clusterOwnerNode;
    }

    public void setClusterOwnerNode(String clusterOwnerNode) {
        this.clusterOwnerNode = clusterOwnerNode == null ? null : clusterOwnerNode.trim();
    }

    public Boolean getIsClusterSharedVolume() {
        return isClusterSharedVolume;
    }

    public void setIsClusterSharedVolume(Boolean isClusterSharedVolume) {
        this.isClusterSharedVolume = isClusterSharedVolume;
    }
}