package top.acyone.model.entity;

import java.util.Date;

public class CategoryParent {
    private Integer cpId;

    private String cpName;

    private String cpIcon;

    private String cpDescription;

    private Integer isdelete;

    private Date creationDate;

    private Integer sequenceNumber;

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName == null ? null : cpName.trim();
    }

    public String getCpIcon() {
        return cpIcon;
    }

    public void setCpIcon(String cpIcon) {
        this.cpIcon = cpIcon == null ? null : cpIcon.trim();
    }

    public String getCpDescription() {
        return cpDescription;
    }

    public void setCpDescription(String cpDescription) {
        this.cpDescription = cpDescription == null ? null : cpDescription.trim();
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