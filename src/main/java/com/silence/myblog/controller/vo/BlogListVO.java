package com.silence.myblog.controller.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName : BlogListVO
 * @Author : Silence
 * @Date: 2021/6/17 15:49
 * @Description :
 */
@Data
public class BlogListVO implements Serializable {
    /**博客id*/
    private Long blogId;

    /**标题*/
    private String blogTitle;

    /**子url*/
    private String blogSubUrl;

    /**博客封面*/
    private String blogCoverImage;

    /**博客分类id*/
    private Integer blogCategoryId;

    /**博客分类图标*/
    private String blogCategoryIcon;

    /**博客分类名*/
    private String blogCategoryName;

    /**创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;
}
