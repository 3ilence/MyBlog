package com.silence.myblog.entity;

import lombok.Data;

/**
 * @ClassName : AdminUser
 * @Author : Silence
 * @Date: 2021/6/14 18:15
 * @Description : 管理员类
 */
@Data
public class AdminUser {
    /**用户id，主码*/
    private Integer adminUserId;

    /**用户登录名*/
    private String loginUserName;

    /**用户登录密码*/
    private String loginPassword;

    /**用户昵称*/
    private String nickName;

    /***/
    private Byte locked;
}
