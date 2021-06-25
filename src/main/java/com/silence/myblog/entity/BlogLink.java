package com.silence.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName : BlogLink
 * @Author : Silence
 * @Date: 2021/6/14 18:16
 * @Description : 友人链接实体类
 */
@Data
public class BlogLink {
    /**链接id*/
    private Integer linkId;

    /**链接类型*/
    private Byte linkType;

    /**链接名*/
    private String linkName;

    /**链接的Url*/
    private String linkUrl;

    /**链接的描述*/
    private String linkDescription;

    /**链接的排序值*/
    private Integer linkRank;

    /**是否删除链接*/
    private Byte isDeleted;

    /**链接创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}
