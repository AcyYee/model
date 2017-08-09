package top.acyone.model.entity;

import java.util.Date;

public class VendorRecommendation {
    private Integer vendorRecommendeId;

    private String vendorId;

    private String vendorRecommendeName;

    private Integer sequenceNumber;

    private Integer vendorRecommendeType;

    private Integer vendorRecommendeQuatity;

    private String vendorRecommendeIcon;

    private String vendorRecommendeCover;

    private Date creationDate;

    private String vendorRecommendeRemark;

    private Integer isdelete;

    public Integer getVendorRecommendeId() {
        return vendorRecommendeId;
    }

    public void setVendorRecommendeId(Integer vendorRecommendeId) {
        this.vendorRecommendeId = vendorRecommendeId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId == null ? null : vendorId.trim();
    }

    public String getVendorRecommendeName() {
        return vendorRecommendeName;
    }

    public void setVendorRecommendeName(String vendorRecommendeName) {
        this.vendorRecommendeName = vendorRecommendeName == null ? null : vendorRecommendeName.trim();
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Integer getVendorRecommendeType() {
        return vendorRecommendeType;
    }

    public void setVendorRecommendeType(Integer vendorRecommendeType) {
        this.vendorRecommendeType = vendorRecommendeType;
    }

    public Integer getVendorRecommendeQuatity() {
        return vendorRecommendeQuatity;
    }

    public void setVendorRecommendeQuatity(Integer vendorRecommendeQuatity) {
        this.vendorRecommendeQuatity = vendorRecommendeQuatity;
    }

    public String getVendorRecommendeIcon() {
        return vendorRecommendeIcon;
    }

    public void setVendorRecommendeIcon(String vendorRecommendeIcon) {
        this.vendorRecommendeIcon = vendorRecommendeIcon == null ? null : vendorRecommendeIcon.trim();
    }

    public String getVendorRecommendeCover() {
        return vendorRecommendeCover;
    }

    public void setVendorRecommendeCover(String vendorRecommendeCover) {
        this.vendorRecommendeCover = vendorRecommendeCover == null ? null : vendorRecommendeCover.trim();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getVendorRecommendeRemark() {
        return vendorRecommendeRemark;
    }

    public void setVendorRecommendeRemark(String vendorRecommendeRemark) {
        this.vendorRecommendeRemark = vendorRecommendeRemark == null ? null : vendorRecommendeRemark.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}