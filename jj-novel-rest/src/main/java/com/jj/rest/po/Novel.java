package com.jj.rest.po;

import java.util.Date;

/**
 * 小说表
 * @author sh-shitt7
 * Created by sh-shitt7 on 2018/07/03
 */
public class Novel {
    private Integer id;

    private String novelUuid;

    /**
     * 小说名
     */
    private String novelName;

    /**
     * 作者
     */
    private String autor;

    /**
     * 分类
     */
    private String category;

    /**
     * 封面
     */
    private String imgUrl;

    /**
     * 最新章节
     */
    private String lastchapter;

    /**
     * 章节数
     */
    private Integer chapters;

    /**
     * 字数
     */
    private Integer size;

    /**
     * 最后更新时间
     */
    private Date lastupdate;

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

    /**
     * 简介
     */
    private String intro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNovelUuid() {
        return novelUuid;
    }

    public void setNovelUuid(String novelUuid) {
        this.novelUuid = novelUuid == null ? null : novelUuid.trim();
    }

    public String getNovelName() {
        return novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName == null ? null : novelName.trim();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor == null ? null : autor.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getLastchapter() {
        return lastchapter;
    }

    public void setLastchapter(String lastchapter) {
        this.lastchapter = lastchapter == null ? null : lastchapter.trim();
    }

    public Integer getChapters() {
        return chapters;
    }

    public void setChapters(Integer chapters) {
        this.chapters = chapters;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }
}