package com.ysgj.food.platform.entity;

import java.util.Date;

public class DccpPage {
    private String pageId;

    private String pageName;

    private String shortUrl;

    private String publishUrl;

    private String editVersionId;

    private String publishVersionId;

    private Integer state;

    private String createUser;

    private Date createTime;

    private String lastUpdateUser;

    private Date lastUpdateTime;

    private String videoProdId;

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getPublishUrl() {
        return publishUrl;
    }

    public void setPublishUrl(String publishUrl) {
        this.publishUrl = publishUrl;
    }

    public String getEditVersionId() {
        return editVersionId;
    }

    public void setEditVersionId(String editVersionId) {
        this.editVersionId = editVersionId;
    }

    public String getPublishVersionId() {
        return publishVersionId;
    }

    public void setPublishVersionId(String publishVersionId) {
        this.publishVersionId = publishVersionId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getVideoProdId() {
        return videoProdId;
    }

    public void setVideoProdId(String videoProdId) {
        this.videoProdId = videoProdId;
    }

	@Override
	public String toString() {
		return "DccpPage [pageId=" + pageId + ", pageName=" + pageName + ", shortUrl=" + shortUrl + ", publishUrl="
				+ publishUrl + ", editVersionId=" + editVersionId + ", publishVersionId=" + publishVersionId
				+ ", state=" + state + ", createUser=" + createUser + ", createTime=" + createTime + ", lastUpdateUser="
				+ lastUpdateUser + ", lastUpdateTime=" + lastUpdateTime + ", videoProdId=" + videoProdId + "]";
	}
    
    
}