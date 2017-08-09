package top.acyone.model.entity;

import java.util.Date;

public class CouponMessage {
    private Integer couponId;

    private String vendorId;

    private Integer preferentialWay;

    private String preferentialStrength;

    private Integer couponValidity;

    private Integer couponQuantityIssued;

    private Date afterRecivingClosingDate;

    private Date afterUsingClosingDate;

    private String couponApplicationRange;

    private Integer isdelete;

    private Date creationDate;

    private Integer sequenceNumber;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId == null ? null : vendorId.trim();
    }

    public Integer getPreferentialWay() {
        return preferentialWay;
    }

    public void setPreferentialWay(Integer preferentialWay) {
        this.preferentialWay = preferentialWay;
    }

    public String getPreferentialStrength() {
        return preferentialStrength;
    }

    public void setPreferentialStrength(String preferentialStrength) {
        this.preferentialStrength = preferentialStrength == null ? null : preferentialStrength.trim();
    }

    public Integer getCouponValidity() {
        return couponValidity;
    }

    public void setCouponValidity(Integer couponValidity) {
        this.couponValidity = couponValidity;
    }

    public Integer getCouponQuantityIssued() {
        return couponQuantityIssued;
    }

    public void setCouponQuantityIssued(Integer couponQuantityIssued) {
        this.couponQuantityIssued = couponQuantityIssued;
    }

    public Date getAfterRecivingClosingDate() {
        return afterRecivingClosingDate;
    }

    public void setAfterRecivingClosingDate(Date afterRecivingClosingDate) {
        this.afterRecivingClosingDate = afterRecivingClosingDate;
    }

    public Date getAfterUsingClosingDate() {
        return afterUsingClosingDate;
    }

    public void setAfterUsingClosingDate(Date afterUsingClosingDate) {
        this.afterUsingClosingDate = afterUsingClosingDate;
    }

    public String getCouponApplicationRange() {
        return couponApplicationRange;
    }

    public void setCouponApplicationRange(String couponApplicationRange) {
        this.couponApplicationRange = couponApplicationRange == null ? null : couponApplicationRange.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
}