package top.acyone.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class LogisticsTemplate {
    private Integer templateId;

    private Integer companyId;

    private String vendorId;

    private Double ykg;

    private BigDecimal ykgPrice;

    private Double ckg;

    private BigDecimal ckgPrice;

    private String templateArea;

    private Date creationDate;

    private Integer isdelete;

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId == null ? null : vendorId.trim();
    }

    public Double getYkg() {
        return ykg;
    }

    public void setYkg(Double ykg) {
        this.ykg = ykg;
    }

    public BigDecimal getYkgPrice() {
        return ykgPrice;
    }

    public void setYkgPrice(BigDecimal ykgPrice) {
        this.ykgPrice = ykgPrice;
    }

    public Double getCkg() {
        return ckg;
    }

    public void setCkg(Double ckg) {
        this.ckg = ckg;
    }

    public BigDecimal getCkgPrice() {
        return ckgPrice;
    }

    public void setCkgPrice(BigDecimal ckgPrice) {
        this.ckgPrice = ckgPrice;
    }

    public String getTemplateArea() {
        return templateArea;
    }

    public void setTemplateArea(String templateArea) {
        this.templateArea = templateArea == null ? null : templateArea.trim();
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