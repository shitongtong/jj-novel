package com.jj.rest.po;

import java.util.Date;

/**
 * 采集入口表
 * @author sh-shitt7
 * Created by sh-shitt7 on 2018/07/03
 */
public class CollectEntra {
    private Integer id;

    private String collectEntraUuid;

    /**
     * 采集的小说名
     */
    private String novelName;

    /**
     * 采集的站点名
     */
    private String collectWebsite;

    /**
     * 采集url
     */
    private String collectUrl;

    /**
     * 采集状态 0:待采集,1:采集中,2:采集完成,3:采集失败
     */
    private Integer collectStatus;

    /**
     * 通用状态 0:删除,1:正常
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人uuid
     */
    private String createUid;

    /**
     * 更新人uuid
     */
    private String updateUid;

    /**
     * 通用备注
     */
    private String remark;

    /**
     * 排序
     */
    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollectEntraUuid() {
        return collectEntraUuid;
    }

    public void setCollectEntraUuid(String collectEntraUuid) {
        this.collectEntraUuid = collectEntraUuid == null ? null : collectEntraUuid.trim();
    }

    public String getNovelName() {
        return novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName == null ? null : novelName.trim();
    }

    public String getCollectWebsite() {
        return collectWebsite;
    }

    public void setCollectWebsite(String collectWebsite) {
        this.collectWebsite = collectWebsite == null ? null : collectWebsite.trim();
    }

    public String getCollectUrl() {
        return collectUrl;
    }

    public void setCollectUrl(String collectUrl) {
        this.collectUrl = collectUrl == null ? null : collectUrl.trim();
    }

    public Integer getCollectStatus() {
        return collectStatus;
    }

    public void setCollectStatus(Integer collectStatus) {
        this.collectStatus = collectStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid == null ? null : createUid.trim();
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid == null ? null : updateUid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}