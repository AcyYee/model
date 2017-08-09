package top.acyone.model.entity;

import java.util.Date;

public class NoticeMessage {
    private Integer noticeId;

    private Integer vendorId;

    private String noticeTitle;

    private String noticeCover;

    private Integer isdelete;

    private Date creationDate;

    private String noticeLink;

    private String noticeDvbtxt;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeCover() {
        return noticeCover;
    }

    public void setNoticeCover(String noticeCover) {
        this.noticeCover = noticeCover == null ? null : noticeCover.trim();
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

    public String getNoticeLink() {
        return noticeLink;
    }

    public void setNoticeLink(String noticeLink) {
        this.noticeLink = noticeLink == null ? null : noticeLink.trim();
    }

    public String getNoticeDvbtxt() {
        return noticeDvbtxt;
    }

    public void setNoticeDvbtxt(String noticeDvbtxt) {
        this.noticeDvbtxt = noticeDvbtxt == null ? null : noticeDvbtxt.trim();
    }
}