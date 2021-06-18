package com.silence.myblog.controller.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName : SimpleBlogListVO
 * @Author : Silence
 * @Date: 2021/6/17 15:50
 * @Description :
 */
@Data
public class SimpleBlogListVO implements Serializable {
    private Long blogId;

    private String blogTitle;
}
