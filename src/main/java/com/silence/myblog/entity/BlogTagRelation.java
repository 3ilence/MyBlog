package com.silence.myblog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName : BlogTagRelation
 * @Author : Silence
 * @Date: 2021/6/14 18:17
 * @Description :博客和标签之间的关系的实体类
 */
@Data
public class BlogTagRelation {
    /**关系id，主码*/
    private Long relationId;

    /**关系中的博客id*/
    private Long blogId;

    /**关系中的标签id*/
    private Integer tagId;

    /**创建时间*/
    private Date createTime;
}
