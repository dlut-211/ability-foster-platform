package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsBufferPoolExtensionConfiguration {
    private String path;

    private Integer fileId;

    private Integer state;

    private String stateDescription;

    private Long currentSizeInKb;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription == null ? null : stateDescription.trim();
    }

    public Long getCurrentSizeInKb() {
        return currentSizeInKb;
    }

    public void setCurrentSizeInKb(Long currentSizeInKb) {
        this.currentSizeInKb = currentSizeInKb;
    }
}