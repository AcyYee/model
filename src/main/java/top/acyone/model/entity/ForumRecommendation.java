package top.acyone.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ForumRecommendation {
    private Integer forumRecommendeId;

    private String forumRecommendeName;

    private Integer forumRecommendeQuantity;

    private Integer sequenceNumber;

    private BigDecimal forumRecommendeUnitPrice;

    private String forumRecommendeUnit;

    private String forumRecommendeIcon;

    private String forumRecommendeCover;

    private String forumRecommendeDescription;

    private Integer isdelete;

    private Date creationDate;

    private Integer forumRecommendeShowStyle;

    public Integer getForumRecommendeId() {
        return forumRecommendeId;
    }

    public void setForumRecommendeId(Integer forumRecommendeId) {
        this.forumRecommendeId = forumRecommendeId;
    }

    public String getForumRecommendeName() {
        return forumRecommendeName;
    }

    public void setForumRecommendeName(String forumRecommendeName) {
        this.forumRecommendeName = forumRecommendeName == null ? null : forumRecommendeName.trim();
    }

    public Integer getForumRecommendeQuantity() {
        return forumRecommendeQuantity;
    }

    public void setForumRecommendeQuantity(Integer forumRecommendeQuantity) {
        this.forumRecommendeQuantity = forumRecommendeQuantity;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public BigDecimal getForumRecommendeUnitPrice() {
        return forumRecommendeUnitPrice;
    }

    public void setForumRecommendeUnitPrice(BigDecimal forumRecommendeUnitPrice) {
        this.forumRecommendeUnitPrice = forumRecommendeUnitPrice;
    }

    public String getForumRecommendeUnit() {
        return forumRecommendeUnit;
    }

    public void setForumRecommendeUnit(String forumRecommendeUnit) {
        this.forumRecommendeUnit = forumRecommendeUnit == null ? null : forumRecommendeUnit.trim();
    }

    public String getForumRecommendeIcon() {
        return forumRecommendeIcon;
    }

    public void setForumRecommendeIcon(String forumRecommendeIcon) {
        this.forumRecommendeIcon = forumRecommendeIcon == null ? null : forumRecommendeIcon.trim();
    }

    public String getForumRecommendeCover() {
        return forumRecommendeCover;
    }

    public void setForumRecommendeCover(String forumRecommendeCover) {
        this.forumRecommendeCover = forumRecommendeCover == null ? null : forumRecommendeCover.trim();
    }

    public String getForumRecommendeDescription() {
        return forumRecommendeDescription;
    }

    public void setForumRecommendeDescription(String forumRecommendeDescription) {
        this.forumRecommendeDescription = forumRecommendeDescription == null ? null : forumRecommendeDescription.trim();
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

    public Integer getForumRecommendeShowStyle() {
        return forumRecommendeShowStyle;
    }

    public void setForumRecommendeShowStyle(Integer forumRecommendeShowStyle) {
        this.forumRecommendeShowStyle = forumRecommendeShowStyle;
    }
}