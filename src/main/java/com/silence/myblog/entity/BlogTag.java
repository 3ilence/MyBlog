package com.silence.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName : BlogTag
 * @Author : Silence
 * @Date: 2021/6/14 18:16
 * @Description : 博客标签的实体类
 */
@Data
public class BlogTag {
    /**标签id，主码*/
    private Integer tagId;

    /**标签名*/
    private String tagName;

    /**是否删除*/
    private Byte isDeleted;

    /**创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}
