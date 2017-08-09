package top.acyone.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ProductMessage {
    private Integer productId;

    private String vendorId;

    private String productName;

    private String productSpec;

    private String productParameter;

    private BigDecimal productUnitPrice;

    private String productUnit;

    private Double productWeight;

    private String productCarousel;

    private Integer productSalesVolume;

    private Integer productStock;

    private Integer isdelete;

    private Integer isonline;

    private Integer sequenceNumber;

    private Date creationDate;

    private Integer ccId;

    private Integer brandId;

    private String productDvbtxt;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId == null ? null : vendorId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec == null ? null : productSpec.trim();
    }

    public String getProductParameter() {
        return productParameter;
    }

    public void setProductParameter(String productParameter) {
        this.productParameter = productParameter == null ? null : productParameter.trim();
    }

    public BigDecimal getProductUnitPrice() {
        return productUnitPrice;
    }

    public void setProductUnitPrice(BigDecimal productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public Double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(Double productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductCarousel() {
        return productCarousel;
    }

    public void setProductCarousel(String productCarousel) {
        this.productCarousel = productCarousel == null ? null : productCarousel.trim();
    }

    public Integer getProductSalesVolume() {
        return productSalesVolume;
    }

    public void setProductSalesVolume(Integer productSalesVolume) {
        this.productSalesVolume = productSalesVolume;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        this.ccId = ccId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getProductDvbtxt() {
        return productDvbtxt;
    }

    public void setProductDvbtxt(String productDvbtxt) {
        this.productDvbtxt = productDvbtxt == null ? null : productDvbtxt.trim();
    }
}