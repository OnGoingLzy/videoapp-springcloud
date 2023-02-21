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
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer cid;


    private String cname;


    private String email;


    private String cpwd;

    /**
     * 1.普通用户 2.vip用户 3.管理员
     */
    @TableField("ctype")
    private String ctype;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpwd() {
        return cpwd;
    }

    public void setCpwd(String cpwd) {
        this.cpwd = cpwd;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    @Override
    public String toString() {
        return "User{" +
            "cid = " + cid +
            ", cname = " + cname +
            ", email = " + email +
            ", cpwd = " + cpwd +
            ", ctype = " + ctype +
        "}";
    }
}
