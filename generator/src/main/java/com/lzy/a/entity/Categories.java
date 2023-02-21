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
@TableName("categories")
public class Categories implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("categoryname")
    private String categoryname;

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    @Override
    public String toString() {
        return "Categories{" +
            "categoryname = " + categoryname +
        "}";
    }
}
