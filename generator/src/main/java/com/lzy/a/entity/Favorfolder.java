package com.lzy.a.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("favorfolder")
public class Favorfolder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ffolderid;

    private String ffoldername;


    private Integer ownerid;


    private String introduction;

    /**
     * 权限 1公开2私密
     */

    private Integer limit;

    public Integer getFfolderid() {
        return ffolderid;
    }

    public void setFfolderid(Integer ffolderid) {
        this.ffolderid = ffolderid;
    }

    public String getFfoldername() {
        return ffoldername;
    }

    public void setFfoldername(String ffoldername) {
        this.ffoldername = ffoldername;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Favorfolder{" +
            "ffolderid = " + ffolderid +
            ", ffoldername = " + ffoldername +
            ", ownerid = " + ownerid +
            ", introduction = " + introduction +
            ", limit = " + limit +
        "}";
    }
}
