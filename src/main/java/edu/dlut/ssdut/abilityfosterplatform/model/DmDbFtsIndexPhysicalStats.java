package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmDbFtsIndexPhysicalStats {
    private Integer objectId;

    private Long fulltextIndexPageCount;

    private Long keyphraseIndexPageCount;

    private Long similarityIndexPageCount;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Long getFulltextIndexPageCount() {
        return fulltextIndexPageCount;
    }

    public void setFulltextIndexPageCount(Long fulltextIndexPageCount) {
        this.fulltextIndexPageCount = fulltextIndexPageCount;
    }

    public Long getKeyphraseIndexPageCount() {
        return keyphraseIndexPageCount;
    }

    public void setKeyphraseIndexPageCount(Long keyphraseIndexPageCount) {
        this.keyphraseIndexPageCount = keyphraseIndexPageCount;
    }

    public Long getSimilarityIndexPageCount() {
        return similarityIndexPageCount;
    }

    public void setSimilarityIndexPageCount(Long similarityIndexPageCount) {
        this.similarityIndexPageCount = similarityIndexPageCount;
    }
}