package edu.dlut.ssdut.abilityfosterplatform.model;

public class SelectiveXmlIndexNamespaces {
    private Integer objectId;

    private Integer indexId;

    private Boolean isDefaultUri;

    private String uri;

    private String prefix;

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

    public Boolean getIsDefaultUri() {
        return isDefaultUri;
    }

    public void setIsDefaultUri(Boolean isDefaultUri) {
        this.isDefaultUri = isDefaultUri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }
}