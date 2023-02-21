package com.lzy.a.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lzy
 * @since 2023-02-21
 */
@TableName("belikecomment")
public class Belikecomment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer cid;

    private Integer commentid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    @Override
    public String toString() {
        return "Belikecomment{" +
            "cid = " + cid +
            ", commentid = " + commentid +
        "}";
    }
}
