package top.acyone.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RequirementMessage {
    private Integer requirementId;

    private BigDecimal expectedPrice;

    private BigDecimal requirementArea;

    private String requirementContacts;

    private String requirementContactNumber;

    private String requriementDescription;

    private String requirementTitle;

    private String requirementParameter;

    private Integer readers;

    private Integer isdelete;

    private Date creationDate;

    private Integer sequenceNumber;

    private Date durationValidity;

    private Integer requirementStatus;

    private String openid;

    private BigDecimal requirementPrice;

    private Integer payStatus;

    private String deliveryArea;

    public Integer getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(Integer requirementId) {
        this.requirementId = requirementId;
    }

    public BigDecimal getExpectedPrice() {
        return expectedPrice;
    }

    public void setExpectedPrice(BigDecimal expectedPrice) {
        this.expectedPrice = expectedPrice;
    }

    public BigDecimal getRequirementArea() {
        return requirementArea;
    }

    public void setRequirementArea(BigDecimal requirementArea) {
        this.requirementArea = requirementArea;
    }

    public String getRequirementContacts() {
        return requirementContacts;
    }

    public void setRequirementContacts(String requirementContacts) {
        this.requirementContacts = requirementContacts == null ? null : requirementContacts.trim();
    }

    public String getRequirementContactNumber() {
        return requirementContactNumber;
    }

    public void setRequirementContactNumber(String requirementContactNumber) {
        this.requirementContactNumber = requirementContactNumber == null ? null : requirementContactNumber.trim();
    }

    public String getRequriementDescription() {
        return requriementDescription;
    }

    public void setRequriementDescription(String requriementDescription) {
        this.requriementDescription = requriementDescription == null ? null : requriementDescription.trim();
    }

    public String getRequirementTitle() {
        return requirementTitle;
    }

    public void setRequirementTitle(String requirementTitle) {
        this.requirementTitle = requirementTitle == null ? null : requirementTitle.trim();
    }

    public String getRequirementParameter() {
        return requirementParameter;
    }

    public void setRequirementParameter(String requirementParameter) {
        this.requirementParameter = requirementParameter == null ? null : requirementParameter.trim();
    }

    public Integer getReaders() {
        return readers;
    }

    public void setReaders(Integer readers) {
        this.readers = readers;
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

    public Date getDurationValidity() {
        return durationValidity;
    }

    public void setDurationValidity(Date durationValidity) {
        this.durationValidity = durationValidity;
    }

    public Integer getRequirementStatus() {
        return requirementStatus;
    }

    public void setRequirementStatus(Integer requirementStatus) {
        this.requirementStatus = requirementStatus;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public BigDecimal getRequirementPrice() {
        return requirementPrice;
    }

    public void setRequirementPrice(BigDecimal requirementPrice) {
        this.requirementPrice = requirementPrice;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getDeliveryArea() {
        return deliveryArea;
    }

    public void setDeliveryArea(String deliveryArea) {
        this.deliveryArea = deliveryArea == null ? null : deliveryArea.trim();
    }
}