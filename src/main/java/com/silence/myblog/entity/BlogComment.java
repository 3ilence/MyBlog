package com.silence.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName : BlogComment
 * @Author : Silence
 * @Date: 2021/6/14 18:16
 * @Description : 博客下评论的实体类
 */
@Data
public class BlogComment {
    /**评论的id，主码*/
    private Long commentId;

    /**评论所在的博客的id*/
    private Long blogId;

    /**评论者*/
    private String commentator;

    /**评论者的邮箱*/
    private String email;

    /**评论所在网页的url*/
    private String websiteUrl;

    /**评论内容*/
    private String commentBody;

    /**评论时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date commentCreateTime;

    /**评论者ip*/
    private String commentatorIp;

    /**评论的回复内容*///这样写岂不是一个评论只能被回复一次
    private String replyBody;

    /**评论时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date replyCreateTime;

    /**评论状态，是否审核*/
    private Byte commentStatus;

    /**是否删除*/
    private Byte isDeleted;
}
