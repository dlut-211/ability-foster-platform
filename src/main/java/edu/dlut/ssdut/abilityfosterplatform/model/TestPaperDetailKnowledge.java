package edu.dlut.ssdut.abilityfosterplatform.model;

import java.math.BigDecimal;
import java.util.Date;

public class TestPaperDetailKnowledge {
    private Integer id;

    private Integer testPaperDetailId;

    private Integer knowledgeId;

    private BigDecimal weight;

    private Integer createdBy;

    private Date createdOn;

    private Integer modifiedBy;

    private Date modifiedOn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestPaperDetailId() {
        return testPaperDetailId;
    }

    public void setTestPaperDetailId(Integer testPaperDetailId) {
        this.testPaperDetailId = testPaperDetailId;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}