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
@TableName("allbecollected")
public class Allbecollected implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer collectedvideoid;

    private Integer folderid;

    public Integer getCollectedvideoid() {
        return collectedvideoid;
    }

    public void setCollectedvideoid(Integer collectedvideoid) {
        this.collectedvideoid = collectedvideoid;
    }

    public Integer getFolderid() {
        return folderid;
    }

    public void setFolderid(Integer folderid) {
        this.folderid = folderid;
    }

    @Override
    public String toString() {
        return "Allbecollected{" +
            "collectedvideoid = " + collectedvideoid +
            ", folderid = " + folderid +
        "}";
    }
}
