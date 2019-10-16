package edu.dlut.ssdut.abilityfosterplatform.model;

public class SpatialIndexTessellations {
    private Integer objectId;

    private Integer indexId;

    private String tessellationScheme;

    private Double boundingBoxXmin;

    private Double boundingBoxYmin;

    private Double boundingBoxXmax;

    private Double boundingBoxYmax;

    private Short level1Grid;

    private String level1GridDesc;

    private Short level2Grid;

    private String level2GridDesc;

    private Short level3Grid;

    private String level3GridDesc;

    private Short level4Grid;

    private String level4GridDesc;

    private Integer cellsPerObject;

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

    public String getTessellationScheme() {
        return tessellationScheme;
    }

    public void setTessellationScheme(String tessellationScheme) {
        this.tessellationScheme = tessellationScheme == null ? null : tessellationScheme.trim();
    }

    public Double getBoundingBoxXmin() {
        return boundingBoxXmin;
    }

    public void setBoundingBoxXmin(Double boundingBoxXmin) {
        this.boundingBoxXmin = boundingBoxXmin;
    }

    public Double getBoundingBoxYmin() {
        return boundingBoxYmin;
    }

    public void setBoundingBoxYmin(Double boundingBoxYmin) {
        this.boundingBoxYmin = boundingBoxYmin;
    }

    public Double getBoundingBoxXmax() {
        return boundingBoxXmax;
    }

    public void setBoundingBoxXmax(Double boundingBoxXmax) {
        this.boundingBoxXmax = boundingBoxXmax;
    }

    public Double getBoundingBoxYmax() {
        return boundingBoxYmax;
    }

    public void setBoundingBoxYmax(Double boundingBoxYmax) {
        this.boundingBoxYmax = boundingBoxYmax;
    }

    public Short getLevel1Grid() {
        return level1Grid;
    }

    public void setLevel1Grid(Short level1Grid) {
        this.level1Grid = level1Grid;
    }

    public String getLevel1GridDesc() {
        return level1GridDesc;
    }

    public void setLevel1GridDesc(String level1GridDesc) {
        this.level1GridDesc = level1GridDesc == null ? null : level1GridDesc.trim();
    }

    public Short getLevel2Grid() {
        return level2Grid;
    }

    public void setLevel2Grid(Short level2Grid) {
        this.level2Grid = level2Grid;
    }

    public String getLevel2GridDesc() {
        return level2GridDesc;
    }

    public void setLevel2GridDesc(String level2GridDesc) {
        this.level2GridDesc = level2GridDesc == null ? null : level2GridDesc.trim();
    }

    public Short getLevel3Grid() {
        return level3Grid;
    }

    public void setLevel3Grid(Short level3Grid) {
        this.level3Grid = level3Grid;
    }

    public String getLevel3GridDesc() {
        return level3GridDesc;
    }

    public void setLevel3GridDesc(String level3GridDesc) {
        this.level3GridDesc = level3GridDesc == null ? null : level3GridDesc.trim();
    }

    public Short getLevel4Grid() {
        return level4Grid;
    }

    public void setLevel4Grid(Short level4Grid) {
        this.level4Grid = level4Grid;
    }

    public String getLevel4GridDesc() {
        return level4GridDesc;
    }

    public void setLevel4GridDesc(String level4GridDesc) {
        this.level4GridDesc = level4GridDesc == null ? null : level4GridDesc.trim();
    }

    public Integer getCellsPerObject() {
        return cellsPerObject;
    }

    public void setCellsPerObject(Integer cellsPerObject) {
        this.cellsPerObject = cellsPerObject;
    }
}