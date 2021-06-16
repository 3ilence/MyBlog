package com.silence.myblog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName : BlogConfig
 * @Author : Silence
 * @Date: 2021/6/14 18:16
 * @Description : 博客设置的实体类
 */
@Data
public class BlogConfig {
    /**设置名*/
    private String configName;

    /**设置值*/
    private String configValue;

    /**创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;
}
