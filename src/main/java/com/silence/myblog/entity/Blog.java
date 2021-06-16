package com.silence.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName : Blog
 * @Author : Silence
 * @Date: 2021/6/14 18:15
 * @Description : 博客实体类
 */
@Data
public class Blog {
    /**id，主码*/
    private Long blogId;

    /**标题*/
    private String blogTitle;

    /**url*/
    private String blogSubUrl;

    /**封面*/
    private String blogCoverImage;

    /**博客分类id*/
    private Integer blogCategoryId;

    /**博客分类名*/
    private String blogCategoryName;

    /**博客标签*/
    private String blogTags;

    /***/
    private Byte blogStatus;

    /***/
    private Long blogViews;

    /**是否允许评论*/
    private Byte enableComment;

    /**是否被删除*/
    private Byte isDeleted;

    /**创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**更新时间*/
    private Date updateTime;

    /**内容*/
    private String blogContent;
}

