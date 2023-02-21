package com.lzy.a.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("usermsgimg")
public class Usermsgimg implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer cid;


    private String avatarName;


    private String bkgName;


    private String cname;


    private String introduction;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getAvatarName() {
        return avatarName;
    }

    public void setAvatarName(String avatarName) {
        this.avatarName = avatarName;
    }

    public String getBkgName() {
        return bkgName;
    }

    public void setBkgName(String bkgName) {
        this.bkgName = bkgName;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "Usermsgimg{" +
            "cid = " + cid +
            ", avatarName = " + avatarName +
            ", bkgName = " + bkgName +
            ", cname = " + cname +
            ", introduction = " + introduction +
        "}";
    }
}
