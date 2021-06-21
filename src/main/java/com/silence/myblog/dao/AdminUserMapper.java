package com.silence.myblog.dao;

import com.silence.myblog.entity.AdminUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : AdminUserMapper
 * @Author : Silence
 * @Date: 2021/6/14 18:38
 * @Description :
 */
@Mapper
public interface AdminUserMapper {
    /**
     * 插入管理员用户
     * @param record 管理员用户对象
     * @return 插入成功返回1，否则返回0
     */
    int insert(AdminUser record);

    /**
     * 插入管理员用户，不要求每个字段都有值，即选择性插入
     * @param record 管理员用户对象
     * @return 插入成功返回1，否则返回0
     */
    int insertSelective(AdminUser record);

    /**
     * 用户名密码登录
     * @param userName 用户登录名
     * @param password 用户登陆密码
     * @return 管理员用户对象
     */
    AdminUser login(@Param("userName") String userName, @Param("password") String password);

    /**
     * 根据主码查询管理员用户
     * @param adminUserId 用户id
     * @return 管理员用户对象
     */
    AdminUser selectByPrimaryKey(Integer adminUserId);

    /**
     * 有选择性地更新特定用户的字段
     * @param record 管理员用户对象
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKeySelective(AdminUser record);

    /**
     * 更新用户
     * @param record 管理员用户对象
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKey(AdminUser record);
}
