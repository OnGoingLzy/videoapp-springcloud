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
@TableName("comments")
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer commentid;

    private Integer videoid;

    /**
     * 评论人的id
     */
    private Integer cid;

    private String content;

    /**
     * 评论目标人的id，如果没有目标人，则该字段为空代表评论视频
     */
    @TableField("tocommentid")
    private Integer tocommentid;

    /**
     * 评论类型,1、评论内的回复。为空无意义
     */
    @TableField("commenttype")
    private String commenttype;

    @TableField("date")
    private LocalDateTime date;

    @TableField("belikecounts")
    private Integer belikecounts;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getVideoid() {
        return videoid;
    }

    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTocommentid() {
        return tocommentid;
    }

    public void setTocommentid(Integer tocommentid) {
        this.tocommentid = tocommentid;
    }

    public String getCommenttype() {
        return commenttype;
    }

    public void setCommenttype(String commenttype) {
        this.commenttype = commenttype;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getBelikecounts() {
        return belikecounts;
    }

    public void setBelikecounts(Integer belikecounts) {
        this.belikecounts = belikecounts;
    }

    @Override
    public String toString() {
        return "Comments{" +
            "commentid = " + commentid +
            ", videoid = " + videoid +
            ", cid = " + cid +
            ", content = " + content +
            ", tocommentid = " + tocommentid +
            ", commenttype = " + commenttype +
            ", date = " + date +
            ", belikecounts = " + belikecounts +
        "}";
    }
}
