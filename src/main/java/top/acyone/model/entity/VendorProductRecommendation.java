package top.acyone.model.entity;

import java.util.Date;

public class VendorProductRecommendation {
    private Integer reVendorProductId;

    private Integer vendorRecommendeId;

    private Integer productId;

    private Integer sequenceNumber;

    private Date promotionStartDate;

    private Date promotionEndDate;

    private Integer promotionStatus;

    private Date creationDate;

    private Integer isdelete;

    public Integer getReVendorProductId() {
        return reVendorProductId;
    }

    public void setReVendorProductId(Integer reVendorProductId) {
        this.reVendorProductId = reVendorProductId;
    }

    public Integer getVendorRecommendeId() {
        return vendorRecommendeId;
    }

    public void setVendorRecommendeId(Integer vendorRecommendeId) {
        this.vendorRecommendeId = vendorRecommendeId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Date getPromotionStartDate() {
        return promotionStartDate;
    }

    public void setPromotionStartDate(Date promotionStartDate) {
        this.promotionStartDate = promotionStartDate;
    }

    public Date getPromotionEndDate() {
        return promotionEndDate;
    }

    public void setPromotionEndDate(Date promotionEndDate) {
        this.promotionEndDate = promotionEndDate;
    }

    public Integer getPromotionStatus() {
        return promotionStatus;
    }

    public void setPromotionStatus(Integer promotionStatus) {
        this.promotionStatus = promotionStatus;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}