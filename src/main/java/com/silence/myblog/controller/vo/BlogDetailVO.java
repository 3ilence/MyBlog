package com.silence.myblog.controller.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @ClassName : BlogDetailVO
 * @Author : Silence
 * @Date: 2021/6/17 15:49
 * @Description :
 */
@Data
public class BlogDetailVO {
    /**博客id*/
    private Long blogId;

    /**标题*/
    private String blogTitle;

    /**种类id*/
    private Integer blogCategoryId;

    /**评论数*/
    private Integer commentCount;

    /**类别的图标*/
    private String blogCategoryIcon;

    /**博客类别名*/
    private String blogCategoryName;

    /**博客封面*/
    private String blogCoverImage;

    /**博客视图*/
    private Long blogViews;

    /**博客标签*/
    private List<String> blogTags;

    /**博客内容*/
    private String blogContent;

    /**是否允许评论*/
    private Byte enableComment;

    /**创建时间*/
    private Date createTime;
}
