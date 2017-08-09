package top.acyone.model.entity;

import java.util.Date;

public class CategoryChildren {
    private Integer ccId;

    private Integer cpId;

    private String ccName;

    private String ccIcon;

    private String ccDescription;

    private Integer isdelete;

    private Date creationDate;

    private Integer sequenceNumber;

    public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        this.ccId = ccId;
    }

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName == null ? null : ccName.trim();
    }

    public String getCcIcon() {
        return ccIcon;
    }

    public void setCcIcon(String ccIcon) {
        this.ccIcon = ccIcon == null ? null : ccIcon.trim();
    }

    public String getCcDescription() {
        return ccDescription;
    }

    public void setCcDescription(String ccDescription) {
        this.ccDescription = ccDescription == null ? null : ccDescription.trim();
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