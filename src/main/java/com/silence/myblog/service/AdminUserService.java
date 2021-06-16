package com.silence.myblog.service;

import com.silence.myblog.entity.AdminUser;

/**
 * @ClassName : AdminUserService
 * @Author : Silence
 * @Date: 2021/6/14 19:21
 * @Description :
 */
public interface AdminUserService {
    /**
     * 用户登陆
     * @param userName 用户登陆名
     * @param password 用户登陆密码
     * @return 管理员用户对象
     */
    AdminUser login(String userName, String password);

    /**
     * 获取用户信息
     * @param loginUserId 用户id
     * @return 管理员用户对象
     */
    AdminUser getUserDetailById(Integer loginUserId);

    /**
     * 修改当前登录用户的密码
     * @param loginUserId 用户id
     * @param originalPassword 原来的密码
     * @param newPassword 新密码
     * @return 修改成功与否
     */
    Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword);

    /**
     * 修改当前登录用户的名称信息
     * @param loginUserId 用户id
     * @param loginUserName 用户登陆名
     * @param nickName 昵称
     * @return 修改成功与否
     */
    Boolean updateName(Integer loginUserId, String loginUserName, String nickName);

}
