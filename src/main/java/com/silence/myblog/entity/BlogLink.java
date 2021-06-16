package com.silence.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName : BlogLink
 * @Author : Silence
 * @Date: 2021/6/14 18:16
 * @Description :
 */
@Data
public class BlogLink {
    /***/
    private Integer linkId;

    /***/
    private Byte linkType;

    /***/
    private String linkName;

    /***/
    private String linkUrl;

    /***/
    private String linkDescription;

    /***/
    private Integer linkRank;

    /***/
    private Byte isDeleted;

    /***/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}
