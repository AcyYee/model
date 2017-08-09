package top.acyone.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class VendorRequirementOrder {
    private Integer orderId;

    private Integer requirementId;

    private String openid;

    private String vendorId;

    private Integer templateId;

    private BigDecimal deliveryPrice;

    private BigDecimal requirementTotalPrice;

    private BigDecimal requirementArea;

    private BigDecimal orderTotalPrice;

    private Integer orderStatus;

    private Integer isdelete;

    private Date creationDate;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(Integer requirementId) {
        this.requirementId = requirementId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId == null ? null : vendorId.trim();
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public BigDecimal getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(BigDecimal deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public BigDecimal getRequirementTotalPrice() {
        return requirementTotalPrice;
    }

    public void setRequirementTotalPrice(BigDecimal requirementTotalPrice) {
        this.requirementTotalPrice = requirementTotalPrice;
    }

    public BigDecimal getRequirementArea() {
        return requirementArea;
    }

    public void setRequirementArea(BigDecimal requirementArea) {
        this.requirementArea = requirementArea;
    }

    public BigDecimal getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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
}