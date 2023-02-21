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
@TableName("preuploadvideo")
public class Preuploadvideo implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer cid;

    /**
     * 存放在后台的路径
     */

    private String videourl;

    /**
     * 上传状态
     */

    private String uploadstate;

    /**
     * 文件大小
     */
    @TableField("videosize")
    private String videosize;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public String getUploadstate() {
        return uploadstate;
    }

    public void setUploadstate(String uploadstate) {
        this.uploadstate = uploadstate;
    }

    public String getVideosize() {
        return videosize;
    }

    public void setVideosize(String videosize) {
        this.videosize = videosize;
    }

    @Override
    public String toString() {
        return "Preuploadvideo{" +
            "cid = " + cid +
            ", videourl = " + videourl +
            ", uploadstate = " + uploadstate +
            ", videosize = " + videosize +
        "}";
    }
}
