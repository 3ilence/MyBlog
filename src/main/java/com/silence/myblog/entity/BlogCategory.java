package com.silence.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName : BlogCategory
 * @Author : Silence
 * @Date: 2021/6/14 18:15
 * @Description : 博客类别的实体类
 */
@Data
public class BlogCategory {
    /**类别id，主码*/
    private Integer categoryId;

    /**类别名*/
    private String categoryName;

    /**图标*/
    private String categoryIcon;

    /**排名*/
    private Integer categoryRank;

    /**是否删除*/
    private Byte isDeleted;

    /**创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}
