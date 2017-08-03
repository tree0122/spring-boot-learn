package com.tree.spring.boot.model;

public class BikeBatchDO {
    private Integer id;

    private String bikeId;

    private Integer type;

    private Integer detailId;

    private Integer positionOutId;

    private Integer positionInId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBikeId() {
        return bikeId;
    }

    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getPositionOutId() {
        return positionOutId;
    }

    public void setPositionOutId(Integer positionOutId) {
        this.positionOutId = positionOutId;
    }

    public Integer getPositionInId() {
        return positionInId;
    }

    public void setPositionInId(Integer positionInId) {
        this.positionInId = positionInId;
    }
}