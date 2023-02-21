package com.lzy.a.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("belikesvideo")
public class Belikesvideo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer cid;

    private Integer videoid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getVideoid() {
        return videoid;
    }

    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    @Override
    public String toString() {
        return "Belikesvideo{" +
            "cid = " + cid +
            ", videoid = " + videoid +
        "}";
    }
}
