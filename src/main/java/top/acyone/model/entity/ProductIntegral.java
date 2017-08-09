package top.acyone.model.entity;

import java.util.Date;

public class ProductIntegral {
    private Integer integralId;

    private String vendorId;

    private String integralName;

    private Integer integral;

    private Integer isonline;

    private Integer isdelete;

    private Date creationDate;

    private String integralCover;

    private String integralDvbtxt;

    public Integer getIntegralId() {
        return integralId;
    }

    public void setIntegralId(Integer integralId) {
        this.integralId = integralId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId == null ? null : vendorId.trim();
    }

    public String getIntegralName() {
        return integralName;
    }

    public void setIntegralName(String integralName) {
        this.integralName = integralName == null ? null : integralName.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
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

    public String getIntegralCover() {
        return integralCover;
    }

    public void setIntegralCover(String integralCover) {
        this.integralCover = integralCover == null ? null : integralCover.trim();
    }

    public String getIntegralDvbtxt() {
        return integralDvbtxt;
    }

    public void setIntegralDvbtxt(String integralDvbtxt) {
        this.integralDvbtxt = integralDvbtxt == null ? null : integralDvbtxt.trim();
    }
}