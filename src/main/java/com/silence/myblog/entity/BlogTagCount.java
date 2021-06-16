package com.silence.myblog.entity;

import lombok.Data;

/**
 * @ClassName : BlogTagCount
 * @Author : Silence
 * @Date: 2021/6/14 18:16
 * @Description :
 */
@Data
public class BlogTagCount {
    /***/
    private Integer tagId;

    /***/
    private String tagName;

    /***/
    private Integer tagCount;
}
