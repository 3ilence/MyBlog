package com.silence.myblog.entity;

import lombok.Data;

/**
 * @ClassName : BlogTagCount
 * @Author : Silence
 * @Date: 2021/6/14 18:16
 * @Description : 标签的数量，即标签被博客引用次数
 */
@Data
public class BlogTagCount {
    /**标签id*/
    private Integer tagId;

    /**标签名*/
    private String tagName;

    /**标签被引用次数*/
    private Integer tagCount;
}
