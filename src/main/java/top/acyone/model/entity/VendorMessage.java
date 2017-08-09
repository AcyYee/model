package top.acyone.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class VendorMessage {

    private String vendorId;

    private String vendorName;

    private String vendorLogo;

    private String vendorLocaton;

    private String vendorContacts;

    private String vendorContactNumber;

    private String vendorSpareContacts;

    private String vendorSpareContactNumber;

    private String vendorBankIdcard;

    private BigDecimal vendorRealTimeAmount;

    private BigDecimal vendorBusinessSales;

    private Date creationDate;

    private Integer vendorStatus;

    private Integer isdelete;

    private String vendorInspectionLocation;

    private Integer vendorSkin;

    private String vendorUsername;

    private String vendorPassword;

    private String vendorQrcode;

    private Integer isonline;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId == null ? null : vendorId.trim();
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    public String getVendorLogo() {
        return vendorLogo;
    }

    public void setVendorLogo(String vendorLogo) {
        this.vendorLogo = vendorLogo == null ? null : vendorLogo.trim();
    }

    public String getVendorLocaton() {
        return vendorLocaton;
    }

    public void setVendorLocaton(String vendorLocaton) {
        this.vendorLocaton = vendorLocaton == null ? null : vendorLocaton.trim();
    }

    public String getVendorContacts() {
        return vendorContacts;
    }

    public void setVendorContacts(String vendorContacts) {
        this.vendorContacts = vendorContacts == null ? null : vendorContacts.trim();
    }

    public String getVendorContactNumber() {
        return vendorContactNumber;
    }

    public void setVendorContactNumber(String vendorContactNumber) {
        this.vendorContactNumber = vendorContactNumber == null ? null : vendorContactNumber.trim();
    }

    public String getVendorSpareContacts() {
        return vendorSpareContacts;
    }

    public void setVendorSpareContacts(String vendorSpareContacts) {
        this.vendorSpareContacts = vendorSpareContacts == null ? null : vendorSpareContacts.trim();
    }

    public String getVendorSpareContactNumber() {
        return vendorSpareContactNumber;
    }

    public void setVendorSpareContactNumber(String vendorSpareContactNumber) {
        this.vendorSpareContactNumber = vendorSpareContactNumber == null ? null : vendorSpareContactNumber.trim();
    }

    public String getVendorBankIdcard() {
        return vendorBankIdcard;
    }

    public void setVendorBankIdcard(String vendorBankIdcard) {
        this.vendorBankIdcard = vendorBankIdcard == null ? null : vendorBankIdcard.trim();
    }

    public BigDecimal getVendorRealTimeAmount() {
        return vendorRealTimeAmount;
    }

    public void setVendorRealTimeAmount(BigDecimal vendorRealTimeAmount) {
        this.vendorRealTimeAmount = vendorRealTimeAmount;
    }

    public BigDecimal getVendorBusinessSales() {
        return vendorBusinessSales;
    }

    public void setVendorBusinessSales(BigDecimal vendorBusinessSales) {
        this.vendorBusinessSales = vendorBusinessSales;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getVendorStatus() {
        return vendorStatus;
    }

    public void setVendorStatus(Integer vendorStatus) {
        this.vendorStatus = vendorStatus;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public String getVendorInspectionLocation() {
        return vendorInspectionLocation;
    }

    public void setVendorInspectionLocation(String vendorInspectionLocation) {
        this.vendorInspectionLocation = vendorInspectionLocation == null ? null : vendorInspectionLocation.trim();
    }

    public Integer getVendorSkin() {
        return vendorSkin;
    }

    public void setVendorSkin(Integer vendorSkin) {
        this.vendorSkin = vendorSkin;
    }

    public String getVendorUsername() {
        return vendorUsername;
    }

    public void setVendorUsername(String vendorUsername) {
        this.vendorUsername = vendorUsername == null ? null : vendorUsername.trim();
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword == null ? null : vendorPassword.trim();
    }

    public String getVendorQrcode() {
        return vendorQrcode;
    }

    public void setVendorQrcode(String vendorQrcode) {
        this.vendorQrcode = vendorQrcode == null ? null : vendorQrcode.trim();
    }

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }

}