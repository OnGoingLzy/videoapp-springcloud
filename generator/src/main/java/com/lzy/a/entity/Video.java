package com.lzy.a.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author lzy
 * @since 2023-02-21
 */
@TableName("video")
public class Video implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer videoid;


    private Integer authorid;


    private String videoname;


    private String videopath;


    private Double videoseconds;

    /**
     * 视频封面
     */

    private String coverpath;


    private Integer likescount;

    /**
     * 视频状态: 1审核 2发布中
     */

    private Integer status;


    private LocalDateTime createtime;

    /**
     * 标签
     */

    private String tag;

    /**
     * 类别
     */

    private String category;


    private String description;

    public Integer getVideoid() {
        return videoid;
    }

    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname;
    }

    public String getVideopath() {
        return videopath;
    }

    public void setVideopath(String videopath) {
        this.videopath = videopath;
    }

    public Double getVideoseconds() {
        return videoseconds;
    }

    public void setVideoseconds(Double videoseconds) {
        this.videoseconds = videoseconds;
    }

    public String getCoverpath() {
        return coverpath;
    }

    public void setCoverpath(String coverpath) {
        this.coverpath = coverpath;
    }

    public Integer getLikescount() {
        return likescount;
    }

    public void setLikescount(Integer likescount) {
        this.likescount = likescount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Video{" +
            "videoid = " + videoid +
            ", authorid = " + authorid +
            ", videoname = " + videoname +
            ", videopath = " + videopath +
            ", videoseconds = " + videoseconds +
            ", coverpath = " + coverpath +
            ", likescount = " + likescount +
            ", status = " + status +
            ", createtime = " + createtime +
            ", tag = " + tag +
            ", category = " + category +
            ", description = " + description +
        "}";
    }
}
