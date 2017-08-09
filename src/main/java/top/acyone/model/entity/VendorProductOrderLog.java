package top.acyone.model.entity;

import java.util.Date;

public class VendorProductOrderLog {
    private Integer orderLogId;

    private Integer orderId;

    private String openid;

    private String vendorId;

    private String logDescription;

    private Date creationDate;

    private Integer isdelete;

    public Integer getOrderLogId() {
        return orderLogId;
    }

    public void setOrderLogId(Integer orderLogId) {
        this.orderLogId = orderLogId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public String getLogDescription() {
        return logDescription;
    }

    public void setLogDescription(String logDescription) {
        this.logDescription = logDescription == null ? null : logDescription.trim();
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